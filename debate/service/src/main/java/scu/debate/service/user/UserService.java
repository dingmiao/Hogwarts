package scu.debate.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.debate.dao.DAO.UserDao;
import scu.debate.dao.entity.User;


@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String login(String account, String password) {
        User userDO = userDao.selectByAccount(account);
        if (null == userDO) {
            return "no such user!";
        }
        String truePassword = endcodePassword(account, password);
        if (!truePassword.equals(userDO.getPassword())) {
            return "password is wrong!";
        }
        return "success";
    }

    private String endcodePassword(String account ,String password) {
        return account + password.hashCode();
    }
}
