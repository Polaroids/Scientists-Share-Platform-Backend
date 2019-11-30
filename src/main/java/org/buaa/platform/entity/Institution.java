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
public class Institution implements Serializable {

    private static final long serialVersionUID = 1575112798024L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String institutionName;

    /**
    * 
    * isNullAble:0
    */
    private String discription;

    /**
    * 
    * isNullAble:1
    */
    private String url;

    /**
    * 
    * isNullAble:1
    */
    private String imgUrl;

    /**
    * 
    * isNullAble:1
    */
    private String address;


    public void setInstitutionName(String institutionName){this.institutionName = institutionName;}

    public String getInstitutionName(){return this.institutionName;}

    public void setDiscription(String discription){this.discription = discription;}

    public String getDiscription(){return this.discription;}

    public void setUrl(String url){this.url = url;}

    public String getUrl(){return this.url;}

    public void setImgUrl(String imgUrl){this.imgUrl = imgUrl;}

    public String getImgUrl(){return this.imgUrl;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}
    @Override
    public String toString() {
        return "Institution{" +
                "institutionName='" + institutionName + '\'' +
                "discription='" + discription + '\'' +
                "url='" + url + '\'' +
                "imgUrl='" + imgUrl + '\'' +
                "address='" + address + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Institution set;

        private ConditionBuilder where;

        public UpdateBuilder set(Institution set){
            this.set = set;
            return this;
        }

        public Institution getSet(){
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

    public static class QueryBuilder extends Institution{
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
        private List<String> discriptionList;

        public List<String> getDiscriptionList(){return this.discriptionList;}


        private List<String> fuzzyDiscription;

        public List<String> getFuzzyDiscription(){return this.fuzzyDiscription;}

        private List<String> rightFuzzyDiscription;

        public List<String> getRightFuzzyDiscription(){return this.rightFuzzyDiscription;}
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> imgUrlList;

        public List<String> getImgUrlList(){return this.imgUrlList;}


        private List<String> fuzzyImgUrl;

        public List<String> getFuzzyImgUrl(){return this.fuzzyImgUrl;}

        private List<String> rightFuzzyImgUrl;

        public List<String> getRightFuzzyImgUrl(){return this.rightFuzzyImgUrl;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
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

        public QueryBuilder fuzzyDiscription (List<String> fuzzyDiscription){
            this.fuzzyDiscription = fuzzyDiscription;
            return this;
        }

        public QueryBuilder fuzzyDiscription (String ... fuzzyDiscription){
            this.fuzzyDiscription = solveNullList(fuzzyDiscription);
            return this;
        }

        public QueryBuilder rightFuzzyDiscription (List<String> rightFuzzyDiscription){
            this.rightFuzzyDiscription = rightFuzzyDiscription;
            return this;
        }

        public QueryBuilder rightFuzzyDiscription (String ... rightFuzzyDiscription){
            this.rightFuzzyDiscription = solveNullList(rightFuzzyDiscription);
            return this;
        }

        public QueryBuilder discription(String discription){
            setDiscription(discription);
            return this;
        }

        public QueryBuilder discriptionList(String ... discription){
            this.discriptionList = solveNullList(discription);
            return this;
        }

        public QueryBuilder discriptionList(List<String> discription){
            this.discriptionList = discription;
            return this;
        }

        public QueryBuilder fetchDiscription(){
            setFetchFields("fetchFields","discription");
            return this;
        }

        public QueryBuilder excludeDiscription(){
            setFetchFields("excludeFields","discription");
            return this;
        }

        public QueryBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public QueryBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public QueryBuilder url(String url){
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public QueryBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl(){
            setFetchFields("fetchFields","url");
            return this;
        }

        public QueryBuilder excludeUrl(){
            setFetchFields("excludeFields","url");
            return this;
        }

        public QueryBuilder fuzzyImgUrl (List<String> fuzzyImgUrl){
            this.fuzzyImgUrl = fuzzyImgUrl;
            return this;
        }

        public QueryBuilder fuzzyImgUrl (String ... fuzzyImgUrl){
            this.fuzzyImgUrl = solveNullList(fuzzyImgUrl);
            return this;
        }

        public QueryBuilder rightFuzzyImgUrl (List<String> rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = rightFuzzyImgUrl;
            return this;
        }

        public QueryBuilder rightFuzzyImgUrl (String ... rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = solveNullList(rightFuzzyImgUrl);
            return this;
        }

        public QueryBuilder imgUrl(String imgUrl){
            setImgUrl(imgUrl);
            return this;
        }

        public QueryBuilder imgUrlList(String ... imgUrl){
            this.imgUrlList = solveNullList(imgUrl);
            return this;
        }

        public QueryBuilder imgUrlList(List<String> imgUrl){
            this.imgUrlList = imgUrl;
            return this;
        }

        public QueryBuilder fetchImgUrl(){
            setFetchFields("fetchFields","imgUrl");
            return this;
        }

        public QueryBuilder excludeImgUrl(){
            setFetchFields("excludeFields","imgUrl");
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

        public Institution build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> institutionNameList;

        public List<String> getInstitutionNameList(){return this.institutionNameList;}


        private List<String> fuzzyInstitutionName;

        public List<String> getFuzzyInstitutionName(){return this.fuzzyInstitutionName;}

        private List<String> rightFuzzyInstitutionName;

        public List<String> getRightFuzzyInstitutionName(){return this.rightFuzzyInstitutionName;}
        private List<String> discriptionList;

        public List<String> getDiscriptionList(){return this.discriptionList;}


        private List<String> fuzzyDiscription;

        public List<String> getFuzzyDiscription(){return this.fuzzyDiscription;}

        private List<String> rightFuzzyDiscription;

        public List<String> getRightFuzzyDiscription(){return this.rightFuzzyDiscription;}
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> imgUrlList;

        public List<String> getImgUrlList(){return this.imgUrlList;}


        private List<String> fuzzyImgUrl;

        public List<String> getFuzzyImgUrl(){return this.fuzzyImgUrl;}

        private List<String> rightFuzzyImgUrl;

        public List<String> getRightFuzzyImgUrl(){return this.rightFuzzyImgUrl;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}

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

        public ConditionBuilder fuzzyDiscription (List<String> fuzzyDiscription){
            this.fuzzyDiscription = fuzzyDiscription;
            return this;
        }

        public ConditionBuilder fuzzyDiscription (String ... fuzzyDiscription){
            this.fuzzyDiscription = solveNullList(fuzzyDiscription);
            return this;
        }

        public ConditionBuilder rightFuzzyDiscription (List<String> rightFuzzyDiscription){
            this.rightFuzzyDiscription = rightFuzzyDiscription;
            return this;
        }

        public ConditionBuilder rightFuzzyDiscription (String ... rightFuzzyDiscription){
            this.rightFuzzyDiscription = solveNullList(rightFuzzyDiscription);
            return this;
        }

        public ConditionBuilder discriptionList(String ... discription){
            this.discriptionList = solveNullList(discription);
            return this;
        }

        public ConditionBuilder discriptionList(List<String> discription){
            this.discriptionList = discription;
            return this;
        }

        public ConditionBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public ConditionBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public ConditionBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public ConditionBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public ConditionBuilder fuzzyImgUrl (List<String> fuzzyImgUrl){
            this.fuzzyImgUrl = fuzzyImgUrl;
            return this;
        }

        public ConditionBuilder fuzzyImgUrl (String ... fuzzyImgUrl){
            this.fuzzyImgUrl = solveNullList(fuzzyImgUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyImgUrl (List<String> rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = rightFuzzyImgUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyImgUrl (String ... rightFuzzyImgUrl){
            this.rightFuzzyImgUrl = solveNullList(rightFuzzyImgUrl);
            return this;
        }

        public ConditionBuilder imgUrlList(String ... imgUrl){
            this.imgUrlList = solveNullList(imgUrl);
            return this;
        }

        public ConditionBuilder imgUrlList(List<String> imgUrl){
            this.imgUrlList = imgUrl;
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

        private Institution obj;

        public Builder(){
            this.obj = new Institution();
        }

        public Builder institutionName(String institutionName){
            this.obj.setInstitutionName(institutionName);
            return this;
        }
        public Builder discription(String discription){
            this.obj.setDiscription(discription);
            return this;
        }
        public Builder url(String url){
            this.obj.setUrl(url);
            return this;
        }
        public Builder imgUrl(String imgUrl){
            this.obj.setImgUrl(imgUrl);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Institution build(){return obj;}
    }

}
