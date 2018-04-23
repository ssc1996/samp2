package cn.sep.samp2.samp.pojo;


/**
 * Created by SEP QYL on 2018/2/2.
 */
public class SampPoint {
	private String sampId;//采样点ID
	private String projId;//项目ID
    private String projNo;//项目号
    private String positionNo;//项目点位置号
    private String sampPointN;//采样点N坐标
    private String sampPointE;//采样点E坐标
    private String sampPoint;//采样点坐标
    private String sampBeginDate;//施工开始日期
    private String sampBeginTime;//施工开始时间
    private String sampBegin;//施工时间
    private String sampEndDate;//施工结束日期
    private String sampEndTime;//施工结束时间
    private String elevationGround;//标高地面
    private String elevationWellhead;//标高井口
    private String drillholeDepth;//钻孔深度
    private String whiteTubeDepthBegin;//白管深度起始
    private String whiteTubeDepthEnd;//白管深度结束
    private String sieveDepthBegin;//筛管深度起始
    private String sieveDepthEnd;//筛管深度结束
    private String snitialWaterLevel;//初见水位
    private String stableWaterLevel;//稳定水位
    private String deepWells;//井深
    private String sampDescribe;//采样点描述

    public String getSampId() {
		return sampId;
	}

	public void setSampId(String sampId) {
		this.sampId = sampId;
	}

	public SampPoint(String projNo, String positionNo, String sampPointN, String sampPointE, String sampBeginDate, String sampBeginTime, String sampEndDate, String sampEndTime, String elevationWellhead, String elevationGround, String drillholeDepth, String whiteTubeDepthEnd, String whiteTubeDepthBegin, String sieveDepthBegin, String sieveDepthEnd, String snitialWaterLevel, String stableWaterLevel, String deepWells, String sampDescribe) {
        this.projNo = projNo;
        this.positionNo = positionNo;
        this.sampPointN = sampPointN;
        this.sampPointE = sampPointE;
        this.sampBeginDate = sampBeginDate;
        this.sampBeginTime = sampBeginTime;
        this.sampEndDate = sampEndDate;
        this.sampEndTime = sampEndTime;
        this.elevationWellhead = elevationWellhead;
        this.elevationGround = elevationGround;
        this.drillholeDepth = drillholeDepth;
        this.whiteTubeDepthEnd = whiteTubeDepthEnd;
        this.whiteTubeDepthBegin = whiteTubeDepthBegin;
        this.sieveDepthBegin = sieveDepthBegin;
        this.sieveDepthEnd = sieveDepthEnd;
        this.snitialWaterLevel = snitialWaterLevel;
        this.stableWaterLevel = stableWaterLevel;
        this.deepWells = deepWells;
        this.sampDescribe = sampDescribe;
    }

    public SampPoint() {
    }

    public SampPoint(String positionNo, String sampPoint, String sampBegin) {
        this.positionNo = positionNo;
        this.sampPoint = sampPoint;
        this.sampBegin = sampBegin;
    }

    public String getProjNo() {
        return projNo;
    }

    public String getSampPointN() {
        return sampPointN;
    }

    public String getSampPointE() {
        return sampPointE;
    }

    public String getSampPoint() {
        if(sampPoint==null||"".equals(sampPoint)){
            sampPoint = sampPointE+";"+sampPointN;
        }
        return sampPoint;
    }

    public String getSampBeginDate() {
        return sampBeginDate;
    }

    public String getSampBeginTime() {
        return sampBeginTime;
    }

    public String getSampBegin() {
        if(sampBegin==null||"".equals(sampBegin)){
            sampBegin = sampBeginDate +" "+sampBeginTime;
        }
        return sampBegin;
    }

    public String getSampEndDate() {
        return sampEndDate;
    }

    public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getSampEndTime() {
        return sampEndTime;
    }

    public String getElevationGround() {
        return elevationGround;
    }

    public String getElevationWellhead() {
        return elevationWellhead;
    }

    public String getDrillholeDepth() {
        return drillholeDepth;
    }

    public String getWhiteTubeDepthBegin() {
        return whiteTubeDepthBegin;
    }

    public String getWhiteTubeDepthEnd() {
        return whiteTubeDepthEnd;
    }

    public String getSieveDepthBegin() {
        return sieveDepthBegin;
    }

    public String getSieveDepthEnd() {
        return sieveDepthEnd;
    }

    public String getSnitialWaterLevel() {
        return snitialWaterLevel;
    }

    public String getStableWaterLevel() {
        return stableWaterLevel;
    }

    public String getDeepWells() {
        return deepWells;
    }

    public String getSampDescribe() {
        return sampDescribe;
    }

    public void setProjNo(String projNo) {
        this.projNo = projNo;
    }


    public void setSampPointN(String sampPointN) {
        this.sampPointN = sampPointN;
    }

    public void setSampPointE(String sampPointE) {
        this.sampPointE = sampPointE;
    }

    public void setSampPoint(String sampPoint) {
        this.sampPoint = sampPoint;
    }

    public void setSampBeginDate(String sampBeginDate) {
        this.sampBeginDate = sampBeginDate;
    }

    public void setSampBeginTime(String sampBeginTime) {
        this.sampBeginTime = sampBeginTime;
    }

    public void setSampBegin(String sampBegin) {
        this.sampBegin = sampBegin;
    }

    public void setSampEndDate(String sampEndDate) {
        this.sampEndDate = sampEndDate;
    }

    public void setSampEndTime(String sampEndTime) {
        this.sampEndTime = sampEndTime;
    }

    public void setElevationGround(String elevationGround) {
        this.elevationGround = elevationGround;
    }

    public void setElevationWellhead(String elevationWellhead) {
        this.elevationWellhead = elevationWellhead;
    }

    public void setDrillholeDepth(String drillholeDepth) {
        this.drillholeDepth = drillholeDepth;
    }

    public void setWhiteTubeDepthBegin(String whiteTubeDepthBegin) {
        this.whiteTubeDepthBegin = whiteTubeDepthBegin;
    }

    public void setWhiteTubeDepthEnd(String whiteTubeDepthEnd) {
        this.whiteTubeDepthEnd = whiteTubeDepthEnd;
    }

    public void setSieveDepthBegin(String sieveDepthBegin) {
        this.sieveDepthBegin = sieveDepthBegin;
    }

    public void setSieveDepthEnd(String sieveDepthEnd) {
        this.sieveDepthEnd = sieveDepthEnd;
    }

    public void setSnitialWaterLevel(String snitialWaterLevel) {
        this.snitialWaterLevel = snitialWaterLevel;
    }

    public void setStableWaterLevel(String stableWaterLevel) {
        this.stableWaterLevel = stableWaterLevel;
    }

    public void setDeepWells(String deepWells) {
        this.deepWells = deepWells;
    }

    public void setSampDescribe(String sampDescribe) {
        this.sampDescribe = sampDescribe;
    }

	@Override
	public String toString() {
		return "SampPoint [projNo=" + projNo + ", positionNo=" + positionNo
				+ ", sampPointN=" + sampPointN + ", sampPointE=" + sampPointE
				+ ", sampPoint=" + sampPoint + ", sampBeginDate="
				+ sampBeginDate + ", sampBeginTime=" + sampBeginTime
				+ ", sampBegin=" + sampBegin + ", sampEndDate=" + sampEndDate
				+ ", sampEndTime=" + sampEndTime + ", elevationGround="
				+ elevationGround + ", elevationWellhead=" + elevationWellhead
				+ ", drillholeDepth=" + drillholeDepth
				+ ", whiteTubeDepthBegin=" + whiteTubeDepthBegin
				+ ", whiteTubeDepthEnd=" + whiteTubeDepthEnd
				+ ", sieveDepthBegin=" + sieveDepthBegin + ", sieveDepthEnd="
				+ sieveDepthEnd + ", snitialWaterLevel=" + snitialWaterLevel
				+ ", stableWaterLevel=" + stableWaterLevel + ", deepWells="
				+ deepWells + ", sampDescribe=" + sampDescribe + "]";
	}

	public String getPositionNo() {
		return positionNo;
	}

	public void setPositionNo(String positionNo) {
		this.positionNo = positionNo;
	}


    
}