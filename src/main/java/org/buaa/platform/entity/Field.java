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
public class Field implements Serializable {

    private static final long serialVersionUID = 1575112794529L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String fieldName;


    public void setFieldName(String fieldName){this.fieldName = fieldName;}

    public String getFieldName(){return this.fieldName;}
    @Override
    public String toString() {
        return "Field{" +
                "fieldName='" + fieldName + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Field set;

        private ConditionBuilder where;

        public UpdateBuilder set(Field set){
            this.set = set;
            return this;
        }

        public Field getSet(){
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

    public static class QueryBuilder extends Field{
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

        public Field build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> fieldNameList;

        public List<String> getFieldNameList(){return this.fieldNameList;}


        private List<String> fuzzyFieldName;

        public List<String> getFuzzyFieldName(){return this.fuzzyFieldName;}

        private List<String> rightFuzzyFieldName;

        public List<String> getRightFuzzyFieldName(){return this.rightFuzzyFieldName;}

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

        private Field obj;

        public Builder(){
            this.obj = new Field();
        }

        public Builder fieldName(String fieldName){
            this.obj.setFieldName(fieldName);
            return this;
        }
        public Field build(){return obj;}
    }

}
