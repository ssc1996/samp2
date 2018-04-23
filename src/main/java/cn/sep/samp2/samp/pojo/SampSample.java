package cn.sep.samp2.samp.pojo;


/**
 * Created by SEP QYL on 2018/3/21.
 */
public class SampSample {
    private String sampleId;            //样品ID
    private String serverId;      //样品服务器位置ID
    private String sampId;              //采样点ID
    private String sampServerId;        //采样点服务器位置ID
    private String projId;              //项目ID
    private String sampleNo;              //样品编号
    private String sampPositionNo;      //采样点位置号
    private String sampRemarks;             //备注
    private String sampDepthBegin;         //起始深度
    private String sampDepthEnd;            //结束深度
    private String sampType;                //样品类型
    private String sampleNum;               //样品数量
    private String sampleSn;                //样品序号
    private String pid;                     //样品PID
    private String sampleBmn;               //采样瓶物料号
    private String xrfDetection;         //XRF检测数据
    private String sampDate;            //采样日期
    private String sampTime;            //采样时间

    public SampSample() {
    }

    public String getSampDate() {
        return sampDate;
    }

    public void setSampDate(String sampDate) {
        this.sampDate = sampDate;
    }

    public String getSampTime() {
        return sampTime;
    }

    public void setSampTime(String sampTime) {
        this.sampTime = sampTime;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getSampId() {
        return sampId;
    }

    public void setSampId(String sampId) {
        this.sampId = sampId;
    }

    public String getSampServerId() {
        return sampServerId;
    }

    public void setSampServerId(String sampServerId) {
        this.sampServerId = sampServerId;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
    }

    public String getSampPositionNo() {
        return sampPositionNo;
    }

    public void setSampPositionNo(String sampPositionNo) {
        this.sampPositionNo = sampPositionNo;
    }

    public String getSampRemarks() {
        return sampRemarks;
    }

    public void setSampRemarks(String sampRemarks) {
        this.sampRemarks = sampRemarks;
    }

    public String getSampDepthBegin() {
        return sampDepthBegin;
    }

    public void setSampDepthBegin(String sampDepthBegin) {
        this.sampDepthBegin = sampDepthBegin;
    }

    public String getSampDepthEnd() {
        return sampDepthEnd;
    }

    public void setSampDepthEnd(String sampDepthEnd) {
        this.sampDepthEnd = sampDepthEnd;
    }

    public String getSampType() {
        return sampType;
    }

    public void setSampType(String sampType) {
        this.sampType = sampType;
    }

    public String getSampleNum() {
        return sampleNum;
    }

    public void setSampleNum(String sampleNum) {
        this.sampleNum = sampleNum;
    }

    public String getSampleSn() {
        return sampleSn;
    }

    public void setSampleSn(String sampleSn) {
        this.sampleSn = sampleSn;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSampleNo() {
        return sampleNo;
    }

    public void setSampleNo(String sampleNo) {
        this.sampleNo = sampleNo;
    }

    public SampSample(String sampId, String sampServerId, String projId, String sampleNo, String sampPositionNo, String sampRemarks, String sampDepthBegin, String sampDepthEnd, String sampType, String sampleNum, String sampleSn, String pid, String sampleBmn, String xrfDetection) {
        this.sampId = sampId;
        this.sampServerId = sampServerId;
        this.projId = projId;
        this.sampleNo = sampleNo;
        this.sampPositionNo = sampPositionNo;
        this.sampRemarks = sampRemarks;
        this.sampDepthBegin = sampDepthBegin;
        this.sampDepthEnd = sampDepthEnd;
        this.sampType = sampType;
        this.sampleNum = sampleNum;
        this.sampleSn = sampleSn;
        this.pid = pid;
        this.sampleBmn = sampleBmn;
        this.xrfDetection = xrfDetection;
    }
    public SampSample(String sampId, String sampServerId, String projId,String sampNo, String sampPositionNo, String sampRemarks, String sampDepthBegin, String sampDepthEnd, String sampType, String sampleNum, String sampleSn, String pid,String sampleBmn,String xrfDetection,String sampDate,String sampTime) {
        this.sampId = sampId;
        this.sampServerId = sampServerId;
        this.projId = projId;
        this.sampleNo = sampleNo;
        this.sampPositionNo = sampPositionNo;
        this.sampRemarks = sampRemarks;
        this.sampDepthBegin = sampDepthBegin;
        this.sampDepthEnd = sampDepthEnd;
        this.sampType = sampType;
        this.sampleNum = sampleNum;
        this.sampleSn = sampleSn;
        this.pid = pid;
        this.sampleBmn = sampleBmn;
        this.xrfDetection = xrfDetection;
        this.sampDate = sampDate;
        this.sampTime = sampTime;
    }

    public SampSample(String sampleId, String serverId, String sampId, String sampServerId, String projId,String sampleNo, String sampPositionNo, String sampRemarks, String sampDepthBegin, String sampDepthEnd, String sampType, String sampleNum, String sampleSn, String pid, String sampleBmn, String xrfDetection, String sampDate, String sampTime) {
        this.sampleId = sampleId;
        this.serverId = serverId;
        this.sampId = sampId;
        this.sampServerId = sampServerId;
        this.projId = projId;
        this.sampleNo = sampleNo;
        this.sampPositionNo = sampPositionNo;
        this.sampRemarks = sampRemarks;
        this.sampDepthBegin = sampDepthBegin;
        this.sampDepthEnd = sampDepthEnd;
        this.sampType = sampType;
        this.sampleNum = sampleNum;
        this.sampleSn = sampleSn;
        this.pid = pid;
        this.sampleBmn = sampleBmn;
        this.xrfDetection = xrfDetection;
        this.sampDate = sampDate;
        this.sampTime = sampTime;
    }

    public String getSampleBmn() {
        return sampleBmn;
    }

    public void setSampleBmn(String sampleBmn) {
        this.sampleBmn = sampleBmn;
    }

    public String getXrfDetection() {
        return xrfDetection;
    }

    public void setXrfDetection(String xrfDetection) {
        this.xrfDetection = xrfDetection;
    }
}