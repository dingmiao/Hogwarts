package scu.debate.service.argument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scu.debate.dao.DAO.ArguementDao;
import scu.debate.dao.entity.Arguement;
import scu.debate.service.argumentValidate.ArgumentValidation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ArgumentBaseService {
    @Autowired
    private ArguementDao arguementDao;

    @Autowired
    private ArgumentValidation argumentValidation;

    public Arguement getArgument(String topic) {
        if (!argumentValidation.topicValidate(topic)) {
            return null;
        }
        Arguement arguement = new Arguement();
        arguement.setTopic(topic);
        return arguementDao.queryArguementDOLimit1(arguement);
    }

    public List<Arguement> getAllArgument() {
        return arguementDao.queryAll();
    }

    public List<Arguement> getArgumentListByCategory(String category) {
        if (null == category || category.length() == 0) {
            return null;
        }
        return arguementDao.queryAllByCategory(category);
    }

    public Arguement addArgument(String topic, String topicInfo, String category) {
        Arguement arguement = queryThenBuildBaseTopic(topic, topicInfo, category);
        if (null == arguement) {
            return null;
        }
        arguement.setRecommendLevel(0);
        arguement.setExlevel(0);
        if(arguementDao.insert(arguement) != 1) {
            return null;
        }
        return arguement;
    }

    public Arguement addArgumentDetail(String topic, String topicInfo, String category, Integer recommendLevel, Integer exLevel) {
        Arguement arguement = queryThenBuildBaseTopic(topic, topicInfo, category);
        if (null == arguement) {
            return null;
        }
        arguement.setRecommendLevel(recommendLevel);
        arguement.setExlevel(exLevel);
        arguement.setRecommendLevel(recommendLevel);
        arguement.setExlevel(exLevel);
        if(arguementDao.insert(arguement) != 1) {
            return null;
        }
        return arguement;
    }

    public Arguement updateArgument(String topic, String topicInfo, String category, Integer recommendLevel, Integer exLevel) {
        Arguement arguement = queryThenBuildBaseTopic(topic, topicInfo, category);
        if (null == arguement) {
            return null;
        }
        arguement.setRecommendLevel(recommendLevel);
        arguement.setExlevel(exLevel);
        arguementDao.updateByPrimaryKeySelective(arguement);
        return arguement;
    }
    public Arguement deleteArgumentByTopic(String topic) {
        Arguement query = getArgument(topic);
        if(null == query) {
            return null;
        }
        arguementDao.deleteByPrimaryKey(query.getId());
        return query;
    }

    private Arguement queryThenBuildBaseTopic(String topic, String topicInfo, String category) {
        if (!argumentValidation.topicValidate(topic)) {
            return null;
        }
        Arguement query = getArgument(topic);
        if (null != query) {
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
        return arguement;
    }
}
