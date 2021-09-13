package com.hogwarts.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class argumentController {

    @RequestMapping(value = "getRandomArgue",method = RequestMethod.GET)
    public String getRandomArgueMent() {

        return "";
    }
    @RequestMapping(value = "addArgueMent", method = RequestMethod.POST)
    public String addArgueMent(String topic, String topicInfo, String category) {
        if (null == topic || topic.length() == 0) {

        }
        return null;
    }

}
