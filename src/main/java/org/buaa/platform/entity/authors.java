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
public class authors implements Serializable {

    private static final long serialVersionUID = 1575112813237L;


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
    private String paperID;


    public void setSpecialID(String specialID){this.specialID = specialID;}

    public String getSpecialID(){return this.specialID;}

    public void setPaperID(String paperID){this.paperID = paperID;}

    public String getPaperID(){return this.paperID;}
    @Override
    public String toString() {
        return "authors{" +
                "specialID='" + specialID + '\'' +
                "paperID='" + paperID + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private authors set;

        private ConditionBuilder where;

        public UpdateBuilder set(authors set){
            this.set = set;
            return this;
        }

        public authors getSet(){
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

    public static class QueryBuilder extends authors{
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
        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}
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

        public QueryBuilder fuzzyPaperID (List<String> fuzzyPaperID){
            this.fuzzyPaperID = fuzzyPaperID;
            return this;
        }

        public QueryBuilder fuzzyPaperID (String ... fuzzyPaperID){
            this.fuzzyPaperID = solveNullList(fuzzyPaperID);
            return this;
        }

        public QueryBuilder rightFuzzyPaperID (List<String> rightFuzzyPaperID){
            this.rightFuzzyPaperID = rightFuzzyPaperID;
            return this;
        }

        public QueryBuilder rightFuzzyPaperID (String ... rightFuzzyPaperID){
            this.rightFuzzyPaperID = solveNullList(rightFuzzyPaperID);
            return this;
        }

        public QueryBuilder paperID(String paperID){
            setPaperID(paperID);
            return this;
        }

        public QueryBuilder paperIDList(String ... paperID){
            this.paperIDList = solveNullList(paperID);
            return this;
        }

        public QueryBuilder paperIDList(List<String> paperID){
            this.paperIDList = paperID;
            return this;
        }

        public QueryBuilder fetchPaperID(){
            setFetchFields("fetchFields","paperID");
            return this;
        }

        public QueryBuilder excludePaperID(){
            setFetchFields("excludeFields","paperID");
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

        public authors build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}
        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}

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

        public ConditionBuilder fuzzyPaperID (List<String> fuzzyPaperID){
            this.fuzzyPaperID = fuzzyPaperID;
            return this;
        }

        public ConditionBuilder fuzzyPaperID (String ... fuzzyPaperID){
            this.fuzzyPaperID = solveNullList(fuzzyPaperID);
            return this;
        }

        public ConditionBuilder rightFuzzyPaperID (List<String> rightFuzzyPaperID){
            this.rightFuzzyPaperID = rightFuzzyPaperID;
            return this;
        }

        public ConditionBuilder rightFuzzyPaperID (String ... rightFuzzyPaperID){
            this.rightFuzzyPaperID = solveNullList(rightFuzzyPaperID);
            return this;
        }

        public ConditionBuilder paperIDList(String ... paperID){
            this.paperIDList = solveNullList(paperID);
            return this;
        }

        public ConditionBuilder paperIDList(List<String> paperID){
            this.paperIDList = paperID;
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

        private authors obj;

        public Builder(){
            this.obj = new authors();
        }

        public Builder specialID(String specialID){
            this.obj.setSpecialID(specialID);
            return this;
        }
        public Builder paperID(String paperID){
            this.obj.setPaperID(paperID);
            return this;
        }
        public authors build(){return obj;}
    }

}
