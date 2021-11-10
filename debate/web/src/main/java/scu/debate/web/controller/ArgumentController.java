package scu.debate.web.controller;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scu.debate.dao.entity.Arguement;
import scu.debate.service.argument.ArgumentService;
import scu.debate.web.utils.ResultUtils;

import java.util.Map;

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

    @PostMapping(value = "getArgumentByTopic")
    public String getRandomArgument(@RequestBody Map<String, Object> map) {
        Arguement arguement = argumentService.getRandomTopicByCategory((String)map.get("category"));
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "题库没东西啊");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "addArgument", method = RequestMethod.POST)
    public String addArgument(Map<String, Object> map) {
        String topic = (String) map.get("topic");
        String topicInfo = (String) map.get("topicInfo");
        String category = (String) map.get("category");
        Arguement arguement = argumentService.addArgument(topic, topicInfo, category);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "已经有了");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "addArgumentDetail", method = RequestMethod.POST)
    public String addArgumentDetail(Map<String, Object> map) {
        String topic = (String) map.get("topic");
        String topicInfo =(String) map.get("topicInfo");
        String category =(String) map.get("category");
        Integer recommendLevel =(Integer) map.get("recommendLevel");
        Integer exLevel =(Integer) map.get("exLevel");
        Arguement arguement = argumentService.addArgumentDetail(topic, topicInfo, category,recommendLevel,exLevel);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "已经有了");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "updateArgument", method = RequestMethod.POST)
    public String updateArgument(Map<String, Object> map) {
        String topic = (String) map.get("topic");
        String topicInfo =(String) map.get("topicInfo");
        String category =(String) map.get("category");
        Integer recommendLevel =(Integer) map.get("recommendLevel");
        Integer exLevel =(Integer) map.get("exLevel");
        Arguement arguement = argumentService.updateArgument(topic, topicInfo, category,recommendLevel,exLevel);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "没这个题目");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }

    @RequestMapping(value = "deleteArgument", method = RequestMethod.POST)
    public String deleteArgument(Map<String, Object> map) {
        String topic = (String) map.get("topic");
        Arguement arguement = argumentService.deleteArgumentByTopic(topic);
        if (null == arguement) {
            return ResultUtils.errorMessage(null, "没这个题目");
        }
        return ResultUtils.successMessage(JSONArray.toJSONString(arguement));
    }
}
