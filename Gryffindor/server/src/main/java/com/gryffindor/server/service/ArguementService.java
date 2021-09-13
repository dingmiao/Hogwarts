package com.gryffindor.server.service;

import com.alibaba.fastjson.JSONArray;
import com.gryffindor.dao.entity.ArguementDO;
import com.gryffindor.dao.mapper.ArguementDOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ArguementService {
    @Autowired
    public ArguementDOMapper arguementDOMapper;

    public ArguementDO getArgueMent(String topic) {
        ArguementDO arguementDO = new ArguementDO();
        arguementDO.setTopic(topic);
        return arguementDOMapper.queryArguementDOLimit1(arguementDO);
    }
    public String addArguement(String topic, String topicInfo, String category) {
        ArguementDO arguementDO = new ArguementDO();
        arguementDO.setTopic(topic);
        arguementDO.setTopicInfo(topicInfo);
        arguementDO.setCategory(category);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String dateTime = simpleDateFormat.format(date);
        arguementDO.setAddDate(dateTime);
        arguementDO.setRecommendLevel(0);
        arguementDO.setExlevel(0);
        if(arguementDOMapper.insertArguementDO(arguementDO) != 1) {
            return null;
        }
        return JSONArray.toJSONString(arguementDO);
    }
}
