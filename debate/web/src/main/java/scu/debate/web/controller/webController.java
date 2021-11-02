package scu.debate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class webController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String welcome(){
        return "index";
    }
    @RequestMapping(value = "/manage",method = RequestMethod.GET)
    public String manage(){
        return "manage";
    }
    @RequestMapping(value = "/addArgument",method = RequestMethod.GET)
    public String addArgument(){
        return "addArgument";
    }

}
