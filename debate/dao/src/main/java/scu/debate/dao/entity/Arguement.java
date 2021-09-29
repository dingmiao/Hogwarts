package scu.debate.dao.entity;

import java.io.Serializable;

/**
 * arguement
 * @author 
 */

public class Arguement implements Serializable {
    private Integer id;

    private String topic;

    private String topicInfo;

    private String addDate;

    private String category;

    private Integer recommendLevel;

    private Integer exlevel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopicInfo() {
        return topicInfo;
    }

    public void setTopicInfo(String topicInfo) {
        this.topicInfo = topicInfo;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getRecommendLevel() {
        return recommendLevel;
    }

    public void setRecommendLevel(Integer recommendLevel) {
        this.recommendLevel = recommendLevel;
    }

    public Integer getExlevel() {
        return exlevel;
    }

    public void setExlevel(Integer exlevel) {
        this.exlevel = exlevel;
    }
}