package scu.debate.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import scu.debate.service.argument.ArgumentService;

@RestController
public class ArgumentController {
    @Autowired
    private ArgumentService argumentService;
    @RequestMapping("/1")
    public String test(){
        return "hhhh";
    }

    @RequestMapping(value = "getRandomArgument",method = RequestMethod.GET)
    public String getRandomArgument() {

        return "";
    }
    @RequestMapping(value = "getArgumentByTopic",method = RequestMethod.GET)
    public String getRandomArgueMent(String topic) {
        return argumentService.getArgumentByTopic(topic);
    }
    @RequestMapping(value = "addArgument", method = RequestMethod.POST)
    public String addArgument(String topic, String topicInfo, String category) {
        return argumentService.addArgument(topic, topicInfo, category);
    }
}
