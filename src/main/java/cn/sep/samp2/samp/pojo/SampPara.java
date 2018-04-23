package cn.sep.samp2.samp.pojo;



/**
 * Created by SEP QYL on 2018/3/19.
 */
public class SampPara {
    private String id;                      //参数ID
    private String serverId;               //服务器位置参数ID
    private String projId;
    private String sampId;                  //采样点ID
    private String sampServerId;            //服务器采样点ID
    private String sampType;               //采样类型
    private String sampPositionNo;          //采样点位置号
    private String depthBegin;              //钻进深度开始
    private String depthEnd;                //钻进深度结束
    private String color;                   //颜色
    private String humidity;                //湿度
    private String geologicalType;          //地质类型
    private String compactness;             //密实度
    private String features;                //土质特征
    private String pid;                      //PID

    public SampPara(String id, String serverId, String projId, String sampId, String sampServerId, String sampType, String sampPositionNo, String depthBegin, String depthEnd, String color, String humidity, String geologicalType, String compactness, String features, String pid) {
        this.id = id;
        this.serverId = serverId;
        this.projId = projId;
        this.sampId = sampId;
        this.sampServerId = sampServerId;
        this.sampType = sampType;
        this.sampPositionNo = sampPositionNo;
        this.depthBegin = depthBegin;
        this.depthEnd = depthEnd;
        this.color = color;
        this.humidity = humidity;
        this.geologicalType = geologicalType;
        this.compactness = compactness;
        this.features = features;
        this.pid = pid;
    }

    public SampPara(String projId, String sampId, String sampServerId, String sampType, String sampPositionNo, String depthBegin, String depthEnd, String color, String humidity, String geologicalType, String compactness, String features) {
        this.projId = projId;
        this.sampId = sampId;
        this.sampServerId = sampServerId;
        this.sampType = sampType;
        this.sampPositionNo = sampPositionNo;
        this.depthBegin = depthBegin;
        this.depthEnd = depthEnd;
        this.color = color;
        this.humidity = humidity;
        this.geologicalType = geologicalType;
        this.compactness = compactness;
        this.features = features;
    }

    public SampPara() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getProjId() {
        return projId;
    }

    public void setProjId(String projId) {
        this.projId = projId;
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

    public String getSampType() {
        return sampType;
    }

    public void setSampType(String sampType) {
        this.sampType = sampType;
    }

    public String getSampPositionNo() {
        return sampPositionNo;
    }

    public void setSampPositionNo(String sampPositionNo) {
        this.sampPositionNo = sampPositionNo;
    }

    public String getDepthBegin() {
        return depthBegin;
    }

    public void setDepthBegin(String depthBegin) {
        this.depthBegin = depthBegin;
    }

    public String getDepthEnd() {
        return depthEnd;
    }

    public void setDepthEnd(String depthEnd) {
        this.depthEnd = depthEnd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getGeologicalType() {
        return geologicalType;
    }

    public void setGeologicalType(String geologicalType) {
        this.geologicalType = geologicalType;
    }

    public String getCompactness() {
        return compactness;
    }

    public void setCompactness(String compactness) {
        this.compactness = compactness;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "SampPara{" +
                "id='" + id + '\'' +
                ", serverId='" + serverId + '\'' +
                ", projId='" + projId + '\'' +
                ", sampId='" + sampId + '\'' +
                ", sampServerId='" + sampServerId + '\'' +
                ", sampType='" + sampType + '\'' +
                ", sampPositionNo='" + sampPositionNo + '\'' +
                ", depthBegin='" + depthBegin + '\'' +
                ", depthEnd='" + depthEnd + '\'' +
                ", color='" + color + '\'' +
                ", humidity='" + humidity + '\'' +
                ", geologicalType='" + geologicalType + '\'' +
                ", compactness='" + compactness + '\'' +
                ", features='" + features + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }

}