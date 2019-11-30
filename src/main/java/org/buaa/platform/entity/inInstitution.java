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
public class inInstitution implements Serializable {

    private static final long serialVersionUID = 1575112822002L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String institutionName;

    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String paperID;


    public void setInstitutionName(String institutionName){this.institutionName = institutionName;}

    public String getInstitutionName(){return this.institutionName;}

    public void setPaperID(String paperID){this.paperID = paperID;}

    public String getPaperID(){return this.paperID;}
    @Override
    public String toString() {
        return "inInstitution{" +
                "institutionName='" + institutionName + '\'' +
                "paperID='" + paperID + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private inInstitution set;

        private ConditionBuilder where;

        public UpdateBuilder set(inInstitution set){
            this.set = set;
            return this;
        }

        public inInstitution getSet(){
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

    public static class QueryBuilder extends inInstitution{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> institutionNameList;

        public List<String> getInstitutionNameList(){return this.institutionNameList;}


        private List<String> fuzzyInstitutionName;

        public List<String> getFuzzyInstitutionName(){return this.fuzzyInstitutionName;}

        private List<String> rightFuzzyInstitutionName;

        public List<String> getRightFuzzyInstitutionName(){return this.rightFuzzyInstitutionName;}
        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyInstitutionName (List<String> fuzzyInstitutionName){
            this.fuzzyInstitutionName = fuzzyInstitutionName;
            return this;
        }

        public QueryBuilder fuzzyInstitutionName (String ... fuzzyInstitutionName){
            this.fuzzyInstitutionName = solveNullList(fuzzyInstitutionName);
            return this;
        }

        public QueryBuilder rightFuzzyInstitutionName (List<String> rightFuzzyInstitutionName){
            this.rightFuzzyInstitutionName = rightFuzzyInstitutionName;
            return this;
        }

        public QueryBuilder rightFuzzyInstitutionName (String ... rightFuzzyInstitutionName){
            this.rightFuzzyInstitutionName = solveNullList(rightFuzzyInstitutionName);
            return this;
        }

        public QueryBuilder institutionName(String institutionName){
            setInstitutionName(institutionName);
            return this;
        }

        public QueryBuilder institutionNameList(String ... institutionName){
            this.institutionNameList = solveNullList(institutionName);
            return this;
        }

        public QueryBuilder institutionNameList(List<String> institutionName){
            this.institutionNameList = institutionName;
            return this;
        }

        public QueryBuilder fetchInstitutionName(){
            setFetchFields("fetchFields","institutionName");
            return this;
        }

        public QueryBuilder excludeInstitutionName(){
            setFetchFields("excludeFields","institutionName");
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

        public inInstitution build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> institutionNameList;

        public List<String> getInstitutionNameList(){return this.institutionNameList;}


        private List<String> fuzzyInstitutionName;

        public List<String> getFuzzyInstitutionName(){return this.fuzzyInstitutionName;}

        private List<String> rightFuzzyInstitutionName;

        public List<String> getRightFuzzyInstitutionName(){return this.rightFuzzyInstitutionName;}
        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}

        public ConditionBuilder fuzzyInstitutionName (List<String> fuzzyInstitutionName){
            this.fuzzyInstitutionName = fuzzyInstitutionName;
            return this;
        }

        public ConditionBuilder fuzzyInstitutionName (String ... fuzzyInstitutionName){
            this.fuzzyInstitutionName = solveNullList(fuzzyInstitutionName);
            return this;
        }

        public ConditionBuilder rightFuzzyInstitutionName (List<String> rightFuzzyInstitutionName){
            this.rightFuzzyInstitutionName = rightFuzzyInstitutionName;
            return this;
        }

        public ConditionBuilder rightFuzzyInstitutionName (String ... rightFuzzyInstitutionName){
            this.rightFuzzyInstitutionName = solveNullList(rightFuzzyInstitutionName);
            return this;
        }

        public ConditionBuilder institutionNameList(String ... institutionName){
            this.institutionNameList = solveNullList(institutionName);
            return this;
        }

        public ConditionBuilder institutionNameList(List<String> institutionName){
            this.institutionNameList = institutionName;
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

        private inInstitution obj;

        public Builder(){
            this.obj = new inInstitution();
        }

        public Builder institutionName(String institutionName){
            this.obj.setInstitutionName(institutionName);
            return this;
        }
        public Builder paperID(String paperID){
            this.obj.setPaperID(paperID);
            return this;
        }
        public inInstitution build(){return obj;}
    }

}
