package scu.debate.web.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import scu.debate.dao.entity.Arguement;
import scu.debate.service.argument.ArgumentService;
import scu.debate.web.utils.ResultUtils;

@RestController
public class ArgumentController {
    @Autowired
    private ArgumentService argumentService;

    @RequestMapping("/1")
    public String test(){
        return ResultUtils.successMessage("connection success!") ;
    }

    @RequestMapping(value = "getRandomArgument",method = RequestMethod.GET)
    public String getRandomArgument() {
        Arguement arguement = argumentService.getRandomTopic();
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "题库没东西啊");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "getAllTopic", method = RequestMethod.GET)
    public String getAllTopic() {
        return ResultUtils.successMessage(JSONArray.toJSONString(argumentService.getAllArgument()));
    }

    @RequestMapping(value = "getArgumentByTopic",method = RequestMethod.GET)
    public String getRandomArgument(String category) {
        Arguement arguement = argumentService.getRandomTopicByCategory(category);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "题库没东西啊");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "addArgument", method = RequestMethod.POST)
    public String addArgument(String topic, String topicInfo, String category) {
        Arguement arguement = argumentService.addArgument(topic, topicInfo, category);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "已经有了");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "addArgumentDetail", method = RequestMethod.POST)
    public String addArgumentDetail(String topic, String topicInfo, String category, Integer recommendLevel, Integer exLevel) {
        Arguement arguement = argumentService.addArgumentDetail(topic, topicInfo, category,recommendLevel,exLevel);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "已经有了");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "updateArgument", method = RequestMethod.POST)
    public String updateArgument(String topic, String topicInfo, String category, Integer recommendLevel, Integer exLevel) {
        Arguement arguement = argumentService.updateArgument(topic, topicInfo, category,recommendLevel,exLevel);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "没这个题目");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "deleteArgument", method = RequestMethod.POST)
    public String deleteArgument(String topic) {
        Arguement arguement = argumentService.deleteArgumentByTopic(topic);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "没这个题目");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }
}
