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
public class Admin implements Serializable {

    private static final long serialVersionUID = 1575112581977L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String adminID;

    /**
    * 
    * isNullAble:0
    */
    private String userName;

    /**
    * 
    * isNullAble:0
    */
    private String password;


    public void setAdminID(String adminID){this.adminID = adminID;}

    public String getAdminID(){return this.adminID;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}
    @Override
    public String toString() {
        return "Admin{" +
                "adminID='" + adminID + '\'' +
                "userName='" + userName + '\'' +
                "password='" + password + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Admin set;

        private ConditionBuilder where;

        public UpdateBuilder set(Admin set){
            this.set = set;
            return this;
        }

        public Admin getSet(){
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

    public static class QueryBuilder extends Admin{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> adminIDList;

        public List<String> getAdminIDList(){return this.adminIDList;}


        private List<String> fuzzyAdminID;

        public List<String> getFuzzyAdminID(){return this.fuzzyAdminID;}

        private List<String> rightFuzzyAdminID;

        public List<String> getRightFuzzyAdminID(){return this.rightFuzzyAdminID;}
        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyAdminID (List<String> fuzzyAdminID){
            this.fuzzyAdminID = fuzzyAdminID;
            return this;
        }

        public QueryBuilder fuzzyAdminID (String ... fuzzyAdminID){
            this.fuzzyAdminID = solveNullList(fuzzyAdminID);
            return this;
        }

        public QueryBuilder rightFuzzyAdminID (List<String> rightFuzzyAdminID){
            this.rightFuzzyAdminID = rightFuzzyAdminID;
            return this;
        }

        public QueryBuilder rightFuzzyAdminID (String ... rightFuzzyAdminID){
            this.rightFuzzyAdminID = solveNullList(rightFuzzyAdminID);
            return this;
        }

        public QueryBuilder adminID(String adminID){
            setAdminID(adminID);
            return this;
        }

        public QueryBuilder adminIDList(String ... adminID){
            this.adminIDList = solveNullList(adminID);
            return this;
        }

        public QueryBuilder adminIDList(List<String> adminID){
            this.adminIDList = adminID;
            return this;
        }

        public QueryBuilder fetchAdminID(){
            setFetchFields("fetchFields","adminID");
            return this;
        }

        public QueryBuilder excludeAdminID(){
            setFetchFields("excludeFields","adminID");
            return this;
        }

        public QueryBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public QueryBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public QueryBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public QueryBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public QueryBuilder userName(String userName){
            setUserName(userName);
            return this;
        }

        public QueryBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public QueryBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public QueryBuilder fetchUserName(){
            setFetchFields("fetchFields","userName");
            return this;
        }

        public QueryBuilder excludeUserName(){
            setFetchFields("excludeFields","userName");
            return this;
        }

        public QueryBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public QueryBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public QueryBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public QueryBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public QueryBuilder password(String password){
            setPassword(password);
            return this;
        }

        public QueryBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public QueryBuilder passwordList(List<String> password){
            this.passwordList = password;
            return this;
        }

        public QueryBuilder fetchPassword(){
            setFetchFields("fetchFields","password");
            return this;
        }

        public QueryBuilder excludePassword(){
            setFetchFields("excludeFields","password");
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

        public Admin build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> adminIDList;

        public List<String> getAdminIDList(){return this.adminIDList;}


        private List<String> fuzzyAdminID;

        public List<String> getFuzzyAdminID(){return this.fuzzyAdminID;}

        private List<String> rightFuzzyAdminID;

        public List<String> getRightFuzzyAdminID(){return this.rightFuzzyAdminID;}
        private List<String> userNameList;

        public List<String> getUserNameList(){return this.userNameList;}


        private List<String> fuzzyUserName;

        public List<String> getFuzzyUserName(){return this.fuzzyUserName;}

        private List<String> rightFuzzyUserName;

        public List<String> getRightFuzzyUserName(){return this.rightFuzzyUserName;}
        private List<String> passwordList;

        public List<String> getPasswordList(){return this.passwordList;}


        private List<String> fuzzyPassword;

        public List<String> getFuzzyPassword(){return this.fuzzyPassword;}

        private List<String> rightFuzzyPassword;

        public List<String> getRightFuzzyPassword(){return this.rightFuzzyPassword;}

        public ConditionBuilder fuzzyAdminID (List<String> fuzzyAdminID){
            this.fuzzyAdminID = fuzzyAdminID;
            return this;
        }

        public ConditionBuilder fuzzyAdminID (String ... fuzzyAdminID){
            this.fuzzyAdminID = solveNullList(fuzzyAdminID);
            return this;
        }

        public ConditionBuilder rightFuzzyAdminID (List<String> rightFuzzyAdminID){
            this.rightFuzzyAdminID = rightFuzzyAdminID;
            return this;
        }

        public ConditionBuilder rightFuzzyAdminID (String ... rightFuzzyAdminID){
            this.rightFuzzyAdminID = solveNullList(rightFuzzyAdminID);
            return this;
        }

        public ConditionBuilder adminIDList(String ... adminID){
            this.adminIDList = solveNullList(adminID);
            return this;
        }

        public ConditionBuilder adminIDList(List<String> adminID){
            this.adminIDList = adminID;
            return this;
        }

        public ConditionBuilder fuzzyUserName (List<String> fuzzyUserName){
            this.fuzzyUserName = fuzzyUserName;
            return this;
        }

        public ConditionBuilder fuzzyUserName (String ... fuzzyUserName){
            this.fuzzyUserName = solveNullList(fuzzyUserName);
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (List<String> rightFuzzyUserName){
            this.rightFuzzyUserName = rightFuzzyUserName;
            return this;
        }

        public ConditionBuilder rightFuzzyUserName (String ... rightFuzzyUserName){
            this.rightFuzzyUserName = solveNullList(rightFuzzyUserName);
            return this;
        }

        public ConditionBuilder userNameList(String ... userName){
            this.userNameList = solveNullList(userName);
            return this;
        }

        public ConditionBuilder userNameList(List<String> userName){
            this.userNameList = userName;
            return this;
        }

        public ConditionBuilder fuzzyPassword (List<String> fuzzyPassword){
            this.fuzzyPassword = fuzzyPassword;
            return this;
        }

        public ConditionBuilder fuzzyPassword (String ... fuzzyPassword){
            this.fuzzyPassword = solveNullList(fuzzyPassword);
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (List<String> rightFuzzyPassword){
            this.rightFuzzyPassword = rightFuzzyPassword;
            return this;
        }

        public ConditionBuilder rightFuzzyPassword (String ... rightFuzzyPassword){
            this.rightFuzzyPassword = solveNullList(rightFuzzyPassword);
            return this;
        }

        public ConditionBuilder passwordList(String ... password){
            this.passwordList = solveNullList(password);
            return this;
        }

        public ConditionBuilder passwordList(List<String> password){
            this.passwordList = password;
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

        private Admin obj;

        public Builder(){
            this.obj = new Admin();
        }

        public Builder adminID(String adminID){
            this.obj.setAdminID(adminID);
            return this;
        }
        public Builder userName(String userName){
            this.obj.setUserName(userName);
            return this;
        }
        public Builder password(String password){
            this.obj.setPassword(password);
            return this;
        }
        public Admin build(){return obj;}
    }

}
