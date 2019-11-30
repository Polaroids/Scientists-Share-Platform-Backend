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
public class CertificationAudit implements Serializable {

    private static final long serialVersionUID = 1575112791509L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String auditID;

    /**
    * 
    * isNullAble:1
    */
    private String adminID;

    /**
    * 
    * isNullAble:1
    */
    private String userID;

    /**
    * 
    * isNullAble:1
    */
    private String files;

    /**
    * 
    * isNullAble:0
    */
    private String status;


    public void setAuditID(String auditID){this.auditID = auditID;}

    public String getAuditID(){return this.auditID;}

    public void setAdminID(String adminID){this.adminID = adminID;}

    public String getAdminID(){return this.adminID;}

    public void setUserID(String userID){this.userID = userID;}

    public String getUserID(){return this.userID;}

    public void setFiles(String files){this.files = files;}

    public String getFiles(){return this.files;}

    public void setStatus(String status){this.status = status;}

    public String getStatus(){return this.status;}
    @Override
    public String toString() {
        return "CertificationAudit{" +
                "auditID='" + auditID + '\'' +
                "adminID='" + adminID + '\'' +
                "userID='" + userID + '\'' +
                "files='" + files + '\'' +
                "status='" + status + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CertificationAudit set;

        private ConditionBuilder where;

        public UpdateBuilder set(CertificationAudit set){
            this.set = set;
            return this;
        }

        public CertificationAudit getSet(){
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

    public static class QueryBuilder extends CertificationAudit{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> auditIDList;

        public List<String> getAuditIDList(){return this.auditIDList;}


        private List<String> fuzzyAuditID;

        public List<String> getFuzzyAuditID(){return this.fuzzyAuditID;}

        private List<String> rightFuzzyAuditID;

        public List<String> getRightFuzzyAuditID(){return this.rightFuzzyAuditID;}
        private List<String> adminIDList;

        public List<String> getAdminIDList(){return this.adminIDList;}


        private List<String> fuzzyAdminID;

        public List<String> getFuzzyAdminID(){return this.fuzzyAdminID;}

        private List<String> rightFuzzyAdminID;

        public List<String> getRightFuzzyAdminID(){return this.rightFuzzyAdminID;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> filesList;

        public List<String> getFilesList(){return this.filesList;}


        private List<String> fuzzyFiles;

        public List<String> getFuzzyFiles(){return this.fuzzyFiles;}

        private List<String> rightFuzzyFiles;

        public List<String> getRightFuzzyFiles(){return this.rightFuzzyFiles;}
        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder fuzzyAuditID (List<String> fuzzyAuditID){
            this.fuzzyAuditID = fuzzyAuditID;
            return this;
        }

        public QueryBuilder fuzzyAuditID (String ... fuzzyAuditID){
            this.fuzzyAuditID = solveNullList(fuzzyAuditID);
            return this;
        }

        public QueryBuilder rightFuzzyAuditID (List<String> rightFuzzyAuditID){
            this.rightFuzzyAuditID = rightFuzzyAuditID;
            return this;
        }

        public QueryBuilder rightFuzzyAuditID (String ... rightFuzzyAuditID){
            this.rightFuzzyAuditID = solveNullList(rightFuzzyAuditID);
            return this;
        }

        public QueryBuilder auditID(String auditID){
            setAuditID(auditID);
            return this;
        }

        public QueryBuilder auditIDList(String ... auditID){
            this.auditIDList = solveNullList(auditID);
            return this;
        }

        public QueryBuilder auditIDList(List<String> auditID){
            this.auditIDList = auditID;
            return this;
        }

        public QueryBuilder fetchAuditID(){
            setFetchFields("fetchFields","auditID");
            return this;
        }

        public QueryBuilder excludeAuditID(){
            setFetchFields("excludeFields","auditID");
            return this;
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

        public QueryBuilder fuzzyFiles (List<String> fuzzyFiles){
            this.fuzzyFiles = fuzzyFiles;
            return this;
        }

        public QueryBuilder fuzzyFiles (String ... fuzzyFiles){
            this.fuzzyFiles = solveNullList(fuzzyFiles);
            return this;
        }

        public QueryBuilder rightFuzzyFiles (List<String> rightFuzzyFiles){
            this.rightFuzzyFiles = rightFuzzyFiles;
            return this;
        }

        public QueryBuilder rightFuzzyFiles (String ... rightFuzzyFiles){
            this.rightFuzzyFiles = solveNullList(rightFuzzyFiles);
            return this;
        }

        public QueryBuilder files(String files){
            setFiles(files);
            return this;
        }

        public QueryBuilder filesList(String ... files){
            this.filesList = solveNullList(files);
            return this;
        }

        public QueryBuilder filesList(List<String> files){
            this.filesList = files;
            return this;
        }

        public QueryBuilder fetchFiles(){
            setFetchFields("fetchFields","files");
            return this;
        }

        public QueryBuilder excludeFiles(){
            setFetchFields("excludeFields","files");
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

        public CertificationAudit build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> auditIDList;

        public List<String> getAuditIDList(){return this.auditIDList;}


        private List<String> fuzzyAuditID;

        public List<String> getFuzzyAuditID(){return this.fuzzyAuditID;}

        private List<String> rightFuzzyAuditID;

        public List<String> getRightFuzzyAuditID(){return this.rightFuzzyAuditID;}
        private List<String> adminIDList;

        public List<String> getAdminIDList(){return this.adminIDList;}


        private List<String> fuzzyAdminID;

        public List<String> getFuzzyAdminID(){return this.fuzzyAdminID;}

        private List<String> rightFuzzyAdminID;

        public List<String> getRightFuzzyAdminID(){return this.rightFuzzyAdminID;}
        private List<String> userIDList;

        public List<String> getUserIDList(){return this.userIDList;}


        private List<String> fuzzyUserID;

        public List<String> getFuzzyUserID(){return this.fuzzyUserID;}

        private List<String> rightFuzzyUserID;

        public List<String> getRightFuzzyUserID(){return this.rightFuzzyUserID;}
        private List<String> filesList;

        public List<String> getFilesList(){return this.filesList;}


        private List<String> fuzzyFiles;

        public List<String> getFuzzyFiles(){return this.fuzzyFiles;}

        private List<String> rightFuzzyFiles;

        public List<String> getRightFuzzyFiles(){return this.rightFuzzyFiles;}
        private List<String> statusList;

        public List<String> getStatusList(){return this.statusList;}


        private List<String> fuzzyStatus;

        public List<String> getFuzzyStatus(){return this.fuzzyStatus;}

        private List<String> rightFuzzyStatus;

        public List<String> getRightFuzzyStatus(){return this.rightFuzzyStatus;}

        public ConditionBuilder fuzzyAuditID (List<String> fuzzyAuditID){
            this.fuzzyAuditID = fuzzyAuditID;
            return this;
        }

        public ConditionBuilder fuzzyAuditID (String ... fuzzyAuditID){
            this.fuzzyAuditID = solveNullList(fuzzyAuditID);
            return this;
        }

        public ConditionBuilder rightFuzzyAuditID (List<String> rightFuzzyAuditID){
            this.rightFuzzyAuditID = rightFuzzyAuditID;
            return this;
        }

        public ConditionBuilder rightFuzzyAuditID (String ... rightFuzzyAuditID){
            this.rightFuzzyAuditID = solveNullList(rightFuzzyAuditID);
            return this;
        }

        public ConditionBuilder auditIDList(String ... auditID){
            this.auditIDList = solveNullList(auditID);
            return this;
        }

        public ConditionBuilder auditIDList(List<String> auditID){
            this.auditIDList = auditID;
            return this;
        }

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

        public ConditionBuilder fuzzyFiles (List<String> fuzzyFiles){
            this.fuzzyFiles = fuzzyFiles;
            return this;
        }

        public ConditionBuilder fuzzyFiles (String ... fuzzyFiles){
            this.fuzzyFiles = solveNullList(fuzzyFiles);
            return this;
        }

        public ConditionBuilder rightFuzzyFiles (List<String> rightFuzzyFiles){
            this.rightFuzzyFiles = rightFuzzyFiles;
            return this;
        }

        public ConditionBuilder rightFuzzyFiles (String ... rightFuzzyFiles){
            this.rightFuzzyFiles = solveNullList(rightFuzzyFiles);
            return this;
        }

        public ConditionBuilder filesList(String ... files){
            this.filesList = solveNullList(files);
            return this;
        }

        public ConditionBuilder filesList(List<String> files){
            this.filesList = files;
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

        private CertificationAudit obj;

        public Builder(){
            this.obj = new CertificationAudit();
        }

        public Builder auditID(String auditID){
            this.obj.setAuditID(auditID);
            return this;
        }
        public Builder adminID(String adminID){
            this.obj.setAdminID(adminID);
            return this;
        }
        public Builder userID(String userID){
            this.obj.setUserID(userID);
            return this;
        }
        public Builder files(String files){
            this.obj.setFiles(files);
            return this;
        }
        public Builder status(String status){
            this.obj.setStatus(status);
            return this;
        }
        public CertificationAudit build(){return obj;}
    }

}
