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
public class Patent implements Serializable {

    private static final long serialVersionUID = 1575112802604L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String patentID;

    /**
    * 
    * isNullAble:0
    */
    private String _abstract;

    /**
    * 
    * isNullAble:0
    */
    private String applicant;

    /**
    * 
    * isNullAble:1
    */
    private String address;

    /**
    * 
    * isNullAble:1
    */
    private String classCode;


    public void setPatentID(String patentID){this.patentID = patentID;}

    public String getPatentID(){return this.patentID;}

    public void set_abstract(String _abstract){this._abstract = _abstract;}

    public String get_abstract(){return this._abstract;}

    public void setApplicant(String applicant){this.applicant = applicant;}

    public String getApplicant(){return this.applicant;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}

    public void setClassCode(String classCode){this.classCode = classCode;}

    public String getClassCode(){return this.classCode;}
    @Override
    public String toString() {
        return "Patent{" +
                "patentID='" + patentID + '\'' +
                "abstract='" + _abstract + '\'' +
                "applicant='" + applicant + '\'' +
                "address='" + address + '\'' +
                "classCode='" + classCode + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Patent set;

        private ConditionBuilder where;

        public UpdateBuilder set(Patent set){
            this.set = set;
            return this;
        }

        public Patent getSet(){
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

    public static class QueryBuilder extends Patent{
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
        private List<String> abstractList;

        public List<String> getAbstractList(){return this.abstractList;}


        private List<String> fuzzyAbstract;

        public List<String> getFuzzyAbstract(){return this.fuzzyAbstract;}

        private List<String> rightFuzzyAbstract;

        public List<String> getRightFuzzyAbstract(){return this.rightFuzzyAbstract;}
        private List<String> applicantList;

        public List<String> getApplicantList(){return this.applicantList;}


        private List<String> fuzzyApplicant;

        public List<String> getFuzzyApplicant(){return this.fuzzyApplicant;}

        private List<String> rightFuzzyApplicant;

        public List<String> getRightFuzzyApplicant(){return this.rightFuzzyApplicant;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<String> classCodeList;

        public List<String> getClassCodeList(){return this.classCodeList;}


        private List<String> fuzzyClassCode;

        public List<String> getFuzzyClassCode(){return this.fuzzyClassCode;}

        private List<String> rightFuzzyClassCode;

        public List<String> getRightFuzzyClassCode(){return this.rightFuzzyClassCode;}
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

        public QueryBuilder fuzzyAbstract (List<String> fuzzyAbstract){
            this.fuzzyAbstract = fuzzyAbstract;
            return this;
        }

        public QueryBuilder fuzzyAbstract (String ... fuzzyAbstract){
            this.fuzzyAbstract = solveNullList(fuzzyAbstract);
            return this;
        }

        public QueryBuilder rightFuzzyAbstract (List<String> rightFuzzyAbstract){
            this.rightFuzzyAbstract = rightFuzzyAbstract;
            return this;
        }

        public QueryBuilder rightFuzzyAbstract (String ... rightFuzzyAbstract){
            this.rightFuzzyAbstract = solveNullList(rightFuzzyAbstract);
            return this;
        }

        public QueryBuilder _abstract(String _abstract){
            set_abstract(_abstract);
            return this;
        }

        public QueryBuilder abstractList(String ... _abstract){
            this.abstractList = solveNullList(_abstract);
            return this;
        }

        public QueryBuilder abstractList(List<String> _abstract){
            this.abstractList = _abstract;
            return this;
        }

        public QueryBuilder fetchAbstract(){
            setFetchFields("fetchFields","abstract");
            return this;
        }

        public QueryBuilder excludeAbstract(){
            setFetchFields("excludeFields","abstract");
            return this;
        }

        public QueryBuilder fuzzyApplicant (List<String> fuzzyApplicant){
            this.fuzzyApplicant = fuzzyApplicant;
            return this;
        }

        public QueryBuilder fuzzyApplicant (String ... fuzzyApplicant){
            this.fuzzyApplicant = solveNullList(fuzzyApplicant);
            return this;
        }

        public QueryBuilder rightFuzzyApplicant (List<String> rightFuzzyApplicant){
            this.rightFuzzyApplicant = rightFuzzyApplicant;
            return this;
        }

        public QueryBuilder rightFuzzyApplicant (String ... rightFuzzyApplicant){
            this.rightFuzzyApplicant = solveNullList(rightFuzzyApplicant);
            return this;
        }

        public QueryBuilder applicant(String applicant){
            setApplicant(applicant);
            return this;
        }

        public QueryBuilder applicantList(String ... applicant){
            this.applicantList = solveNullList(applicant);
            return this;
        }

        public QueryBuilder applicantList(List<String> applicant){
            this.applicantList = applicant;
            return this;
        }

        public QueryBuilder fetchApplicant(){
            setFetchFields("fetchFields","applicant");
            return this;
        }

        public QueryBuilder excludeApplicant(){
            setFetchFields("excludeFields","applicant");
            return this;
        }

        public QueryBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public QueryBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public QueryBuilder address(String address){
            setAddress(address);
            return this;
        }

        public QueryBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public QueryBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public QueryBuilder fetchAddress(){
            setFetchFields("fetchFields","address");
            return this;
        }

        public QueryBuilder excludeAddress(){
            setFetchFields("excludeFields","address");
            return this;
        }

        public QueryBuilder fuzzyClassCode (List<String> fuzzyClassCode){
            this.fuzzyClassCode = fuzzyClassCode;
            return this;
        }

        public QueryBuilder fuzzyClassCode (String ... fuzzyClassCode){
            this.fuzzyClassCode = solveNullList(fuzzyClassCode);
            return this;
        }

        public QueryBuilder rightFuzzyClassCode (List<String> rightFuzzyClassCode){
            this.rightFuzzyClassCode = rightFuzzyClassCode;
            return this;
        }

        public QueryBuilder rightFuzzyClassCode (String ... rightFuzzyClassCode){
            this.rightFuzzyClassCode = solveNullList(rightFuzzyClassCode);
            return this;
        }

        public QueryBuilder classCode(String classCode){
            setClassCode(classCode);
            return this;
        }

        public QueryBuilder classCodeList(String ... classCode){
            this.classCodeList = solveNullList(classCode);
            return this;
        }

        public QueryBuilder classCodeList(List<String> classCode){
            this.classCodeList = classCode;
            return this;
        }

        public QueryBuilder fetchClassCode(){
            setFetchFields("fetchFields","classCode");
            return this;
        }

        public QueryBuilder excludeClassCode(){
            setFetchFields("excludeFields","classCode");
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

        public Patent build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> patentIDList;

        public List<String> getPatentIDList(){return this.patentIDList;}


        private List<String> fuzzyPatentID;

        public List<String> getFuzzyPatentID(){return this.fuzzyPatentID;}

        private List<String> rightFuzzyPatentID;

        public List<String> getRightFuzzyPatentID(){return this.rightFuzzyPatentID;}
        private List<String> abstractList;

        public List<String> getAbstractList(){return this.abstractList;}


        private List<String> fuzzyAbstract;

        public List<String> getFuzzyAbstract(){return this.fuzzyAbstract;}

        private List<String> rightFuzzyAbstract;

        public List<String> getRightFuzzyAbstract(){return this.rightFuzzyAbstract;}
        private List<String> applicantList;

        public List<String> getApplicantList(){return this.applicantList;}


        private List<String> fuzzyApplicant;

        public List<String> getFuzzyApplicant(){return this.fuzzyApplicant;}

        private List<String> rightFuzzyApplicant;

        public List<String> getRightFuzzyApplicant(){return this.rightFuzzyApplicant;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<String> classCodeList;

        public List<String> getClassCodeList(){return this.classCodeList;}


        private List<String> fuzzyClassCode;

        public List<String> getFuzzyClassCode(){return this.fuzzyClassCode;}

        private List<String> rightFuzzyClassCode;

        public List<String> getRightFuzzyClassCode(){return this.rightFuzzyClassCode;}

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

        public ConditionBuilder fuzzyAbstract (List<String> fuzzyAbstract){
            this.fuzzyAbstract = fuzzyAbstract;
            return this;
        }

        public ConditionBuilder fuzzyAbstract (String ... fuzzyAbstract){
            this.fuzzyAbstract = solveNullList(fuzzyAbstract);
            return this;
        }

        public ConditionBuilder rightFuzzyAbstract (List<String> rightFuzzyAbstract){
            this.rightFuzzyAbstract = rightFuzzyAbstract;
            return this;
        }

        public ConditionBuilder rightFuzzyAbstract (String ... rightFuzzyAbstract){
            this.rightFuzzyAbstract = solveNullList(rightFuzzyAbstract);
            return this;
        }

        public ConditionBuilder abstractList(String ... _abstract){
            this.abstractList = solveNullList(_abstract);
            return this;
        }

        public ConditionBuilder abstractList(List<String> _abstract){
            this.abstractList = _abstract;
            return this;
        }

        public ConditionBuilder fuzzyApplicant (List<String> fuzzyApplicant){
            this.fuzzyApplicant = fuzzyApplicant;
            return this;
        }

        public ConditionBuilder fuzzyApplicant (String ... fuzzyApplicant){
            this.fuzzyApplicant = solveNullList(fuzzyApplicant);
            return this;
        }

        public ConditionBuilder rightFuzzyApplicant (List<String> rightFuzzyApplicant){
            this.rightFuzzyApplicant = rightFuzzyApplicant;
            return this;
        }

        public ConditionBuilder rightFuzzyApplicant (String ... rightFuzzyApplicant){
            this.rightFuzzyApplicant = solveNullList(rightFuzzyApplicant);
            return this;
        }

        public ConditionBuilder applicantList(String ... applicant){
            this.applicantList = solveNullList(applicant);
            return this;
        }

        public ConditionBuilder applicantList(List<String> applicant){
            this.applicantList = applicant;
            return this;
        }

        public ConditionBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public ConditionBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public ConditionBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public ConditionBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public ConditionBuilder fuzzyClassCode (List<String> fuzzyClassCode){
            this.fuzzyClassCode = fuzzyClassCode;
            return this;
        }

        public ConditionBuilder fuzzyClassCode (String ... fuzzyClassCode){
            this.fuzzyClassCode = solveNullList(fuzzyClassCode);
            return this;
        }

        public ConditionBuilder rightFuzzyClassCode (List<String> rightFuzzyClassCode){
            this.rightFuzzyClassCode = rightFuzzyClassCode;
            return this;
        }

        public ConditionBuilder rightFuzzyClassCode (String ... rightFuzzyClassCode){
            this.rightFuzzyClassCode = solveNullList(rightFuzzyClassCode);
            return this;
        }

        public ConditionBuilder classCodeList(String ... classCode){
            this.classCodeList = solveNullList(classCode);
            return this;
        }

        public ConditionBuilder classCodeList(List<String> classCode){
            this.classCodeList = classCode;
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

        private Patent obj;

        public Builder(){
            this.obj = new Patent();
        }

        public Builder patentID(String patentID){
            this.obj.setPatentID(patentID);
            return this;
        }
        public Builder _abstract(String _abstract){
            this.obj.set_abstract(_abstract);
            return this;
        }
        public Builder applicant(String applicant){
            this.obj.setApplicant(applicant);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Builder classCode(String classCode){
            this.obj.setClassCode(classCode);
            return this;
        }
        public Patent build(){return obj;}
    }

}
