package org.buaa.platform.entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author 
*/
public class Star implements Serializable {

    private static final long serialVersionUID = 1576736976901L;


    /**
    * 
    * isNullAble:0
    */
    private String userID;

    /**
    * 
    * isNullAble:0
    */
    private String paperID;


    public void setUserID(String userID){this.userID = userID;}

    public String getUserID(){return this.userID;}

    public void setPaperID(String paperID){this.paperID = paperID;}

    public String getPaperID(){return this.paperID;}
    @Override
    public String toString() {
        return "Star{" +
                "userID='" + userID + '\'' +
                "paperID='" + paperID + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Star set;

        private ConditionBuilder where;

        public UpdateBuilder set(Star set){
            this.set = set;
            return this;
        }

        public Star getSet(){
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

    public static class QueryBuilder extends Star{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public Star build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}

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

        private Star obj;

        public Builder(){
            this.obj = new Star();
        }

        public Builder userID(String userID){
            this.obj.setUserID(userID);
            return this;
        }
        public Builder paperID(String paperID){
            this.obj.setPaperID(paperID);
            return this;
        }
        public Star build(){return obj;}
    }

}
