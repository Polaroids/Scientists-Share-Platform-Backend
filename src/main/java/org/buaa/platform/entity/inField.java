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
public class inField implements Serializable {

    private static final long serialVersionUID = 1575112819338L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String specialID;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String fieldName;


    public void setSpecialID(String specialID){this.specialID = specialID;}

    public String getSpecialID(){return this.specialID;}

    public void setFieldName(String fieldName){this.fieldName = fieldName;}

    public String getFieldName(){return this.fieldName;}
    @Override
    public String toString() {
        return "inField{" +
                "specialID='" + specialID + '\'' +
                "fieldName='" + fieldName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private inField set;

        private ConditionBuilder where;

        public UpdateBuilder set(inField set){
            this.set = set;
            return this;
        }

        public inField getSet(){
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

    public static class QueryBuilder extends inField{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}
        private List<String> fieldNameList;

        public List<String> getFieldNameList(){return this.fieldNameList;}


        private List<String> fuzzyFieldName;

        public List<String> getFuzzyFieldName(){return this.fuzzyFieldName;}

        private List<String> rightFuzzyFieldName;

        public List<String> getRightFuzzyFieldName(){return this.rightFuzzyFieldName;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzySpecialID (List<String> fuzzySpecialID){
            this.fuzzySpecialID = fuzzySpecialID;
            return this;
        }

        public QueryBuilder fuzzySpecialID (String ... fuzzySpecialID){
            this.fuzzySpecialID = solveNullList(fuzzySpecialID);
            return this;
        }

        public QueryBuilder rightFuzzySpecialID (List<String> rightFuzzySpecialID){
            this.rightFuzzySpecialID = rightFuzzySpecialID;
            return this;
        }

        public QueryBuilder rightFuzzySpecialID (String ... rightFuzzySpecialID){
            this.rightFuzzySpecialID = solveNullList(rightFuzzySpecialID);
            return this;
        }

        public QueryBuilder specialID(String specialID){
            setSpecialID(specialID);
            return this;
        }

        public QueryBuilder specialIDList(String ... specialID){
            this.specialIDList = solveNullList(specialID);
            return this;
        }

        public QueryBuilder specialIDList(List<String> specialID){
            this.specialIDList = specialID;
            return this;
        }

        public QueryBuilder fetchSpecialID(){
            setFetchFields("fetchFields","specialID");
            return this;
        }

        public QueryBuilder excludeSpecialID(){
            setFetchFields("excludeFields","specialID");
            return this;
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

        public inField build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}
        private List<String> fieldNameList;

        public List<String> getFieldNameList(){return this.fieldNameList;}


        private List<String> fuzzyFieldName;

        public List<String> getFuzzyFieldName(){return this.fuzzyFieldName;}

        private List<String> rightFuzzyFieldName;

        public List<String> getRightFuzzyFieldName(){return this.rightFuzzyFieldName;}

        public ConditionBuilder fuzzySpecialID (List<String> fuzzySpecialID){
            this.fuzzySpecialID = fuzzySpecialID;
            return this;
        }

        public ConditionBuilder fuzzySpecialID (String ... fuzzySpecialID){
            this.fuzzySpecialID = solveNullList(fuzzySpecialID);
            return this;
        }

        public ConditionBuilder rightFuzzySpecialID (List<String> rightFuzzySpecialID){
            this.rightFuzzySpecialID = rightFuzzySpecialID;
            return this;
        }

        public ConditionBuilder rightFuzzySpecialID (String ... rightFuzzySpecialID){
            this.rightFuzzySpecialID = solveNullList(rightFuzzySpecialID);
            return this;
        }

        public ConditionBuilder specialIDList(String ... specialID){
            this.specialIDList = solveNullList(specialID);
            return this;
        }

        public ConditionBuilder specialIDList(List<String> specialID){
            this.specialIDList = specialID;
            return this;
        }

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

        private inField obj;

        public Builder(){
            this.obj = new inField();
        }

        public Builder specialID(String specialID){
            this.obj.setSpecialID(specialID);
            return this;
        }
        public Builder fieldName(String fieldName){
            this.obj.setFieldName(fieldName);
            return this;
        }
        public inField build(){return obj;}
    }

}
