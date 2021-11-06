package scu.debate.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import scu.debate.service.user.CookieService;
import scu.debate.service.user.UserService;
import scu.debate.web.utils.ResultUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private CookieService cookieService;

    private final String COOKIE_NAME = "token";

    @RequestMapping(value = "checkState", method = RequestMethod.GET)
    public String checkState(HttpServletRequest request) {
        return cookieService.checkState(request);
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String account, String password, HttpServletRequest request, HttpServletResponse response) {
        String log = userService.login(account, password);
        if (!"success".equals(log)) {
            return ResultUtils.errorMessage("success");
        }
        cookieService.addUser(account, response);
        return ResultUtils.successMessage("login success!");
    }
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        cookieService.userLogout(request);
        return  ResultUtils.successMessage("logout!");
    }

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String register(String phoneNum, String password) {
        // TODO
        return "";
    }
}
