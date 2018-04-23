package cn.sep.samp2.samp.pojo;


/**
 * Created by SEP QYL on 2018/2/2.
 */
public class ProjectInfo {
    private String custName;//客户
    private String projId;//项目主键
    private String projNo;//项目编号
    private String projName;//项目名称
    private int sampNum;//采样点数
    private String projPersonLiable;//负责人
    private String projMember;//项目成员
    private String projTime;//项目时间
    private String maxDepth;//最大深度
    private int soilSampleNum;//土样数量
    private int waterSampleNum;//水样数量
    private String projDescribe;//项目描述
    private String testContent;//测试内容
    private String remarks;//备注
    private String state;//状态
    private String projCreateId;//项目创建人ID
    private String projCreateName;//项目创建人名称
    
    public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getProjCreateId() {
		return projCreateId;
	}

	public void setProjCreateId(String projCreateId) {
		this.projCreateId = projCreateId;
	}

	public String getProjCreateName() {
		return projCreateName;
	}

	public void setProjCreateName(String projCreateName) {
		this.projCreateName = projCreateName;
	}

	public ProjectInfo(String custName, String projNo, String projName,
			int sampNum, String projPersonLiable, String projMember,
			String projTime, String maxDepth, int soilSampleNum,
			int waterSampleNum, String projDescribe, String testContent,
			String remarks, String state, String projCreateId,
			String projCreateName) {
		super();
		this.custName = custName;
		this.projNo = projNo;
		this.projName = projName;
		this.sampNum = sampNum;
		this.projPersonLiable = projPersonLiable;
		this.projMember = projMember;
		this.projTime = projTime;
		this.maxDepth = maxDepth;
		this.soilSampleNum = soilSampleNum;
		this.waterSampleNum = waterSampleNum;
		this.projDescribe = projDescribe;
		this.testContent = testContent;
		this.remarks = remarks;
		this.state = state;
		this.projCreateId = projCreateId;
		this.projCreateName = projCreateName;
	}

	public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setProjNo(String projNo) {
        this.projNo = projNo;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public void setSampNum(int sampNum) {
        this.sampNum = sampNum;
    }

    public void setProjPersonLiable(String projPersonLiable) {
        this.projPersonLiable = projPersonLiable;
    }

    public void setProjMember(String projMember) {
        this.projMember = projMember;
    }

    public void setProjTime(String projTime) {
        this.projTime = projTime;
    }

    public void setMaxDepth(String maxDepth) {
        this.maxDepth = maxDepth;
    }

    public void setSoilSampleNum(int soilSampleNum) {
        this.soilSampleNum = soilSampleNum;
    }

    public void setWaterSampleNum(int waterSampleNum) {
        this.waterSampleNum = waterSampleNum;
    }

    public void setProjDescribe(String projDescribe) {
        this.projDescribe = projDescribe;
    }

    public void setTestContent(String testContent) {
        this.testContent = testContent;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCustName() {

        return custName;
    }

    public String getProjNo() {
        return projNo;
    }

    public String getProjName() {
        return projName;
    }

    public int getSampNum() {
        return sampNum;
    }

    public String getProjPersonLiable() {
        return projPersonLiable;
    }

    public String getProjMember() {
        return projMember;
    }

    public String getProjTime() {
        return projTime;
    }

    public String getMaxDepth() {
        return maxDepth;
    }

    public int getSoilSampleNum() {
        return soilSampleNum;
    }

    public int getWaterSampleNum() {
        return waterSampleNum;
    }

    public String getProjDescribe() {
        return projDescribe;
    }

    public String getTestContent() {
        return testContent;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getState() {
        return state;
    }

    public ProjectInfo(String custName, String projNo, String projName, int sampNum, String projPersonLiable, String projMember, String projTime, String maxDepth, int soilSampleNum, int waterSampleNum, String projDescribe, String testContent, String remarks, String state) {
        this.custName = custName;
        this.projNo = projNo;
        this.projName = projName;
        this.sampNum = sampNum;
        this.projPersonLiable = projPersonLiable;
        this.projMember = projMember;
        this.projTime = projTime;
        this.maxDepth = maxDepth;
        this.soilSampleNum = soilSampleNum;
        this.waterSampleNum = waterSampleNum;
        this.projDescribe = projDescribe;
        this.testContent = testContent;
        this.remarks = remarks;
        this.state = state;
    }

    public ProjectInfo(String projNo, String state, String projName, String projPersonLiable, String projDescribe) {
        this.projNo = projNo;
        this.state = state;
        this.projName = projName;
        this.projPersonLiable = projPersonLiable;
        this.projDescribe = projDescribe;
    }

    public ProjectInfo() {
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProjectInfo [custName=");
		builder.append(custName);
		builder.append(", projId=");
		builder.append(projId);
		builder.append(", projNo=");
		builder.append(projNo);
		builder.append(", projName=");
		builder.append(projName);
		builder.append(", sampNum=");
		builder.append(sampNum);
		builder.append(", projPersonLiable=");
		builder.append(projPersonLiable);
		builder.append(", projMember=");
		builder.append(projMember);
		builder.append(", projTime=");
		builder.append(projTime);
		builder.append(", maxDepth=");
		builder.append(maxDepth);
		builder.append(", soilSampleNum=");
		builder.append(soilSampleNum);
		builder.append(", waterSampleNum=");
		builder.append(waterSampleNum);
		builder.append(", projDescribe=");
		builder.append(projDescribe);
		builder.append(", testContent=");
		builder.append(testContent);
		builder.append(", remarks=");
		builder.append(remarks);
		builder.append(", state=");
		builder.append(state);
		builder.append(", projCreateId=");
		builder.append(projCreateId);
		builder.append(", projCreateName=");
		builder.append(projCreateName);
		builder.append("]");
		return builder.toString();
	}
    
    
    
//	public String toString() {
//		StringBuffer buffer = new StringBuffer();
//		buffer.append("{\"custName\":\"");
//		buffer.append(custName);
//		buffer.append("\",\"projNo\":\"");
//		buffer.append(projNo);
//		buffer.append("\",\"projName\":\"");
//		buffer.append(projName);
//		buffer.append("\",\"sampNum\":\"");
//		buffer.append(sampNum);
//		buffer.append("\",\"projPersonLiable\":\"");
//		buffer.append(projPersonLiable);
//		buffer.append("\",\"projMember\":\"");
//		buffer.append(projMember);
//		buffer.append("\",\"projTime\":\"");
//		buffer.append(projTime);
//		buffer.append("\",\"maxDepth\":\"");
//		buffer.append(maxDepth);
//		buffer.append("\",\"soilSampleNum\":\"");
//		buffer.append(soilSampleNum);
//		buffer.append("\",\"waterSampleNum\":\"");
//		buffer.append(waterSampleNum);
//		buffer.append("\",\"projDescribe\":\"");
//		buffer.append(projDescribe);
//		buffer.append("\",\"testContent\":\"");
//		buffer.append(testContent);
//		buffer.append("\",\"remarks\":\"");
//		buffer.append(remarks);
//		buffer.append("\",\"state\":\"");
//		buffer.append(state);
//		buffer.append("\"}");
//		return buffer.toString();
//	}
    
}