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
public class inventor implements Serializable {

    private static final long serialVersionUID = 1575112824082L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String patentID;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String specialID;


    public void setPatentID(String patentID){this.patentID = patentID;}

    public String getPatentID(){return this.patentID;}

    public void setSpecialID(String specialID){this.specialID = specialID;}

    public String getSpecialID(){return this.specialID;}
    @Override
    public String toString() {
        return "inventor{" +
                "patentID='" + patentID + '\'' +
                "specialID='" + specialID + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private inventor set;

        private ConditionBuilder where;

        public UpdateBuilder set(inventor set){
            this.set = set;
            return this;
        }

        public inventor getSet(){
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

    public static class QueryBuilder extends inventor{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> patentIDList;

        public List<String> getPatentIDList(){return this.patentIDList;}


        private List<String> fuzzyPatentID;

        public List<String> getFuzzyPatentID(){return this.fuzzyPatentID;}

        private List<String> rightFuzzyPatentID;

        public List<String> getRightFuzzyPatentID(){return this.rightFuzzyPatentID;}
        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyPatentID (List<String> fuzzyPatentID){
            this.fuzzyPatentID = fuzzyPatentID;
            return this;
        }

        public QueryBuilder fuzzyPatentID (String ... fuzzyPatentID){
            this.fuzzyPatentID = solveNullList(fuzzyPatentID);
            return this;
        }

        public QueryBuilder rightFuzzyPatentID (List<String> rightFuzzyPatentID){
            this.rightFuzzyPatentID = rightFuzzyPatentID;
            return this;
        }

        public QueryBuilder rightFuzzyPatentID (String ... rightFuzzyPatentID){
            this.rightFuzzyPatentID = solveNullList(rightFuzzyPatentID);
            return this;
        }

        public QueryBuilder patentID(String patentID){
            setPatentID(patentID);
            return this;
        }

        public QueryBuilder patentIDList(String ... patentID){
            this.patentIDList = solveNullList(patentID);
            return this;
        }

        public QueryBuilder patentIDList(List<String> patentID){
            this.patentIDList = patentID;
            return this;
        }

        public QueryBuilder fetchPatentID(){
            setFetchFields("fetchFields","patentID");
            return this;
        }

        public QueryBuilder excludePatentID(){
            setFetchFields("excludeFields","patentID");
            return this;
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

        public inventor build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> patentIDList;

        public List<String> getPatentIDList(){return this.patentIDList;}


        private List<String> fuzzyPatentID;

        public List<String> getFuzzyPatentID(){return this.fuzzyPatentID;}

        private List<String> rightFuzzyPatentID;

        public List<String> getRightFuzzyPatentID(){return this.rightFuzzyPatentID;}
        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}

        public ConditionBuilder fuzzyPatentID (List<String> fuzzyPatentID){
            this.fuzzyPatentID = fuzzyPatentID;
            return this;
        }

        public ConditionBuilder fuzzyPatentID (String ... fuzzyPatentID){
            this.fuzzyPatentID = solveNullList(fuzzyPatentID);
            return this;
        }

        public ConditionBuilder rightFuzzyPatentID (List<String> rightFuzzyPatentID){
            this.rightFuzzyPatentID = rightFuzzyPatentID;
            return this;
        }

        public ConditionBuilder rightFuzzyPatentID (String ... rightFuzzyPatentID){
            this.rightFuzzyPatentID = solveNullList(rightFuzzyPatentID);
            return this;
        }

        public ConditionBuilder patentIDList(String ... patentID){
            this.patentIDList = solveNullList(patentID);
            return this;
        }

        public ConditionBuilder patentIDList(List<String> patentID){
            this.patentIDList = patentID;
            return this;
        }

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

        private inventor obj;

        public Builder(){
            this.obj = new inventor();
        }

        public Builder patentID(String patentID){
            this.obj.setPatentID(patentID);
            return this;
        }
        public Builder specialID(String specialID){
            this.obj.setSpecialID(specialID);
            return this;
        }
        public inventor build(){return obj;}
    }

}
