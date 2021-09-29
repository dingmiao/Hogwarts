package scu.debate.web.utils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class ResultUtils {

    public static String successMessage(String data) {
        Map<String, String> resultMap = new HashMap<>(10);
        resultMap.put("code", "200");
        resultMap.put("message", "success!");
        resultMap.put("data", data);
        return JSON.toJSONString(resultMap);
    }
    public static String errorMessage(String data) {
        Map<String, String> resultMap = new HashMap<>(10);
        resultMap.put("code", "500");
        resultMap.put("message", "error!");
        resultMap.put("data", data);
        return JSON.toJSONString(resultMap);
    }
    public static String errorMessage(String data, String msg) {
        Map<String, String> resultMap = new HashMap<>(10);
        resultMap.put("code", "500");
        resultMap.put("message", msg);
        resultMap.put("data", data);
        return JSON.toJSONString(resultMap);
    }
}
