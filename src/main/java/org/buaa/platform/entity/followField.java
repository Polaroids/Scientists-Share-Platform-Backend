package org.buaa.platform.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class followField implements Serializable {

    private static final long serialVersionUID = 1575112817399L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String fieldName;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String userID;


    public void setFieldName(String fieldName){this.fieldName = fieldName;}

    public String getFieldName(){return this.fieldName;}

    public void setUserID(String userID){this.userID = userID;}

    public String getUserID(){return this.userID;}
    @Override
    public String toString() {
        return "followField{" +
                "fieldName='" + fieldName + '\'' +
                "userID='" + userID + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private followField set;

        private ConditionBuilder where;

        public UpdateBuilder set(followField set){
            this.set = set;
            return this;
        }

        public followField getSet(){
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

    public static class QueryBuilder extends followField{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> fieldNameList;

        public List<String> getFieldNameList(){return this.fieldNameList;}


        private List<String> fuzzyFieldName;

        public List<String> getFuzzyFieldName(){return this.fuzzyFieldName;}

        private List<String> rightFuzzyFieldName;

        public List<String> getRightFuzzyFieldName(){return this.rightFuzzyFieldName;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyFieldName (List<String> fuzzyFieldName){
            this.fuzzyFieldName = fuzzyFieldName;
            return this;
        }

        public QueryBuilder fuzzyFieldName (String ... fuzzyFieldName){
            this.fuzzyFieldName = solveNullList(fuzzyFieldName);
            return this;
        }

        public QueryBuilder rightFuzzyFieldName (List<String> rightFuzzyFieldName){
            this.rightFuzzyFieldName = rightFuzzyFieldName;
            return this;
        }

        public QueryBuilder rightFuzzyFieldName (String ... rightFuzzyFieldName){
            this.rightFuzzyFieldName = solveNullList(rightFuzzyFieldName);
            return this;
        }

        public QueryBuilder fieldName(String fieldName){
            setFieldName(fieldName);
            return this;
        }

        public QueryBuilder fieldNameList(String ... fieldName){
            this.fieldNameList = solveNullList(fieldName);
            return this;
        }

        public QueryBuilder fieldNameList(List<String> fieldName){
            this.fieldNameList = fieldName;
            return this;
        }

        public QueryBuilder fetchFieldName(){
            setFetchFields("fetchFields","fieldName");
            return this;
        }

        public QueryBuilder excludeFieldName(){
            setFetchFields("excludeFields","fieldName");
            return this;
        }

        public QueryBuilder fuzzyUserID (List<String> fuzzyUserID){
            this.fuzzyUserID = fuzzyUserID;
            return this;
        }

        public QueryBuilder fuzzyUserID (String ... fuzzyUserID){
            this.fuzzyUserID = solveNullList(fuzzyUserID);
            return this;
        }

        public QueryBuilder rightFuzzyUserID (List<String> rightFuzzyUserID){
            this.rightFuzzyUserID = rightFuzzyUserID;
            return this;
        }

        public QueryBuilder rightFuzzyUserID (String ... rightFuzzyUserID){
            this.rightFuzzyUserID = solveNullList(rightFuzzyUserID);
            return this;
        }

        public QueryBuilder userID(String userID){
            setUserID(userID);
            return this;
        }

        public QueryBuilder userIDList(String ... userID){
            this.userIDList = solveNullList(userID);
            return this;
        }

        public QueryBuilder userIDList(List<String> userID){
            this.userIDList = userID;
            return this;
        }

        public QueryBuilder fetchUserID(){
            setFetchFields("fetchFields","userID");
            return this;
        }

        public QueryBuilder excludeUserID(){
            setFetchFields("excludeFields","userID");
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

        public followField build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> fieldNameList;

        public List<String> getFieldNameList(){return this.fieldNameList;}


        private List<String> fuzzyFieldName;

        public List<String> getFuzzyFieldName(){return this.fuzzyFieldName;}

        private List<String> rightFuzzyFieldName;

        public List<String> getRightFuzzyFieldName(){return this.rightFuzzyFieldName;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}

        public ConditionBuilder fuzzyFieldName (List<String> fuzzyFieldName){
            this.fuzzyFieldName = fuzzyFieldName;
            return this;
        }

        public ConditionBuilder fuzzyFieldName (String ... fuzzyFieldName){
            this.fuzzyFieldName = solveNullList(fuzzyFieldName);
            return this;
        }

        public ConditionBuilder rightFuzzyFieldName (List<String> rightFuzzyFieldName){
            this.rightFuzzyFieldName = rightFuzzyFieldName;
            return this;
        }

        public ConditionBuilder rightFuzzyFieldName (String ... rightFuzzyFieldName){
            this.rightFuzzyFieldName = solveNullList(rightFuzzyFieldName);
            return this;
        }

        public ConditionBuilder fieldNameList(String ... fieldName){
            this.fieldNameList = solveNullList(fieldName);
            return this;
        }

        public ConditionBuilder fieldNameList(List<String> fieldName){
            this.fieldNameList = fieldName;
            return this;
        }

        public ConditionBuilder fuzzyUserID (List<String> fuzzyUserID){
            this.fuzzyUserID = fuzzyUserID;
            return this;
        }

        public ConditionBuilder fuzzyUserID (String ... fuzzyUserID){
            this.fuzzyUserID = solveNullList(fuzzyUserID);
            return this;
        }

        public ConditionBuilder rightFuzzyUserID (List<String> rightFuzzyUserID){
            this.rightFuzzyUserID = rightFuzzyUserID;
            return this;
        }

        public ConditionBuilder rightFuzzyUserID (String ... rightFuzzyUserID){
            this.rightFuzzyUserID = solveNullList(rightFuzzyUserID);
            return this;
        }

        public ConditionBuilder userIDList(String ... userID){
            this.userIDList = solveNullList(userID);
            return this;
        }

        public ConditionBuilder userIDList(List<String> userID){
            this.userIDList = userID;
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

        private followField obj;

        public Builder(){
            this.obj = new followField();
        }

        public Builder fieldName(String fieldName){
            this.obj.setFieldName(fieldName);
            return this;
        }
        public Builder userID(String userID){
            this.obj.setUserID(userID);
            return this;
        }
        public followField build(){return obj;}
    }

}
