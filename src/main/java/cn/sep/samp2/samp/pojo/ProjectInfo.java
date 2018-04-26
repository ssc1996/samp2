package cn.sep.samp2.samp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * Created by SEP QYL on 2018/2/2.
 */
public class ProjectInfo {
	private Integer projCustId;//客户id
    private String custName;//客户
    private String projId;//项目主键
    private String projNo;//项目编号
    private String projName;//项目名称
	private String projAddress;//项目地址
    private int sampNum;//采样点数
    private Integer projLiableId;//项目负责人id
    private String projPersonLiable;//负责人
    private String projMemberId;//项目成员id集合
    private String projMember;//项目成员
    private String projTime;//项目时间
    private String maxDepth;//最大深度
    private int soilSampleNum;//土样数量
    private int waterSampleNum;//水样数量
    private String projDescribe;//项目描述
    private String testContent;//测试内容
    @DateTimeFormat(pattern="yyyy-mm-dd")
	private Date projStartTime;        //项目开始时间
    @DateTimeFormat(pattern="yyyy-mm-dd")
	private Date projEndTime;        //项目结束时间
    private String remarks;//备注
    private String state;//状态
    private String projCreateId;//项目创建人ID
    private String projCreateName;//项目创建人名称
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date createTime;        //项目创建时间
	private Integer projModifyId;        //项目修改人
	private String projModifyPerson;        //项目修改人
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date projModifyTime;        //项目修改时间
    private String deleteData;
    private String keepStage;
	
    public Integer getProjCustId() {
		return projCustId;
	}
	public void setProjCustId(Integer projCustId) {
		this.projCustId = projCustId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getProjNo() {
		return projNo;
	}
	public void setProjNo(String projNo) {
		this.projNo = projNo;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getProjAddress() {
		return projAddress;
	}
	public void setProjAddress(String projAddress) {
		this.projAddress = projAddress;
	}
	public int getSampNum() {
		return sampNum;
	}
	public void setSampNum(int sampNum) {
		this.sampNum = sampNum;
	}
	public Integer getProjLiableId() {
		return projLiableId;
	}
	public void setProjLiableId(Integer projLiableId) {
		this.projLiableId = projLiableId;
	}
	public String getProjPersonLiable() {
		return projPersonLiable;
	}
	public void setProjPersonLiable(String projPersonLiable) {
		this.projPersonLiable = projPersonLiable;
	}
	public String getProjMemberId() {
		return projMemberId;
	}
	public void setProjMemberId(String projMemberId) {
		this.projMemberId = projMemberId;
	}
	public String getProjMember() {
		return projMember;
	}
	public void setProjMember(String projMember) {
		this.projMember = projMember;
	}
	public String getProjTime() {
		return projTime;
	}
	public void setProjTime(String projTime) {
		this.projTime = projTime;
	}
	public String getMaxDepth() {
		return maxDepth;
	}
	public void setMaxDepth(String maxDepth) {
		this.maxDepth = maxDepth;
	}
	public int getSoilSampleNum() {
		return soilSampleNum;
	}
	public void setSoilSampleNum(int soilSampleNum) {
		this.soilSampleNum = soilSampleNum;
	}
	public int getWaterSampleNum() {
		return waterSampleNum;
	}
	public void setWaterSampleNum(int waterSampleNum) {
		this.waterSampleNum = waterSampleNum;
	}
	public String getProjDescribe() {
		return projDescribe;
	}
	public void setProjDescribe(String projDescribe) {
		this.projDescribe = projDescribe;
	}
	public String getTestContent() {
		return testContent;
	}
	public void setTestContent(String testContent) {
		this.testContent = testContent;
	}
	public Date getProjStartTime() {
		return projStartTime;
	}
	public void setProjStartTime(Date projStartTime) {
		this.projStartTime = projStartTime;
	}
	public Date getProjEndTime() {
		return projEndTime;
	}
	public void setProjEndTime(Date projEndTime) {
		this.projEndTime = projEndTime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getProjModifyId() {
		return projModifyId;
	}
	public void setProjModifyId(Integer projModifyId) {
		this.projModifyId = projModifyId;
	}
	public String getProjModifyPerson() {
		return projModifyPerson;
	}
	public void setProjModifyPerson(String projModifyPerson) {
		this.projModifyPerson = projModifyPerson;
	}
	public Date getProjModifyTime() {
		return projModifyTime;
	}
	public void setProjModifyTime(Date projModifyTime) {
		this.projModifyTime = projModifyTime;
	}
	public String getDeleteData() {
		return deleteData;
	}
	public void setDeleteData(String deleteData) {
		this.deleteData = deleteData;
	}
	
	
	public String getKeepStage() {
		return keepStage;
	}
	public void setKeepStage(String keepStage) {
		this.keepStage = keepStage;
	}
	public ProjectInfo() {
    }
	
	public ProjectInfo(String projNo, String state, String projName, String projPersonLiable, String projDescribe) {
        this.projNo = projNo;
        this.state = state;
        this.projName = projName;
        this.projPersonLiable = projPersonLiable;
        this.projDescribe = projDescribe;
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

	@Override
	public String toString() {
		return "ProjectInfo [projCustId=" + projCustId + ", custName="
				+ custName + ", projId=" + projId + ", projNo=" + projNo
				+ ", projName=" + projName + ", projAddress=" + projAddress
				+ ", sampNum=" + sampNum + ", projLiableId=" + projLiableId
				+ ", projPersonLiable=" + projPersonLiable + ", projMemberId="
				+ projMemberId + ", projMember=" + projMember + ", projTime="
				+ projTime + ", maxDepth=" + maxDepth + ", soilSampleNum="
				+ soilSampleNum + ", waterSampleNum=" + waterSampleNum
				+ ", projDescribe=" + projDescribe + ", testContent="
				+ testContent + ", projStartTime=" + projStartTime
				+ ", projEndTime=" + projEndTime + ", remarks=" + remarks
				+ ", state=" + state + ", projCreateId=" + projCreateId
				+ ", projCreateName=" + projCreateName + ", createTime="
				+ createTime + ", projModifyId=" + projModifyId
				+ ", projModifyPerson=" + projModifyPerson
				+ ", projModifyTime=" + projModifyTime + ", deleteData="
				+ deleteData + ", keepStage=" + keepStage + "]";
	}
    
}