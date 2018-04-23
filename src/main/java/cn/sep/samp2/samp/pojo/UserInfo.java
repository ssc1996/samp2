package cn.sep.samp2.samp.pojo;


import cn.sep.samp2.samp.util.MethodUtil;

public class UserInfo {
	private String userId;//用户ID
	private String userNo;//用户编号
	private String userName;//用户名称
	private String realName;//用户名称
	private String userPwd;//用户密码
	private String userPhone;//用户注册手机号
	private String userCompId;//用户所属公司ID
	private String userCreateDate;//创建时间
	private String userCreateId;//创建人ID
	private String userCreateName;//创建人名称
	private String userRole;//任务角色
	private String userMenu;//用户菜单
	private String deleteData;
	private String userDisable;//可用
	public String getUserDisable() {
		return userDisable;
	}
	public void setUserDisable(String userDisable) {
		this.userDisable = userDisable;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserCompId() {
		return userCompId;
	}
	public void setUserCompId(String userCompId) {
		this.userCompId = userCompId;
	}
	public String getUserCreateDate() {
		return userCreateDate;
	}
	public void setUserCreateDate(String userCreateDate) {
		this.userCreateDate = userCreateDate;
	}
	public String getUserCreateId() {
		return userCreateId;
	}
	public void setUserCreateId(String userCreateId) {
		this.userCreateId = userCreateId;
	}
	public String getUserCreateName() {
		return userCreateName;
	}
	public void setUserCreateName(String userCreateName) {
		this.userCreateName = userCreateName;
	}
	public UserInfo(String userId, String userNo, String userName, String userPwd,
			String userPhone, String userCompId, String userCreateDate,
			String userCreateId, String userCreateName) {
		super();
		this.userId = userId;
		this.userNo = userNo;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userPhone = userPhone;
		this.userCompId = userCompId;
		this.userCreateDate = userCreateDate;
		this.userCreateId = userCreateId;
		this.userCreateName = userCreateName;
	}
	
	public UserInfo(String userId, String userNo, String userName,
			String userPhone, String userCompId) {
		super();
		this.userId = userId;
		this.userNo = userNo;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userCompId = userCompId;
	}
	public UserInfo(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	public UserInfo() {
		super();
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userNo=" + userNo
				+ ", userName=" + userName + ", realName=" + realName
				+ ", userPwd=" + userPwd + ", userPhone=" + userPhone
				+ ", userCompId=" + userCompId + ", userCreateDate="
				+ userCreateDate + ", userCreateId=" + userCreateId
				+ ", userCreateName=" + userCreateName + ", userRole="
				+ userRole + ", userMenu=" + userMenu + ", deleteData="
				+ deleteData + ", userDisable=" + userDisable + "]";
	}
	public static UserInfo getUserInfo(String userStr){
		userStr = MethodUtil.getBetween(userStr);
		String[] str = userStr.split(",");
		UserInfo user = new UserInfo(MethodUtil.getValue(str[0]),MethodUtil.getValue(str[1]),MethodUtil.getValue(str[2]),MethodUtil.getValue(str[3]),MethodUtil.getValue(str[4]));
		return user;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getUserMenu() {
		return userMenu;
	}
	public void setUserMenu(String userMenu) {
		this.userMenu = userMenu;
	}
	public String getDeleteData() {
		return deleteData;
	}
	public void setDeleteData(String deleteData) {
		this.deleteData = deleteData;
	}
	
}
