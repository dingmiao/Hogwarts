package scu.debate.service.argument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.debate.dao.DAO.ArguementDao;
import scu.debate.dao.entity.Arguement;

import java.util.List;


@Service
public class ArgumentService extends  ArgumentBaseService {
    @Autowired
    private ArguementDao arguementDao;

    public List<Arguement> getArgumentListByCategory(String category, int limit){
        List<Arguement> argumentList = getArgumentListByCategory(category);
        if (argumentList.size() > limit) {
            for (int i = 0; i < limit - argumentList.size(); ++i) {
                argumentList.remove(argumentList.size() - i - 1);
            }
        }
        return argumentList;
    }

    public Arguement getRandomTopic() {
        return arguementDao.selectOneRandomArgument();
    }

    public Arguement getRandomTopicByCategory(String category) {
        return arguementDao.selectOneRandomArgumentByCategory(category);
    }
}
