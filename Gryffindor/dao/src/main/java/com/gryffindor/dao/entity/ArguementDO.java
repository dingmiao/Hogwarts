package com.gryffindor.dao.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/

public class ArguementDO implements Serializable {

    private static final long serialVersionUID = 1631523968032L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer id;

    /**
    * 
    * isNullAble:1
    */
    private String topic;

    /**
    * 
    * isNullAble:1
    */
    private String topicInfo;

    /**
    * 
    * isNullAble:1
    */
    private String addDate;

    /**
    * 
    * isNullAble:1
    */
    private String category;

    /**
    * 
    * isNullAble:1
    */
    private Integer recommendLevel;

    /**
    * 
    * isNullAble:1
    */
    private Integer exlevel;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTopic(String topic){this.topic = topic;}

    public String getTopic(){return this.topic;}

    public void setTopicInfo(String topicInfo){this.topicInfo = topicInfo;}

    public String getTopicInfo(){return this.topicInfo;}

    public void setAddDate(String addDate){this.addDate = addDate;}

    public String getAddDate(){return this.addDate;}

    public void setCategory(String category){this.category = category;}

    public String getCategory(){return this.category;}

    public void setRecommendLevel(Integer recommendLevel){this.recommendLevel = recommendLevel;}

    public Integer getRecommendLevel(){return this.recommendLevel;}

    public void setExlevel(Integer exlevel){this.exlevel = exlevel;}

    public Integer getExlevel(){return this.exlevel;}
    @Override
    public String toString() {
        return "ArguementDO{" +
                "id='" + id + '\'' +
                "topic='" + topic + '\'' +
                "topicInfo='" + topicInfo + '\'' +
                "addDate='" + addDate + '\'' +
                "category='" + category + '\'' +
                "recommendLevel='" + recommendLevel + '\'' +
                "exlevel='" + exlevel + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ArguementDO set;

        private ConditionBuilder where;

        public UpdateBuilder set(ArguementDO set){
            this.set = set;
            return this;
        }

        public ArguementDO getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends ArguementDO{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> topicList;

        public List<String> getTopicList(){return this.topicList;}


        private List<String> fuzzyTopic;

        public List<String> getFuzzyTopic(){return this.fuzzyTopic;}

        private List<String> rightFuzzyTopic;

        public List<String> getRightFuzzyTopic(){return this.rightFuzzyTopic;}
        private List<String> topicInfoList;

        public List<String> getTopicInfoList(){return this.topicInfoList;}


        private List<String> fuzzyTopicInfo;

        public List<String> getFuzzyTopicInfo(){return this.fuzzyTopicInfo;}

        private List<String> rightFuzzyTopicInfo;

        public List<String> getRightFuzzyTopicInfo(){return this.rightFuzzyTopicInfo;}
        private List<String> addDateList;

        public List<String> getAddDateList(){return this.addDateList;}


        private List<String> fuzzyAddDate;

        public List<String> getFuzzyAddDate(){return this.fuzzyAddDate;}

        private List<String> rightFuzzyAddDate;

        public List<String> getRightFuzzyAddDate(){return this.rightFuzzyAddDate;}
        private List<String> categoryList;

        public List<String> getCategoryList(){return this.categoryList;}


        private List<String> fuzzyCategory;

        public List<String> getFuzzyCategory(){return this.fuzzyCategory;}

        private List<String> rightFuzzyCategory;

        public List<String> getRightFuzzyCategory(){return this.rightFuzzyCategory;}
        private List<Integer> recommendLevelList;

        public List<Integer> getRecommendLevelList(){return this.recommendLevelList;}

        private Integer recommendLevelSt;

        private Integer recommendLevelEd;

        public Integer getRecommendLevelSt(){return this.recommendLevelSt;}

        public Integer getRecommendLevelEd(){return this.recommendLevelEd;}

        private List<Integer> exlevelList;

        public List<Integer> getExlevelList(){return this.exlevelList;}

        private Integer exlevelSt;

        private Integer exlevelEd;

        public Integer getExlevelSt(){return this.exlevelSt;}

        public Integer getExlevelEd(){return this.exlevelEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyTopic (List<String> fuzzyTopic){
            this.fuzzyTopic = fuzzyTopic;
            return this;
        }

        public QueryBuilder fuzzyTopic (String ... fuzzyTopic){
            this.fuzzyTopic = solveNullList(fuzzyTopic);
            return this;
        }

        public QueryBuilder rightFuzzyTopic (List<String> rightFuzzyTopic){
            this.rightFuzzyTopic = rightFuzzyTopic;
            return this;
        }

        public QueryBuilder rightFuzzyTopic (String ... rightFuzzyTopic){
            this.rightFuzzyTopic = solveNullList(rightFuzzyTopic);
            return this;
        }

        public QueryBuilder topic(String topic){
            setTopic(topic);
            return this;
        }

        public QueryBuilder topicList(String ... topic){
            this.topicList = solveNullList(topic);
            return this;
        }

        public QueryBuilder topicList(List<String> topic){
            this.topicList = topic;
            return this;
        }

        public QueryBuilder fetchTopic(){
            setFetchFields("fetchFields","topic");
            return this;
        }

        public QueryBuilder excludeTopic(){
            setFetchFields("excludeFields","topic");
            return this;
        }

        public QueryBuilder fuzzyTopicInfo (List<String> fuzzyTopicInfo){
            this.fuzzyTopicInfo = fuzzyTopicInfo;
            return this;
        }

        public QueryBuilder fuzzyTopicInfo (String ... fuzzyTopicInfo){
            this.fuzzyTopicInfo = solveNullList(fuzzyTopicInfo);
            return this;
        }

        public QueryBuilder rightFuzzyTopicInfo (List<String> rightFuzzyTopicInfo){
            this.rightFuzzyTopicInfo = rightFuzzyTopicInfo;
            return this;
        }

        public QueryBuilder rightFuzzyTopicInfo (String ... rightFuzzyTopicInfo){
            this.rightFuzzyTopicInfo = solveNullList(rightFuzzyTopicInfo);
            return this;
        }

        public QueryBuilder topicInfo(String topicInfo){
            setTopicInfo(topicInfo);
            return this;
        }

        public QueryBuilder topicInfoList(String ... topicInfo){
            this.topicInfoList = solveNullList(topicInfo);
            return this;
        }

        public QueryBuilder topicInfoList(List<String> topicInfo){
            this.topicInfoList = topicInfo;
            return this;
        }

        public QueryBuilder fetchTopicInfo(){
            setFetchFields("fetchFields","topicInfo");
            return this;
        }

        public QueryBuilder excludeTopicInfo(){
            setFetchFields("excludeFields","topicInfo");
            return this;
        }

        public QueryBuilder fuzzyAddDate (List<String> fuzzyAddDate){
            this.fuzzyAddDate = fuzzyAddDate;
            return this;
        }

        public QueryBuilder fuzzyAddDate (String ... fuzzyAddDate){
            this.fuzzyAddDate = solveNullList(fuzzyAddDate);
            return this;
        }

        public QueryBuilder rightFuzzyAddDate (List<String> rightFuzzyAddDate){
            this.rightFuzzyAddDate = rightFuzzyAddDate;
            return this;
        }

        public QueryBuilder rightFuzzyAddDate (String ... rightFuzzyAddDate){
            this.rightFuzzyAddDate = solveNullList(rightFuzzyAddDate);
            return this;
        }

        public QueryBuilder addDate(String addDate){
            setAddDate(addDate);
            return this;
        }

        public QueryBuilder addDateList(String ... addDate){
            this.addDateList = solveNullList(addDate);
            return this;
        }

        public QueryBuilder addDateList(List<String> addDate){
            this.addDateList = addDate;
            return this;
        }

        public QueryBuilder fetchAddDate(){
            setFetchFields("fetchFields","addDate");
            return this;
        }

        public QueryBuilder excludeAddDate(){
            setFetchFields("excludeFields","addDate");
            return this;
        }

        public QueryBuilder fuzzyCategory (List<String> fuzzyCategory){
            this.fuzzyCategory = fuzzyCategory;
            return this;
        }

        public QueryBuilder fuzzyCategory (String ... fuzzyCategory){
            this.fuzzyCategory = solveNullList(fuzzyCategory);
            return this;
        }

        public QueryBuilder rightFuzzyCategory (List<String> rightFuzzyCategory){
            this.rightFuzzyCategory = rightFuzzyCategory;
            return this;
        }

        public QueryBuilder rightFuzzyCategory (String ... rightFuzzyCategory){
            this.rightFuzzyCategory = solveNullList(rightFuzzyCategory);
            return this;
        }

        public QueryBuilder category(String category){
            setCategory(category);
            return this;
        }

        public QueryBuilder categoryList(String ... category){
            this.categoryList = solveNullList(category);
            return this;
        }

        public QueryBuilder categoryList(List<String> category){
            this.categoryList = category;
            return this;
        }

        public QueryBuilder fetchCategory(){
            setFetchFields("fetchFields","category");
            return this;
        }

        public QueryBuilder excludeCategory(){
            setFetchFields("excludeFields","category");
            return this;
        }

        public QueryBuilder recommendLevelBetWeen(Integer recommendLevelSt,Integer recommendLevelEd){
            this.recommendLevelSt = recommendLevelSt;
            this.recommendLevelEd = recommendLevelEd;
            return this;
        }

        public QueryBuilder recommendLevelGreaterEqThan(Integer recommendLevelSt){
            this.recommendLevelSt = recommendLevelSt;
            return this;
        }
        public QueryBuilder recommendLevelLessEqThan(Integer recommendLevelEd){
            this.recommendLevelEd = recommendLevelEd;
            return this;
        }


        public QueryBuilder recommendLevel(Integer recommendLevel){
            setRecommendLevel(recommendLevel);
            return this;
        }

        public QueryBuilder recommendLevelList(Integer ... recommendLevel){
            this.recommendLevelList = solveNullList(recommendLevel);
            return this;
        }

        public QueryBuilder recommendLevelList(List<Integer> recommendLevel){
            this.recommendLevelList = recommendLevel;
            return this;
        }

        public QueryBuilder fetchRecommendLevel(){
            setFetchFields("fetchFields","recommendLevel");
            return this;
        }

        public QueryBuilder excludeRecommendLevel(){
            setFetchFields("excludeFields","recommendLevel");
            return this;
        }

        public QueryBuilder exlevelBetWeen(Integer exlevelSt,Integer exlevelEd){
            this.exlevelSt = exlevelSt;
            this.exlevelEd = exlevelEd;
            return this;
        }

        public QueryBuilder exlevelGreaterEqThan(Integer exlevelSt){
            this.exlevelSt = exlevelSt;
            return this;
        }
        public QueryBuilder exlevelLessEqThan(Integer exlevelEd){
            this.exlevelEd = exlevelEd;
            return this;
        }


        public QueryBuilder exlevel(Integer exlevel){
            setExlevel(exlevel);
            return this;
        }

        public QueryBuilder exlevelList(Integer ... exlevel){
            this.exlevelList = solveNullList(exlevel);
            return this;
        }

        public QueryBuilder exlevelList(List<Integer> exlevel){
            this.exlevelList = exlevel;
            return this;
        }

        public QueryBuilder fetchExlevel(){
            setFetchFields("fetchFields","exlevel");
            return this;
        }

        public QueryBuilder excludeExlevel(){
            setFetchFields("excludeFields","exlevel");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public ArguementDO build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<String> topicList;

        public List<String> getTopicList(){return this.topicList;}


        private List<String> fuzzyTopic;

        public List<String> getFuzzyTopic(){return this.fuzzyTopic;}

        private List<String> rightFuzzyTopic;

        public List<String> getRightFuzzyTopic(){return this.rightFuzzyTopic;}
        private List<String> topicInfoList;

        public List<String> getTopicInfoList(){return this.topicInfoList;}


        private List<String> fuzzyTopicInfo;

        public List<String> getFuzzyTopicInfo(){return this.fuzzyTopicInfo;}

        private List<String> rightFuzzyTopicInfo;

        public List<String> getRightFuzzyTopicInfo(){return this.rightFuzzyTopicInfo;}
        private List<String> addDateList;

        public List<String> getAddDateList(){return this.addDateList;}


        private List<String> fuzzyAddDate;

        public List<String> getFuzzyAddDate(){return this.fuzzyAddDate;}

        private List<String> rightFuzzyAddDate;

        public List<String> getRightFuzzyAddDate(){return this.rightFuzzyAddDate;}
        private List<String> categoryList;

        public List<String> getCategoryList(){return this.categoryList;}


        private List<String> fuzzyCategory;

        public List<String> getFuzzyCategory(){return this.fuzzyCategory;}

        private List<String> rightFuzzyCategory;

        public List<String> getRightFuzzyCategory(){return this.rightFuzzyCategory;}
        private List<Integer> recommendLevelList;

        public List<Integer> getRecommendLevelList(){return this.recommendLevelList;}

        private Integer recommendLevelSt;

        private Integer recommendLevelEd;

        public Integer getRecommendLevelSt(){return this.recommendLevelSt;}

        public Integer getRecommendLevelEd(){return this.recommendLevelEd;}

        private List<Integer> exlevelList;

        public List<Integer> getExlevelList(){return this.exlevelList;}

        private Integer exlevelSt;

        private Integer exlevelEd;

        public Integer getExlevelSt(){return this.exlevelSt;}

        public Integer getExlevelEd(){return this.exlevelEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyTopic (List<String> fuzzyTopic){
            this.fuzzyTopic = fuzzyTopic;
            return this;
        }

        public ConditionBuilder fuzzyTopic (String ... fuzzyTopic){
            this.fuzzyTopic = solveNullList(fuzzyTopic);
            return this;
        }

        public ConditionBuilder rightFuzzyTopic (List<String> rightFuzzyTopic){
            this.rightFuzzyTopic = rightFuzzyTopic;
            return this;
        }

        public ConditionBuilder rightFuzzyTopic (String ... rightFuzzyTopic){
            this.rightFuzzyTopic = solveNullList(rightFuzzyTopic);
            return this;
        }

        public ConditionBuilder topicList(String ... topic){
            this.topicList = solveNullList(topic);
            return this;
        }

        public ConditionBuilder topicList(List<String> topic){
            this.topicList = topic;
            return this;
        }

        public ConditionBuilder fuzzyTopicInfo (List<String> fuzzyTopicInfo){
            this.fuzzyTopicInfo = fuzzyTopicInfo;
            return this;
        }

        public ConditionBuilder fuzzyTopicInfo (String ... fuzzyTopicInfo){
            this.fuzzyTopicInfo = solveNullList(fuzzyTopicInfo);
            return this;
        }

        public ConditionBuilder rightFuzzyTopicInfo (List<String> rightFuzzyTopicInfo){
            this.rightFuzzyTopicInfo = rightFuzzyTopicInfo;
            return this;
        }

        public ConditionBuilder rightFuzzyTopicInfo (String ... rightFuzzyTopicInfo){
            this.rightFuzzyTopicInfo = solveNullList(rightFuzzyTopicInfo);
            return this;
        }

        public ConditionBuilder topicInfoList(String ... topicInfo){
            this.topicInfoList = solveNullList(topicInfo);
            return this;
        }

        public ConditionBuilder topicInfoList(List<String> topicInfo){
            this.topicInfoList = topicInfo;
            return this;
        }

        public ConditionBuilder fuzzyAddDate (List<String> fuzzyAddDate){
            this.fuzzyAddDate = fuzzyAddDate;
            return this;
        }

        public ConditionBuilder fuzzyAddDate (String ... fuzzyAddDate){
            this.fuzzyAddDate = solveNullList(fuzzyAddDate);
            return this;
        }

        public ConditionBuilder rightFuzzyAddDate (List<String> rightFuzzyAddDate){
            this.rightFuzzyAddDate = rightFuzzyAddDate;
            return this;
        }

        public ConditionBuilder rightFuzzyAddDate (String ... rightFuzzyAddDate){
            this.rightFuzzyAddDate = solveNullList(rightFuzzyAddDate);
            return this;
        }

        public ConditionBuilder addDateList(String ... addDate){
            this.addDateList = solveNullList(addDate);
            return this;
        }

        public ConditionBuilder addDateList(List<String> addDate){
            this.addDateList = addDate;
            return this;
        }

        public ConditionBuilder fuzzyCategory (List<String> fuzzyCategory){
            this.fuzzyCategory = fuzzyCategory;
            return this;
        }

        public ConditionBuilder fuzzyCategory (String ... fuzzyCategory){
            this.fuzzyCategory = solveNullList(fuzzyCategory);
            return this;
        }

        public ConditionBuilder rightFuzzyCategory (List<String> rightFuzzyCategory){
            this.rightFuzzyCategory = rightFuzzyCategory;
            return this;
        }

        public ConditionBuilder rightFuzzyCategory (String ... rightFuzzyCategory){
            this.rightFuzzyCategory = solveNullList(rightFuzzyCategory);
            return this;
        }

        public ConditionBuilder categoryList(String ... category){
            this.categoryList = solveNullList(category);
            return this;
        }

        public ConditionBuilder categoryList(List<String> category){
            this.categoryList = category;
            return this;
        }

        public ConditionBuilder recommendLevelBetWeen(Integer recommendLevelSt,Integer recommendLevelEd){
            this.recommendLevelSt = recommendLevelSt;
            this.recommendLevelEd = recommendLevelEd;
            return this;
        }

        public ConditionBuilder recommendLevelGreaterEqThan(Integer recommendLevelSt){
            this.recommendLevelSt = recommendLevelSt;
            return this;
        }
        public ConditionBuilder recommendLevelLessEqThan(Integer recommendLevelEd){
            this.recommendLevelEd = recommendLevelEd;
            return this;
        }


        public ConditionBuilder recommendLevelList(Integer ... recommendLevel){
            this.recommendLevelList = solveNullList(recommendLevel);
            return this;
        }

        public ConditionBuilder recommendLevelList(List<Integer> recommendLevel){
            this.recommendLevelList = recommendLevel;
            return this;
        }

        public ConditionBuilder exlevelBetWeen(Integer exlevelSt,Integer exlevelEd){
            this.exlevelSt = exlevelSt;
            this.exlevelEd = exlevelEd;
            return this;
        }

        public ConditionBuilder exlevelGreaterEqThan(Integer exlevelSt){
            this.exlevelSt = exlevelSt;
            return this;
        }
        public ConditionBuilder exlevelLessEqThan(Integer exlevelEd){
            this.exlevelEd = exlevelEd;
            return this;
        }


        public ConditionBuilder exlevelList(Integer ... exlevel){
            this.exlevelList = solveNullList(exlevel);
            return this;
        }

        public ConditionBuilder exlevelList(List<Integer> exlevel){
            this.exlevelList = exlevel;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private ArguementDO obj;

        public Builder(){
            this.obj = new ArguementDO();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder topic(String topic){
            this.obj.setTopic(topic);
            return this;
        }
        public Builder topicInfo(String topicInfo){
            this.obj.setTopicInfo(topicInfo);
            return this;
        }
        public Builder addDate(String addDate){
            this.obj.setAddDate(addDate);
            return this;
        }
        public Builder category(String category){
            this.obj.setCategory(category);
            return this;
        }
        public Builder recommendLevel(Integer recommendLevel){
            this.obj.setRecommendLevel(recommendLevel);
            return this;
        }
        public Builder exlevel(Integer exlevel){
            this.obj.setExlevel(exlevel);
            return this;
        }
        public ArguementDO build(){return obj;}
    }

}
