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
public class PutawayPatent implements Serializable {

    private static final long serialVersionUID = 1575112804561L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String putawayID;

    /**
    * 
    * isNullAble:1
    */
    private String userID;

    /**
    * 
    * isNullAble:1
    */
    private String patentID;

    /**
    * 
    * isNullAble:0
    */
    private String time;

    /**
    * 
    * isNullAble:1
    */
    private String contact;

    /**
    * 
    * isNullAble:0
    */
    private String status;


    public void setPutawayID(String putawayID){this.putawayID = putawayID;}

    public String getPutawayID(){return this.putawayID;}

    public void setUserID(String userID){this.userID = userID;}

    public String getUserID(){return this.userID;}

    public void setPatentID(String patentID){this.patentID = patentID;}

    public String getPatentID(){return this.patentID;}

    public void setTime(String time){this.time = time;}

    public String getTime(){return this.time;}

    public void setContact(String contact){this.contact = contact;}

    public String getContact(){return this.contact;}

    public void setStatus(String status){this.status = status;}

    public String getStatus(){return this.status;}
    @Override
    public String toString() {
        return "PutawayPatent{" +
                "putawayID='" + putawayID + '\'' +
                "userID='" + userID + '\'' +
                "patentID='" + patentID + '\'' +
                "time='" + time + '\'' +
                "contact='" + contact + '\'' +
                "status='" + status + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private PutawayPatent set;

        private ConditionBuilder where;

        public UpdateBuilder set(PutawayPatent set){
            this.set = set;
            return this;
        }

        public PutawayPatent getSet(){
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

    public static class QueryBuilder extends PutawayPatent{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> putawayIDList;

        public List<String> getPutawayIDList(){return this.putawayIDList;}


        private List<String> fuzzyPutawayID;

        public List<String> getFuzzyPutawayID(){return this.fuzzyPutawayID;}

        private List<String> rightFuzzyPutawayID;

        public List<String> getRightFuzzyPutawayID(){return this.rightFuzzyPutawayID;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> patentIDList;

        public List<String> getPatentIDList(){return this.patentIDList;}


        private List<String> fuzzyPatentID;

        public List<String> getFuzzyPatentID(){return this.fuzzyPatentID;}

        private List<String> rightFuzzyPatentID;

        public List<String> getRightFuzzyPatentID(){return this.rightFuzzyPatentID;}
        private List<String> timeList;

        public List<String> getTimeList(){return this.timeList;}


        private List<String> fuzzyTime;

        public List<String> getFuzzyTime(){return this.fuzzyTime;}

        private List<String> rightFuzzyTime;

        public List<String> getRightFuzzyTime(){return this.rightFuzzyTime;}
        private List<String> contactList;

        public List<String> getContactList(){return this.contactList;}


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){return this.fuzzyContact;}

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){return this.rightFuzzyContact;}
        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyPutawayID (List<String> fuzzyPutawayID){
            this.fuzzyPutawayID = fuzzyPutawayID;
            return this;
        }

        public QueryBuilder fuzzyPutawayID (String ... fuzzyPutawayID){
            this.fuzzyPutawayID = solveNullList(fuzzyPutawayID);
            return this;
        }

        public QueryBuilder rightFuzzyPutawayID (List<String> rightFuzzyPutawayID){
            this.rightFuzzyPutawayID = rightFuzzyPutawayID;
            return this;
        }

        public QueryBuilder rightFuzzyPutawayID (String ... rightFuzzyPutawayID){
            this.rightFuzzyPutawayID = solveNullList(rightFuzzyPutawayID);
            return this;
        }

        public QueryBuilder putawayID(String putawayID){
            setPutawayID(putawayID);
            return this;
        }

        public QueryBuilder putawayIDList(String ... putawayID){
            this.putawayIDList = solveNullList(putawayID);
            return this;
        }

        public QueryBuilder putawayIDList(List<String> putawayID){
            this.putawayIDList = putawayID;
            return this;
        }

        public QueryBuilder fetchPutawayID(){
            setFetchFields("fetchFields","putawayID");
            return this;
        }

        public QueryBuilder excludePutawayID(){
            setFetchFields("excludeFields","putawayID");
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

        public QueryBuilder fuzzyTime (List<String> fuzzyTime){
            this.fuzzyTime = fuzzyTime;
            return this;
        }

        public QueryBuilder fuzzyTime (String ... fuzzyTime){
            this.fuzzyTime = solveNullList(fuzzyTime);
            return this;
        }

        public QueryBuilder rightFuzzyTime (List<String> rightFuzzyTime){
            this.rightFuzzyTime = rightFuzzyTime;
            return this;
        }

        public QueryBuilder rightFuzzyTime (String ... rightFuzzyTime){
            this.rightFuzzyTime = solveNullList(rightFuzzyTime);
            return this;
        }

        public QueryBuilder time(String time){
            setTime(time);
            return this;
        }

        public QueryBuilder timeList(String ... time){
            this.timeList = solveNullList(time);
            return this;
        }

        public QueryBuilder timeList(List<String> time){
            this.timeList = time;
            return this;
        }

        public QueryBuilder fetchTime(){
            setFetchFields("fetchFields","time");
            return this;
        }

        public QueryBuilder excludeTime(){
            setFetchFields("excludeFields","time");
            return this;
        }

        public QueryBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public QueryBuilder fuzzyContact (String ... fuzzyContact){
            this.fuzzyContact = solveNullList(fuzzyContact);
            return this;
        }

        public QueryBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public QueryBuilder rightFuzzyContact (String ... rightFuzzyContact){
            this.rightFuzzyContact = solveNullList(rightFuzzyContact);
            return this;
        }

        public QueryBuilder contact(String contact){
            setContact(contact);
            return this;
        }

        public QueryBuilder contactList(String ... contact){
            this.contactList = solveNullList(contact);
            return this;
        }

        public QueryBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public QueryBuilder fetchContact(){
            setFetchFields("fetchFields","contact");
            return this;
        }

        public QueryBuilder excludeContact(){
            setFetchFields("excludeFields","contact");
            return this;
        }

        public QueryBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public QueryBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public QueryBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public QueryBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public QueryBuilder status(String status){
            setStatus(status);
            return this;
        }

        public QueryBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public QueryBuilder statusList(List<String> status){
            this.statusList = status;
            return this;
        }

        public QueryBuilder fetchStatus(){
            setFetchFields("fetchFields","status");
            return this;
        }

        public QueryBuilder excludeStatus(){
            setFetchFields("excludeFields","status");
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

        public PutawayPatent build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> putawayIDList;

        public List<String> getPutawayIDList(){return this.putawayIDList;}


        private List<String> fuzzyPutawayID;

        public List<String> getFuzzyPutawayID(){return this.fuzzyPutawayID;}

        private List<String> rightFuzzyPutawayID;

        public List<String> getRightFuzzyPutawayID(){return this.rightFuzzyPutawayID;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> patentIDList;

        public List<String> getPatentIDList(){return this.patentIDList;}


        private List<String> fuzzyPatentID;

        public List<String> getFuzzyPatentID(){return this.fuzzyPatentID;}

        private List<String> rightFuzzyPatentID;

        public List<String> getRightFuzzyPatentID(){return this.rightFuzzyPatentID;}
        private List<String> timeList;

        public List<String> getTimeList(){return this.timeList;}


        private List<String> fuzzyTime;

        public List<String> getFuzzyTime(){return this.fuzzyTime;}

        private List<String> rightFuzzyTime;

        public List<String> getRightFuzzyTime(){return this.rightFuzzyTime;}
        private List<String> contactList;

        public List<String> getContactList(){return this.contactList;}


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){return this.fuzzyContact;}

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){return this.rightFuzzyContact;}
        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}

        public ConditionBuilder fuzzyPutawayID (List<String> fuzzyPutawayID){
            this.fuzzyPutawayID = fuzzyPutawayID;
            return this;
        }

        public ConditionBuilder fuzzyPutawayID (String ... fuzzyPutawayID){
            this.fuzzyPutawayID = solveNullList(fuzzyPutawayID);
            return this;
        }

        public ConditionBuilder rightFuzzyPutawayID (List<String> rightFuzzyPutawayID){
            this.rightFuzzyPutawayID = rightFuzzyPutawayID;
            return this;
        }

        public ConditionBuilder rightFuzzyPutawayID (String ... rightFuzzyPutawayID){
            this.rightFuzzyPutawayID = solveNullList(rightFuzzyPutawayID);
            return this;
        }

        public ConditionBuilder putawayIDList(String ... putawayID){
            this.putawayIDList = solveNullList(putawayID);
            return this;
        }

        public ConditionBuilder putawayIDList(List<String> putawayID){
            this.putawayIDList = putawayID;
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

        public ConditionBuilder fuzzyTime (List<String> fuzzyTime){
            this.fuzzyTime = fuzzyTime;
            return this;
        }

        public ConditionBuilder fuzzyTime (String ... fuzzyTime){
            this.fuzzyTime = solveNullList(fuzzyTime);
            return this;
        }

        public ConditionBuilder rightFuzzyTime (List<String> rightFuzzyTime){
            this.rightFuzzyTime = rightFuzzyTime;
            return this;
        }

        public ConditionBuilder rightFuzzyTime (String ... rightFuzzyTime){
            this.rightFuzzyTime = solveNullList(rightFuzzyTime);
            return this;
        }

        public ConditionBuilder timeList(String ... time){
            this.timeList = solveNullList(time);
            return this;
        }

        public ConditionBuilder timeList(List<String> time){
            this.timeList = time;
            return this;
        }

        public ConditionBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public ConditionBuilder fuzzyContact (String ... fuzzyContact){
            this.fuzzyContact = solveNullList(fuzzyContact);
            return this;
        }

        public ConditionBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public ConditionBuilder rightFuzzyContact (String ... rightFuzzyContact){
            this.rightFuzzyContact = solveNullList(rightFuzzyContact);
            return this;
        }

        public ConditionBuilder contactList(String ... contact){
            this.contactList = solveNullList(contact);
            return this;
        }

        public ConditionBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public ConditionBuilder fuzzyStatus (List<String> fuzzyStatus){
            this.fuzzyStatus = fuzzyStatus;
            return this;
        }

        public ConditionBuilder fuzzyStatus (String ... fuzzyStatus){
            this.fuzzyStatus = solveNullList(fuzzyStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (List<String> rightFuzzyStatus){
            this.rightFuzzyStatus = rightFuzzyStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyStatus (String ... rightFuzzyStatus){
            this.rightFuzzyStatus = solveNullList(rightFuzzyStatus);
            return this;
        }

        public ConditionBuilder statusList(String ... status){
            this.statusList = solveNullList(status);
            return this;
        }

        public ConditionBuilder statusList(List<String> status){
            this.statusList = status;
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

        private PutawayPatent obj;

        public Builder(){
            this.obj = new PutawayPatent();
        }

        public Builder putawayID(String putawayID){
            this.obj.setPutawayID(putawayID);
            return this;
        }
        public Builder userID(String userID){
            this.obj.setUserID(userID);
            return this;
        }
        public Builder patentID(String patentID){
            this.obj.setPatentID(patentID);
            return this;
        }
        public Builder time(String time){
            this.obj.setTime(time);
            return this;
        }
        public Builder contact(String contact){
            this.obj.setContact(contact);
            return this;
        }
        public Builder status(String status){
            this.obj.setStatus(status);
            return this;
        }
        public PutawayPatent build(){return obj;}
    }

}
