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
public class Special implements Serializable {

    private static final long serialVersionUID = 1575112806266L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String specialID;

    /**
    * 
    * isNullAble:1
    */
    private String institutionName;

    /**
    * 
    * isNullAble:1
    */
    private String userID;

    /**
    * 
    * isNullAble:0
    */
    private String name;

    /**
    * 
    * isNullAble:0
    */
    private Integer claimed;

    /**
    * 
    * isNullAble:1
    */
    private String email;


    public void setSpecialID(String specialID){this.specialID = specialID;}

    public String getSpecialID(){return this.specialID;}

    public void setInstitutionName(String institutionName){this.institutionName = institutionName;}

    public String getInstitutionName(){return this.institutionName;}

    public void setUserID(String userID){this.userID = userID;}

    public String getUserID(){return this.userID;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setClaimed(Integer claimed){this.claimed = claimed;}

    public Integer getClaimed(){return this.claimed;}

    public void setEmail(String email){this.email = email;}

    public String getEmail(){return this.email;}
    @Override
    public String toString() {
        return "Special{" +
                "specialID='" + specialID + '\'' +
                "institutionName='" + institutionName + '\'' +
                "userID='" + userID + '\'' +
                "name='" + name + '\'' +
                "claimed='" + claimed + '\'' +
                "email='" + email + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Special set;

        private ConditionBuilder where;

        public UpdateBuilder set(Special set){
            this.set = set;
            return this;
        }

        public Special getSet(){
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

    public static class QueryBuilder extends Special{
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
        private List<String> institutionNameList;

        public List<String> getInstitutionNameList(){return this.institutionNameList;}


        private List<String> fuzzyInstitutionName;

        public List<String> getFuzzyInstitutionName(){return this.fuzzyInstitutionName;}

        private List<String> rightFuzzyInstitutionName;

        public List<String> getRightFuzzyInstitutionName(){return this.rightFuzzyInstitutionName;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> claimedList;

        public List<Integer> getClaimedList(){return this.claimedList;}

        private Integer claimedSt;

        private Integer claimedEd;

        public Integer getClaimedSt(){return this.claimedSt;}

        public Integer getClaimedEd(){return this.claimedEd;}

        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}
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

        public QueryBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public QueryBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public QueryBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public QueryBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public QueryBuilder name(String name){
            setName(name);
            return this;
        }

        public QueryBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public QueryBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public QueryBuilder fetchName(){
            setFetchFields("fetchFields","name");
            return this;
        }

        public QueryBuilder excludeName(){
            setFetchFields("excludeFields","name");
            return this;
        }

        public QueryBuilder claimedBetWeen(Integer claimedSt,Integer claimedEd){
            this.claimedSt = claimedSt;
            this.claimedEd = claimedEd;
            return this;
        }

        public QueryBuilder claimedGreaterEqThan(Integer claimedSt){
            this.claimedSt = claimedSt;
            return this;
        }
        public QueryBuilder claimedLessEqThan(Integer claimedEd){
            this.claimedEd = claimedEd;
            return this;
        }


        public QueryBuilder claimed(Integer claimed){
            setClaimed(claimed);
            return this;
        }

        public QueryBuilder claimedList(Integer ... claimed){
            this.claimedList = solveNullList(claimed);
            return this;
        }

        public QueryBuilder claimedList(List<Integer> claimed){
            this.claimedList = claimed;
            return this;
        }

        public QueryBuilder fetchClaimed(){
            setFetchFields("fetchFields","claimed");
            return this;
        }

        public QueryBuilder excludeClaimed(){
            setFetchFields("excludeFields","claimed");
            return this;
        }

        public QueryBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public QueryBuilder fuzzyEmail (String ... fuzzyEmail){
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public QueryBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public QueryBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public QueryBuilder email(String email){
            setEmail(email);
            return this;
        }

        public QueryBuilder emailList(String ... email){
            this.emailList = solveNullList(email);
            return this;
        }

        public QueryBuilder emailList(List<String> email){
            this.emailList = email;
            return this;
        }

        public QueryBuilder fetchEmail(){
            setFetchFields("fetchFields","email");
            return this;
        }

        public QueryBuilder excludeEmail(){
            setFetchFields("excludeFields","email");
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

        public Special build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}
        private List<String> institutionNameList;

        public List<String> getInstitutionNameList(){return this.institutionNameList;}


        private List<String> fuzzyInstitutionName;

        public List<String> getFuzzyInstitutionName(){return this.fuzzyInstitutionName;}

        private List<String> rightFuzzyInstitutionName;

        public List<String> getRightFuzzyInstitutionName(){return this.rightFuzzyInstitutionName;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> nameList;

        public List<String> getNameList(){return this.nameList;}


        private List<String> fuzzyName;

        public List<String> getFuzzyName(){return this.fuzzyName;}

        private List<String> rightFuzzyName;

        public List<String> getRightFuzzyName(){return this.rightFuzzyName;}
        private List<Integer> claimedList;

        public List<Integer> getClaimedList(){return this.claimedList;}

        private Integer claimedSt;

        private Integer claimedEd;

        public Integer getClaimedSt(){return this.claimedSt;}

        public Integer getClaimedEd(){return this.claimedEd;}

        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}

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

        public ConditionBuilder fuzzyName (List<String> fuzzyName){
            this.fuzzyName = fuzzyName;
            return this;
        }

        public ConditionBuilder fuzzyName (String ... fuzzyName){
            this.fuzzyName = solveNullList(fuzzyName);
            return this;
        }

        public ConditionBuilder rightFuzzyName (List<String> rightFuzzyName){
            this.rightFuzzyName = rightFuzzyName;
            return this;
        }

        public ConditionBuilder rightFuzzyName (String ... rightFuzzyName){
            this.rightFuzzyName = solveNullList(rightFuzzyName);
            return this;
        }

        public ConditionBuilder nameList(String ... name){
            this.nameList = solveNullList(name);
            return this;
        }

        public ConditionBuilder nameList(List<String> name){
            this.nameList = name;
            return this;
        }

        public ConditionBuilder claimedBetWeen(Integer claimedSt,Integer claimedEd){
            this.claimedSt = claimedSt;
            this.claimedEd = claimedEd;
            return this;
        }

        public ConditionBuilder claimedGreaterEqThan(Integer claimedSt){
            this.claimedSt = claimedSt;
            return this;
        }
        public ConditionBuilder claimedLessEqThan(Integer claimedEd){
            this.claimedEd = claimedEd;
            return this;
        }


        public ConditionBuilder claimedList(Integer ... claimed){
            this.claimedList = solveNullList(claimed);
            return this;
        }

        public ConditionBuilder claimedList(List<Integer> claimed){
            this.claimedList = claimed;
            return this;
        }

        public ConditionBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public ConditionBuilder fuzzyEmail (String ... fuzzyEmail){
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public ConditionBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public ConditionBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public ConditionBuilder emailList(String ... email){
            this.emailList = solveNullList(email);
            return this;
        }

        public ConditionBuilder emailList(List<String> email){
            this.emailList = email;
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

        private Special obj;

        public Builder(){
            this.obj = new Special();
        }

        public Builder specialID(String specialID){
            this.obj.setSpecialID(specialID);
            return this;
        }
        public Builder institutionName(String institutionName){
            this.obj.setInstitutionName(institutionName);
            return this;
        }
        public Builder userID(String userID){
            this.obj.setUserID(userID);
            return this;
        }
        public Builder name(String name){
            this.obj.setName(name);
            return this;
        }
        public Builder claimed(Integer claimed){
            this.obj.setClaimed(claimed);
            return this;
        }
        public Builder email(String email){
            this.obj.setEmail(email);
            return this;
        }
        public Special build(){return obj;}
    }

}
