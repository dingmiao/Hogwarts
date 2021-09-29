package scu.debate.service.argument;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.debate.dao.DAO.ArguementDao;
import scu.debate.dao.entity.Arguement;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


@Service
public class ArgumentService {
    @Resource
    private ArguementDao arguementDao;

    private Arguement getArgueMent(String topic) {
        Arguement arguement = new Arguement();
        arguement.setTopic(topic);
        return arguementDao.queryArguementDOLimit1(arguement);
    }
    public String getArgumentByTopic(String topic) {
        return JSONArray.toJSONString(getArgueMent(topic));
    }
    public String addArgument(String topic, String topicInfo, String category) {
        if (null == topic || topic.length() == 0) {
            return null;
        }
        Arguement arguement = new Arguement();
        arguement.setTopic(topic);
        arguement.setTopicInfo(topicInfo);
        arguement.setCategory(category);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String dateTime = simpleDateFormat.format(date);
        arguement.setAddDate(dateTime);
        arguement.setRecommendLevel(0);
        arguement.setExlevel(0);
        if(arguementDao.insert(arguement) != 1) {
            return null;
        }
        return JSONArray.toJSONString(arguement);
    }

}
