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
public class User implements Serializable {

    private static final long serialVersionUID = 1575112808769L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String userID;

    /**
    * 
    * isNullAble:1
    */
    private String specialID;

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

    /**
    * 
    * isNullAble:0
    */
    private String createTime;

    /**
    * 
    * isNullAble:0
    */
    private String email;

    /**
    * 
    * isNullAble:1
    */
    private Long qq;

    /**
    * 
    * isNullAble:1
    */
    private String wechat;

    /**
    * 
    * isNullAble:1
    */
    private Long telephone;


    public void setUserID(String userID){this.userID = userID;}

    public String getUserID(){return this.userID;}

    public void setSpecialID(String specialID){this.specialID = specialID;}

    public String getSpecialID(){return this.specialID;}

    public void setUserName(String userName){this.userName = userName;}

    public String getUserName(){return this.userName;}

    public void setPassword(String password){this.password = password;}

    public String getPassword(){return this.password;}

    public void setCreateTime(String createTime){this.createTime = createTime;}

    public String getCreateTime(){return this.createTime;}

    public void setEmail(String email){this.email = email;}

    public String getEmail(){return this.email;}

    public void setQq(Long qq){this.qq = qq;}

    public Long getQq(){return this.qq;}

    public void setWechat(String wechat){this.wechat = wechat;}

    public String getWechat(){return this.wechat;}

    public void setTelephone(Long telephone){this.telephone = telephone;}

    public Long getTelephone(){return this.telephone;}
    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                "specialID='" + specialID + '\'' +
                "userName='" + userName + '\'' +
                "password='" + password + '\'' +
                "createTime='" + createTime + '\'' +
                "email='" + email + '\'' +
                "qq='" + qq + '\'' +
                "wechat='" + wechat + '\'' +
                "telephone='" + telephone + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private User set;

        private ConditionBuilder where;

        public UpdateBuilder set(User set){
            this.set = set;
            return this;
        }

        public User getSet(){
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

    public static class QueryBuilder extends User{
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
        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}
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
        private List<String> createTimeList;

        public List<String> getCreateTimeList(){return this.createTimeList;}


        private List<String> fuzzyCreateTime;

        public List<String> getFuzzyCreateTime(){return this.fuzzyCreateTime;}

        private List<String> rightFuzzyCreateTime;

        public List<String> getRightFuzzyCreateTime(){return this.rightFuzzyCreateTime;}
        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}
        private List<Long> qqList;

        public List<Long> getQqList(){return this.qqList;}

        private Long qqSt;

        private Long qqEd;

        public Long getQqSt(){return this.qqSt;}

        public Long getQqEd(){return this.qqEd;}

        private List<String> wechatList;

        public List<String> getWechatList(){return this.wechatList;}


        private List<String> fuzzyWechat;

        public List<String> getFuzzyWechat(){return this.fuzzyWechat;}

        private List<String> rightFuzzyWechat;

        public List<String> getRightFuzzyWechat(){return this.rightFuzzyWechat;}
        private List<Long> telephoneList;

        public List<Long> getTelephoneList(){return this.telephoneList;}

        private Long telephoneSt;

        private Long telephoneEd;

        public Long getTelephoneSt(){return this.telephoneSt;}

        public Long getTelephoneEd(){return this.telephoneEd;}

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

        public QueryBuilder fuzzyCreateTime (List<String> fuzzyCreateTime){
            this.fuzzyCreateTime = fuzzyCreateTime;
            return this;
        }

        public QueryBuilder fuzzyCreateTime (String ... fuzzyCreateTime){
            this.fuzzyCreateTime = solveNullList(fuzzyCreateTime);
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (List<String> rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = rightFuzzyCreateTime;
            return this;
        }

        public QueryBuilder rightFuzzyCreateTime (String ... rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = solveNullList(rightFuzzyCreateTime);
            return this;
        }

        public QueryBuilder createTime(String createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(String ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<String> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
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

        public QueryBuilder qqBetWeen(Long qqSt,Long qqEd){
            this.qqSt = qqSt;
            this.qqEd = qqEd;
            return this;
        }

        public QueryBuilder qqGreaterEqThan(Long qqSt){
            this.qqSt = qqSt;
            return this;
        }
        public QueryBuilder qqLessEqThan(Long qqEd){
            this.qqEd = qqEd;
            return this;
        }


        public QueryBuilder qq(Long qq){
            setQq(qq);
            return this;
        }

        public QueryBuilder qqList(Long ... qq){
            this.qqList = solveNullList(qq);
            return this;
        }

        public QueryBuilder qqList(List<Long> qq){
            this.qqList = qq;
            return this;
        }

        public QueryBuilder fetchQq(){
            setFetchFields("fetchFields","qq");
            return this;
        }

        public QueryBuilder excludeQq(){
            setFetchFields("excludeFields","qq");
            return this;
        }

        public QueryBuilder fuzzyWechat (List<String> fuzzyWechat){
            this.fuzzyWechat = fuzzyWechat;
            return this;
        }

        public QueryBuilder fuzzyWechat (String ... fuzzyWechat){
            this.fuzzyWechat = solveNullList(fuzzyWechat);
            return this;
        }

        public QueryBuilder rightFuzzyWechat (List<String> rightFuzzyWechat){
            this.rightFuzzyWechat = rightFuzzyWechat;
            return this;
        }

        public QueryBuilder rightFuzzyWechat (String ... rightFuzzyWechat){
            this.rightFuzzyWechat = solveNullList(rightFuzzyWechat);
            return this;
        }

        public QueryBuilder wechat(String wechat){
            setWechat(wechat);
            return this;
        }

        public QueryBuilder wechatList(String ... wechat){
            this.wechatList = solveNullList(wechat);
            return this;
        }

        public QueryBuilder wechatList(List<String> wechat){
            this.wechatList = wechat;
            return this;
        }

        public QueryBuilder fetchWechat(){
            setFetchFields("fetchFields","wechat");
            return this;
        }

        public QueryBuilder excludeWechat(){
            setFetchFields("excludeFields","wechat");
            return this;
        }

        public QueryBuilder telephoneBetWeen(Long telephoneSt,Long telephoneEd){
            this.telephoneSt = telephoneSt;
            this.telephoneEd = telephoneEd;
            return this;
        }

        public QueryBuilder telephoneGreaterEqThan(Long telephoneSt){
            this.telephoneSt = telephoneSt;
            return this;
        }
        public QueryBuilder telephoneLessEqThan(Long telephoneEd){
            this.telephoneEd = telephoneEd;
            return this;
        }


        public QueryBuilder telephone(Long telephone){
            setTelephone(telephone);
            return this;
        }

        public QueryBuilder telephoneList(Long ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public QueryBuilder telephoneList(List<Long> telephone){
            this.telephoneList = telephone;
            return this;
        }

        public QueryBuilder fetchTelephone(){
            setFetchFields("fetchFields","telephone");
            return this;
        }

        public QueryBuilder excludeTelephone(){
            setFetchFields("excludeFields","telephone");
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

        public User build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> specialIDList;

        public List<String> getSpecialIDList(){return this.specialIDList;}


        private List<String> fuzzySpecialID;

        public List<String> getFuzzySpecialID(){return this.fuzzySpecialID;}

        private List<String> rightFuzzySpecialID;

        public List<String> getRightFuzzySpecialID(){return this.rightFuzzySpecialID;}
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
        private List<String> createTimeList;

        public List<String> getCreateTimeList(){return this.createTimeList;}


        private List<String> fuzzyCreateTime;

        public List<String> getFuzzyCreateTime(){return this.fuzzyCreateTime;}

        private List<String> rightFuzzyCreateTime;

        public List<String> getRightFuzzyCreateTime(){return this.rightFuzzyCreateTime;}
        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}
        private List<Long> qqList;

        public List<Long> getQqList(){return this.qqList;}

        private Long qqSt;

        private Long qqEd;

        public Long getQqSt(){return this.qqSt;}

        public Long getQqEd(){return this.qqEd;}

        private List<String> wechatList;

        public List<String> getWechatList(){return this.wechatList;}


        private List<String> fuzzyWechat;

        public List<String> getFuzzyWechat(){return this.fuzzyWechat;}

        private List<String> rightFuzzyWechat;

        public List<String> getRightFuzzyWechat(){return this.rightFuzzyWechat;}
        private List<Long> telephoneList;

        public List<Long> getTelephoneList(){return this.telephoneList;}

        private Long telephoneSt;

        private Long telephoneEd;

        public Long getTelephoneSt(){return this.telephoneSt;}

        public Long getTelephoneEd(){return this.telephoneEd;}


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

        public ConditionBuilder fuzzyCreateTime (List<String> fuzzyCreateTime){
            this.fuzzyCreateTime = fuzzyCreateTime;
            return this;
        }

        public ConditionBuilder fuzzyCreateTime (String ... fuzzyCreateTime){
            this.fuzzyCreateTime = solveNullList(fuzzyCreateTime);
            return this;
        }

        public ConditionBuilder rightFuzzyCreateTime (List<String> rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = rightFuzzyCreateTime;
            return this;
        }

        public ConditionBuilder rightFuzzyCreateTime (String ... rightFuzzyCreateTime){
            this.rightFuzzyCreateTime = solveNullList(rightFuzzyCreateTime);
            return this;
        }

        public ConditionBuilder createTimeList(String ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<String> createTime){
            this.createTimeList = createTime;
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

        public ConditionBuilder qqBetWeen(Long qqSt,Long qqEd){
            this.qqSt = qqSt;
            this.qqEd = qqEd;
            return this;
        }

        public ConditionBuilder qqGreaterEqThan(Long qqSt){
            this.qqSt = qqSt;
            return this;
        }
        public ConditionBuilder qqLessEqThan(Long qqEd){
            this.qqEd = qqEd;
            return this;
        }


        public ConditionBuilder qqList(Long ... qq){
            this.qqList = solveNullList(qq);
            return this;
        }

        public ConditionBuilder qqList(List<Long> qq){
            this.qqList = qq;
            return this;
        }

        public ConditionBuilder fuzzyWechat (List<String> fuzzyWechat){
            this.fuzzyWechat = fuzzyWechat;
            return this;
        }

        public ConditionBuilder fuzzyWechat (String ... fuzzyWechat){
            this.fuzzyWechat = solveNullList(fuzzyWechat);
            return this;
        }

        public ConditionBuilder rightFuzzyWechat (List<String> rightFuzzyWechat){
            this.rightFuzzyWechat = rightFuzzyWechat;
            return this;
        }

        public ConditionBuilder rightFuzzyWechat (String ... rightFuzzyWechat){
            this.rightFuzzyWechat = solveNullList(rightFuzzyWechat);
            return this;
        }

        public ConditionBuilder wechatList(String ... wechat){
            this.wechatList = solveNullList(wechat);
            return this;
        }

        public ConditionBuilder wechatList(List<String> wechat){
            this.wechatList = wechat;
            return this;
        }

        public ConditionBuilder telephoneBetWeen(Long telephoneSt,Long telephoneEd){
            this.telephoneSt = telephoneSt;
            this.telephoneEd = telephoneEd;
            return this;
        }

        public ConditionBuilder telephoneGreaterEqThan(Long telephoneSt){
            this.telephoneSt = telephoneSt;
            return this;
        }
        public ConditionBuilder telephoneLessEqThan(Long telephoneEd){
            this.telephoneEd = telephoneEd;
            return this;
        }


        public ConditionBuilder telephoneList(Long ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public ConditionBuilder telephoneList(List<Long> telephone){
            this.telephoneList = telephone;
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

        private User obj;

        public Builder(){
            this.obj = new User();
        }

        public Builder userID(String userID){
            this.obj.setUserID(userID);
            return this;
        }
        public Builder specialID(String specialID){
            this.obj.setSpecialID(specialID);
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
        public Builder createTime(String createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder email(String email){
            this.obj.setEmail(email);
            return this;
        }
        public Builder qq(Long qq){
            this.obj.setQq(qq);
            return this;
        }
        public Builder wechat(String wechat){
            this.obj.setWechat(wechat);
            return this;
        }
        public Builder telephone(Long telephone){
            this.obj.setTelephone(telephone);
            return this;
        }
        public User build(){return obj;}
    }

}
