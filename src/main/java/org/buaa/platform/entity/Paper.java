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
public class Paper implements Serializable {

    private static final long serialVersionUID = 1575631506929L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String paperID;

    /**
    * 
    * isNullAble:0
    */
    private String title;

    /**
    * 
    * isNullAble:0
    */
    private String _abstract;

    /**
    * 
    * isNullAble:0
    */
    private String keyword;

    /**
    * 
    * isNullAble:1
    */
    private String classificationCodes;

    /**
    * 
    * isNullAble:1
    */
    private String DOI;

    /**
    * 
    * isNullAble:1
    */
    private String publishTime;

    /**
    * 
    * isNullAble:1
    */
    private String funds;

    /**
    * 
    * isNullAble:1
    */
    private String content;

    /**
    * 
    * isNullAble:1
    */
    private String sorce;


    public void setPaperID(String paperID){this.paperID = paperID;}

    public String getPaperID(){return this.paperID;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void set_abstract(String _abstract){this._abstract = _abstract;}

    public String get_abstract(){return this._abstract;}

    public void setKeyword(String keyword){this.keyword = keyword;}

    public String getKeyword(){return this.keyword;}

    public void setClassificationCodes(String classificationCodes){this.classificationCodes = classificationCodes;}

    public String getClassificationCodes(){return this.classificationCodes;}

    public void setDOI(String DOI){this.DOI = DOI;}

    public String getDOI(){return this.DOI;}

    public void setPublishTime(String publishTime){this.publishTime = publishTime;}

    public String getPublishTime(){return this.publishTime;}

    public void setFunds(String funds){this.funds = funds;}

    public String getFunds(){return this.funds;}

    public void setContent(String content){this.content = content;}

    public String getContent(){return this.content;}

    public void setSorce(String sorce){this.sorce = sorce;}

    public String getSorce(){return this.sorce;}
    @Override
    public String toString() {
        return "Paper{" +
                "paperID='" + paperID + '\'' +
                "title='" + title + '\'' +
                "_abstract='" + _abstract + '\'' +
                "keyword='" + keyword + '\'' +
                "classificationCodes='" + classificationCodes + '\'' +
                "DOI='" + DOI + '\'' +
                "publishTime='" + publishTime + '\'' +
                "funds='" + funds + '\'' +
                "content='" + content + '\'' +
                "sorce='" + sorce + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Paper set;

        private ConditionBuilder where;

        public UpdateBuilder set(Paper set){
            this.set = set;
            return this;
        }

        public Paper getSet(){
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

    public static class QueryBuilder extends Paper{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}
        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> _abstractList;

        public List<String> get_abstractList(){return this._abstractList;}


        private List<String> fuzzy_abstract;

        public List<String> getFuzzy_abstract(){return this.fuzzy_abstract;}

        private List<String> rightFuzzy_abstract;

        public List<String> getRightFuzzy_abstract(){return this.rightFuzzy_abstract;}
        private List<String> keywordList;

        public List<String> getKeywordList(){return this.keywordList;}


        private List<String> fuzzyKeyword;

        public List<String> getFuzzyKeyword(){return this.fuzzyKeyword;}

        private List<String> rightFuzzyKeyword;

        public List<String> getRightFuzzyKeyword(){return this.rightFuzzyKeyword;}
        private List<String> classificationCodesList;

        public List<String> getClassificationCodesList(){return this.classificationCodesList;}


        private List<String> fuzzyClassificationCodes;

        public List<String> getFuzzyClassificationCodes(){return this.fuzzyClassificationCodes;}

        private List<String> rightFuzzyClassificationCodes;

        public List<String> getRightFuzzyClassificationCodes(){return this.rightFuzzyClassificationCodes;}
        private List<String> DOIList;

        public List<String> getDOIList(){return this.DOIList;}


        private List<String> fuzzyDOI;

        public List<String> getFuzzyDOI(){return this.fuzzyDOI;}

        private List<String> rightFuzzyDOI;

        public List<String> getRightFuzzyDOI(){return this.rightFuzzyDOI;}
        private List<String> publishTimeList;

        public List<String> getPublishTimeList(){return this.publishTimeList;}


        private List<String> fuzzyPublishTime;

        public List<String> getFuzzyPublishTime(){return this.fuzzyPublishTime;}

        private List<String> rightFuzzyPublishTime;

        public List<String> getRightFuzzyPublishTime(){return this.rightFuzzyPublishTime;}
        private List<String> fundsList;

        public List<String> getFundsList(){return this.fundsList;}


        private List<String> fuzzyFunds;

        public List<String> getFuzzyFunds(){return this.fuzzyFunds;}

        private List<String> rightFuzzyFunds;

        public List<String> getRightFuzzyFunds(){return this.rightFuzzyFunds;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<String> sorceList;

        public List<String> getSorceList(){return this.sorceList;}


        private List<String> fuzzySorce;

        public List<String> getFuzzySorce(){return this.fuzzySorce;}

        private List<String> rightFuzzySorce;

        public List<String> getRightFuzzySorce(){return this.rightFuzzySorce;}
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
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

        public QueryBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public QueryBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public QueryBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public QueryBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public QueryBuilder title(String title){
            setTitle(title);
            return this;
        }

        public QueryBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public QueryBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public QueryBuilder fetchTitle(){
            setFetchFields("fetchFields","title");
            return this;
        }

        public QueryBuilder excludeTitle(){
            setFetchFields("excludeFields","title");
            return this;
        }

        public QueryBuilder fuzzy_abstract (List<String> fuzzy_abstract){
            this.fuzzy_abstract = fuzzy_abstract;
            return this;
        }

        public QueryBuilder fuzzy_abstract (String ... fuzzy_abstract){
            this.fuzzy_abstract = solveNullList(fuzzy_abstract);
            return this;
        }

        public QueryBuilder rightFuzzy_abstract (List<String> rightFuzzy_abstract){
            this.rightFuzzy_abstract = rightFuzzy_abstract;
            return this;
        }

        public QueryBuilder rightFuzzy_abstract (String ... rightFuzzy_abstract){
            this.rightFuzzy_abstract = solveNullList(rightFuzzy_abstract);
            return this;
        }

        public QueryBuilder _abstract(String _abstract){
            set_abstract(_abstract);
            return this;
        }

        public QueryBuilder _abstractList(String ... _abstract){
            this._abstractList = solveNullList(_abstract);
            return this;
        }

        public QueryBuilder _abstractList(List<String> _abstract){
            this._abstractList = _abstract;
            return this;
        }

        public QueryBuilder fetch_abstract(){
            setFetchFields("fetchFields","_abstract");
            return this;
        }

        public QueryBuilder exclude_abstract(){
            setFetchFields("excludeFields","_abstract");
            return this;
        }

        public QueryBuilder fuzzyKeyword (List<String> fuzzyKeyword){
            this.fuzzyKeyword = fuzzyKeyword;
            return this;
        }

        public QueryBuilder fuzzyKeyword (String ... fuzzyKeyword){
            this.fuzzyKeyword = solveNullList(fuzzyKeyword);
            return this;
        }

        public QueryBuilder rightFuzzyKeyword (List<String> rightFuzzyKeyword){
            this.rightFuzzyKeyword = rightFuzzyKeyword;
            return this;
        }

        public QueryBuilder rightFuzzyKeyword (String ... rightFuzzyKeyword){
            this.rightFuzzyKeyword = solveNullList(rightFuzzyKeyword);
            return this;
        }

        public QueryBuilder keyword(String keyword){
            setKeyword(keyword);
            return this;
        }

        public QueryBuilder keywordList(String ... keyword){
            this.keywordList = solveNullList(keyword);
            return this;
        }

        public QueryBuilder keywordList(List<String> keyword){
            this.keywordList = keyword;
            return this;
        }

        public QueryBuilder fetchKeyword(){
            setFetchFields("fetchFields","keyword");
            return this;
        }

        public QueryBuilder excludeKeyword(){
            setFetchFields("excludeFields","keyword");
            return this;
        }

        public QueryBuilder fuzzyClassificationCodes (List<String> fuzzyClassificationCodes){
            this.fuzzyClassificationCodes = fuzzyClassificationCodes;
            return this;
        }

        public QueryBuilder fuzzyClassificationCodes (String ... fuzzyClassificationCodes){
            this.fuzzyClassificationCodes = solveNullList(fuzzyClassificationCodes);
            return this;
        }

        public QueryBuilder rightFuzzyClassificationCodes (List<String> rightFuzzyClassificationCodes){
            this.rightFuzzyClassificationCodes = rightFuzzyClassificationCodes;
            return this;
        }

        public QueryBuilder rightFuzzyClassificationCodes (String ... rightFuzzyClassificationCodes){
            this.rightFuzzyClassificationCodes = solveNullList(rightFuzzyClassificationCodes);
            return this;
        }

        public QueryBuilder classificationCodes(String classificationCodes){
            setClassificationCodes(classificationCodes);
            return this;
        }

        public QueryBuilder classificationCodesList(String ... classificationCodes){
            this.classificationCodesList = solveNullList(classificationCodes);
            return this;
        }

        public QueryBuilder classificationCodesList(List<String> classificationCodes){
            this.classificationCodesList = classificationCodes;
            return this;
        }

        public QueryBuilder fetchClassificationCodes(){
            setFetchFields("fetchFields","classificationCodes");
            return this;
        }

        public QueryBuilder excludeClassificationCodes(){
            setFetchFields("excludeFields","classificationCodes");
            return this;
        }

        public QueryBuilder fuzzyDOI (List<String> fuzzyDOI){
            this.fuzzyDOI = fuzzyDOI;
            return this;
        }

        public QueryBuilder fuzzyDOI (String ... fuzzyDOI){
            this.fuzzyDOI = solveNullList(fuzzyDOI);
            return this;
        }

        public QueryBuilder rightFuzzyDOI (List<String> rightFuzzyDOI){
            this.rightFuzzyDOI = rightFuzzyDOI;
            return this;
        }

        public QueryBuilder rightFuzzyDOI (String ... rightFuzzyDOI){
            this.rightFuzzyDOI = solveNullList(rightFuzzyDOI);
            return this;
        }

        public QueryBuilder DOI(String DOI){
            setDOI(DOI);
            return this;
        }

        public QueryBuilder DOIList(String ... DOI){
            this.DOIList = solveNullList(DOI);
            return this;
        }

        public QueryBuilder DOIList(List<String> DOI){
            this.DOIList = DOI;
            return this;
        }

        public QueryBuilder fetchDOI(){
            setFetchFields("fetchFields","DOI");
            return this;
        }

        public QueryBuilder excludeDOI(){
            setFetchFields("excludeFields","DOI");
            return this;
        }

        public QueryBuilder fuzzyPublishTime (List<String> fuzzyPublishTime){
            this.fuzzyPublishTime = fuzzyPublishTime;
            return this;
        }

        public QueryBuilder fuzzyPublishTime (String ... fuzzyPublishTime){
            this.fuzzyPublishTime = solveNullList(fuzzyPublishTime);
            return this;
        }

        public QueryBuilder rightFuzzyPublishTime (List<String> rightFuzzyPublishTime){
            this.rightFuzzyPublishTime = rightFuzzyPublishTime;
            return this;
        }

        public QueryBuilder rightFuzzyPublishTime (String ... rightFuzzyPublishTime){
            this.rightFuzzyPublishTime = solveNullList(rightFuzzyPublishTime);
            return this;
        }

        public QueryBuilder publishTime(String publishTime){
            setPublishTime(publishTime);
            return this;
        }

        public QueryBuilder publishTimeList(String ... publishTime){
            this.publishTimeList = solveNullList(publishTime);
            return this;
        }

        public QueryBuilder publishTimeList(List<String> publishTime){
            this.publishTimeList = publishTime;
            return this;
        }

        public QueryBuilder fetchPublishTime(){
            setFetchFields("fetchFields","publishTime");
            return this;
        }

        public QueryBuilder excludePublishTime(){
            setFetchFields("excludeFields","publishTime");
            return this;
        }

        public QueryBuilder fuzzyFunds (List<String> fuzzyFunds){
            this.fuzzyFunds = fuzzyFunds;
            return this;
        }

        public QueryBuilder fuzzyFunds (String ... fuzzyFunds){
            this.fuzzyFunds = solveNullList(fuzzyFunds);
            return this;
        }

        public QueryBuilder rightFuzzyFunds (List<String> rightFuzzyFunds){
            this.rightFuzzyFunds = rightFuzzyFunds;
            return this;
        }

        public QueryBuilder rightFuzzyFunds (String ... rightFuzzyFunds){
            this.rightFuzzyFunds = solveNullList(rightFuzzyFunds);
            return this;
        }

        public QueryBuilder funds(String funds){
            setFunds(funds);
            return this;
        }

        public QueryBuilder fundsList(String ... funds){
            this.fundsList = solveNullList(funds);
            return this;
        }

        public QueryBuilder fundsList(List<String> funds){
            this.fundsList = funds;
            return this;
        }

        public QueryBuilder fetchFunds(){
            setFetchFields("fetchFields","funds");
            return this;
        }

        public QueryBuilder excludeFunds(){
            setFetchFields("excludeFields","funds");
            return this;
        }

        public QueryBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public QueryBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public QueryBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public QueryBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public QueryBuilder content(String content){
            setContent(content);
            return this;
        }

        public QueryBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public QueryBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public QueryBuilder fetchContent(){
            setFetchFields("fetchFields","content");
            return this;
        }

        public QueryBuilder excludeContent(){
            setFetchFields("excludeFields","content");
            return this;
        }

        public QueryBuilder fuzzySorce (List<String> fuzzySorce){
            this.fuzzySorce = fuzzySorce;
            return this;
        }

        public QueryBuilder fuzzySorce (String ... fuzzySorce){
            this.fuzzySorce = solveNullList(fuzzySorce);
            return this;
        }

        public QueryBuilder rightFuzzySorce (List<String> rightFuzzySorce){
            this.rightFuzzySorce = rightFuzzySorce;
            return this;
        }

        public QueryBuilder rightFuzzySorce (String ... rightFuzzySorce){
            this.rightFuzzySorce = solveNullList(rightFuzzySorce);
            return this;
        }

        public QueryBuilder sorce(String sorce){
            setSorce(sorce);
            return this;
        }

        public QueryBuilder sorceList(String ... sorce){
            this.sorceList = solveNullList(sorce);
            return this;
        }

        public QueryBuilder sorceList(List<String> sorce){
            this.sorceList = sorce;
            return this;
        }

        public QueryBuilder fetchSorce(){
            setFetchFields("fetchFields","sorce");
            return this;
        }

        public QueryBuilder excludeSorce(){
            setFetchFields("excludeFields","sorce");
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

        public Paper build(){return this;}
    }


    public static class ConditionBuilder{
        private List<String> paperIDList;

        public List<String> getPaperIDList(){return this.paperIDList;}


        private List<String> fuzzyPaperID;

        public List<String> getFuzzyPaperID(){return this.fuzzyPaperID;}

        private List<String> rightFuzzyPaperID;

        public List<String> getRightFuzzyPaperID(){return this.rightFuzzyPaperID;}
        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> _abstractList;

        public List<String> get_abstractList(){return this._abstractList;}


        private List<String> fuzzy_abstract;

        public List<String> getFuzzy_abstract(){return this.fuzzy_abstract;}

        private List<String> rightFuzzy_abstract;

        public List<String> getRightFuzzy_abstract(){return this.rightFuzzy_abstract;}
        private List<String> keywordList;

        public List<String> getKeywordList(){return this.keywordList;}


        private List<String> fuzzyKeyword;

        public List<String> getFuzzyKeyword(){return this.fuzzyKeyword;}

        private List<String> rightFuzzyKeyword;

        public List<String> getRightFuzzyKeyword(){return this.rightFuzzyKeyword;}
        private List<String> classificationCodesList;

        public List<String> getClassificationCodesList(){return this.classificationCodesList;}


        private List<String> fuzzyClassificationCodes;

        public List<String> getFuzzyClassificationCodes(){return this.fuzzyClassificationCodes;}

        private List<String> rightFuzzyClassificationCodes;

        public List<String> getRightFuzzyClassificationCodes(){return this.rightFuzzyClassificationCodes;}
        private List<String> DOIList;

        public List<String> getDOIList(){return this.DOIList;}


        private List<String> fuzzyDOI;

        public List<String> getFuzzyDOI(){return this.fuzzyDOI;}

        private List<String> rightFuzzyDOI;

        public List<String> getRightFuzzyDOI(){return this.rightFuzzyDOI;}
        private List<String> publishTimeList;

        public List<String> getPublishTimeList(){return this.publishTimeList;}


        private List<String> fuzzyPublishTime;

        public List<String> getFuzzyPublishTime(){return this.fuzzyPublishTime;}

        private List<String> rightFuzzyPublishTime;

        public List<String> getRightFuzzyPublishTime(){return this.rightFuzzyPublishTime;}
        private List<String> fundsList;

        public List<String> getFundsList(){return this.fundsList;}


        private List<String> fuzzyFunds;

        public List<String> getFuzzyFunds(){return this.fuzzyFunds;}

        private List<String> rightFuzzyFunds;

        public List<String> getRightFuzzyFunds(){return this.rightFuzzyFunds;}
        private List<String> contentList;

        public List<String> getContentList(){return this.contentList;}


        private List<String> fuzzyContent;

        public List<String> getFuzzyContent(){return this.fuzzyContent;}

        private List<String> rightFuzzyContent;

        public List<String> getRightFuzzyContent(){return this.rightFuzzyContent;}
        private List<String> sorceList;

        public List<String> getSorceList(){return this.sorceList;}


        private List<String> fuzzySorce;

        public List<String> getFuzzySorce(){return this.fuzzySorce;}

        private List<String> rightFuzzySorce;

        public List<String> getRightFuzzySorce(){return this.rightFuzzySorce;}

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

        public ConditionBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public ConditionBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public ConditionBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public ConditionBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public ConditionBuilder fuzzy_abstract (List<String> fuzzy_abstract){
            this.fuzzy_abstract = fuzzy_abstract;
            return this;
        }

        public ConditionBuilder fuzzy_abstract (String ... fuzzy_abstract){
            this.fuzzy_abstract = solveNullList(fuzzy_abstract);
            return this;
        }

        public ConditionBuilder rightFuzzy_abstract (List<String> rightFuzzy_abstract){
            this.rightFuzzy_abstract = rightFuzzy_abstract;
            return this;
        }

        public ConditionBuilder rightFuzzy_abstract (String ... rightFuzzy_abstract){
            this.rightFuzzy_abstract = solveNullList(rightFuzzy_abstract);
            return this;
        }

        public ConditionBuilder _abstractList(String ... _abstract){
            this._abstractList = solveNullList(_abstract);
            return this;
        }

        public ConditionBuilder _abstractList(List<String> _abstract){
            this._abstractList = _abstract;
            return this;
        }

        public ConditionBuilder fuzzyKeyword (List<String> fuzzyKeyword){
            this.fuzzyKeyword = fuzzyKeyword;
            return this;
        }

        public ConditionBuilder fuzzyKeyword (String ... fuzzyKeyword){
            this.fuzzyKeyword = solveNullList(fuzzyKeyword);
            return this;
        }

        public ConditionBuilder rightFuzzyKeyword (List<String> rightFuzzyKeyword){
            this.rightFuzzyKeyword = rightFuzzyKeyword;
            return this;
        }

        public ConditionBuilder rightFuzzyKeyword (String ... rightFuzzyKeyword){
            this.rightFuzzyKeyword = solveNullList(rightFuzzyKeyword);
            return this;
        }

        public ConditionBuilder keywordList(String ... keyword){
            this.keywordList = solveNullList(keyword);
            return this;
        }

        public ConditionBuilder keywordList(List<String> keyword){
            this.keywordList = keyword;
            return this;
        }

        public ConditionBuilder fuzzyClassificationCodes (List<String> fuzzyClassificationCodes){
            this.fuzzyClassificationCodes = fuzzyClassificationCodes;
            return this;
        }

        public ConditionBuilder fuzzyClassificationCodes (String ... fuzzyClassificationCodes){
            this.fuzzyClassificationCodes = solveNullList(fuzzyClassificationCodes);
            return this;
        }

        public ConditionBuilder rightFuzzyClassificationCodes (List<String> rightFuzzyClassificationCodes){
            this.rightFuzzyClassificationCodes = rightFuzzyClassificationCodes;
            return this;
        }

        public ConditionBuilder rightFuzzyClassificationCodes (String ... rightFuzzyClassificationCodes){
            this.rightFuzzyClassificationCodes = solveNullList(rightFuzzyClassificationCodes);
            return this;
        }

        public ConditionBuilder classificationCodesList(String ... classificationCodes){
            this.classificationCodesList = solveNullList(classificationCodes);
            return this;
        }

        public ConditionBuilder classificationCodesList(List<String> classificationCodes){
            this.classificationCodesList = classificationCodes;
            return this;
        }

        public ConditionBuilder fuzzyDOI (List<String> fuzzyDOI){
            this.fuzzyDOI = fuzzyDOI;
            return this;
        }

        public ConditionBuilder fuzzyDOI (String ... fuzzyDOI){
            this.fuzzyDOI = solveNullList(fuzzyDOI);
            return this;
        }

        public ConditionBuilder rightFuzzyDOI (List<String> rightFuzzyDOI){
            this.rightFuzzyDOI = rightFuzzyDOI;
            return this;
        }

        public ConditionBuilder rightFuzzyDOI (String ... rightFuzzyDOI){
            this.rightFuzzyDOI = solveNullList(rightFuzzyDOI);
            return this;
        }

        public ConditionBuilder DOIList(String ... DOI){
            this.DOIList = solveNullList(DOI);
            return this;
        }

        public ConditionBuilder DOIList(List<String> DOI){
            this.DOIList = DOI;
            return this;
        }

        public ConditionBuilder fuzzyPublishTime (List<String> fuzzyPublishTime){
            this.fuzzyPublishTime = fuzzyPublishTime;
            return this;
        }

        public ConditionBuilder fuzzyPublishTime (String ... fuzzyPublishTime){
            this.fuzzyPublishTime = solveNullList(fuzzyPublishTime);
            return this;
        }

        public ConditionBuilder rightFuzzyPublishTime (List<String> rightFuzzyPublishTime){
            this.rightFuzzyPublishTime = rightFuzzyPublishTime;
            return this;
        }

        public ConditionBuilder rightFuzzyPublishTime (String ... rightFuzzyPublishTime){
            this.rightFuzzyPublishTime = solveNullList(rightFuzzyPublishTime);
            return this;
        }

        public ConditionBuilder publishTimeList(String ... publishTime){
            this.publishTimeList = solveNullList(publishTime);
            return this;
        }

        public ConditionBuilder publishTimeList(List<String> publishTime){
            this.publishTimeList = publishTime;
            return this;
        }

        public ConditionBuilder fuzzyFunds (List<String> fuzzyFunds){
            this.fuzzyFunds = fuzzyFunds;
            return this;
        }

        public ConditionBuilder fuzzyFunds (String ... fuzzyFunds){
            this.fuzzyFunds = solveNullList(fuzzyFunds);
            return this;
        }

        public ConditionBuilder rightFuzzyFunds (List<String> rightFuzzyFunds){
            this.rightFuzzyFunds = rightFuzzyFunds;
            return this;
        }

        public ConditionBuilder rightFuzzyFunds (String ... rightFuzzyFunds){
            this.rightFuzzyFunds = solveNullList(rightFuzzyFunds);
            return this;
        }

        public ConditionBuilder fundsList(String ... funds){
            this.fundsList = solveNullList(funds);
            return this;
        }

        public ConditionBuilder fundsList(List<String> funds){
            this.fundsList = funds;
            return this;
        }

        public ConditionBuilder fuzzyContent (List<String> fuzzyContent){
            this.fuzzyContent = fuzzyContent;
            return this;
        }

        public ConditionBuilder fuzzyContent (String ... fuzzyContent){
            this.fuzzyContent = solveNullList(fuzzyContent);
            return this;
        }

        public ConditionBuilder rightFuzzyContent (List<String> rightFuzzyContent){
            this.rightFuzzyContent = rightFuzzyContent;
            return this;
        }

        public ConditionBuilder rightFuzzyContent (String ... rightFuzzyContent){
            this.rightFuzzyContent = solveNullList(rightFuzzyContent);
            return this;
        }

        public ConditionBuilder contentList(String ... content){
            this.contentList = solveNullList(content);
            return this;
        }

        public ConditionBuilder contentList(List<String> content){
            this.contentList = content;
            return this;
        }

        public ConditionBuilder fuzzySorce (List<String> fuzzySorce){
            this.fuzzySorce = fuzzySorce;
            return this;
        }

        public ConditionBuilder fuzzySorce (String ... fuzzySorce){
            this.fuzzySorce = solveNullList(fuzzySorce);
            return this;
        }

        public ConditionBuilder rightFuzzySorce (List<String> rightFuzzySorce){
            this.rightFuzzySorce = rightFuzzySorce;
            return this;
        }

        public ConditionBuilder rightFuzzySorce (String ... rightFuzzySorce){
            this.rightFuzzySorce = solveNullList(rightFuzzySorce);
            return this;
        }

        public ConditionBuilder sorceList(String ... sorce){
            this.sorceList = solveNullList(sorce);
            return this;
        }

        public ConditionBuilder sorceList(List<String> sorce){
            this.sorceList = sorce;
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

        private Paper obj;

        public Builder(){
            this.obj = new Paper();
        }

        public Builder paperID(String paperID){
            this.obj.setPaperID(paperID);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public Builder _abstract(String _abstract){
            this.obj.set_abstract(_abstract);
            return this;
        }
        public Builder keyword(String keyword){
            this.obj.setKeyword(keyword);
            return this;
        }
        public Builder classificationCodes(String classificationCodes){
            this.obj.setClassificationCodes(classificationCodes);
            return this;
        }
        public Builder DOI(String DOI){
            this.obj.setDOI(DOI);
            return this;
        }
        public Builder publishTime(String publishTime){
            this.obj.setPublishTime(publishTime);
            return this;
        }
        public Builder funds(String funds){
            this.obj.setFunds(funds);
            return this;
        }
        public Builder content(String content){
            this.obj.setContent(content);
            return this;
        }
        public Builder sorce(String sorce){
            this.obj.setSorce(sorce);
            return this;
        }
        public Paper build(){return obj;}
    }

}
