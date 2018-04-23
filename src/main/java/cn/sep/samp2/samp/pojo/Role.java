package cn.sep.samp2.samp.pojo;

public class Role {
	private String roleId;
	private String roleName;
	private String userId;
	private String userName;
	private String roleMenu;
	private Integer menuParent;
	private Integer menuGrade;
	private String menuType;
	private String menuPath;
	private String menuSign;
	private String menuIcon;
	private String deleteData;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRoleMenu() {
		return roleMenu;
	}

	public void setRoleMenu(String roleMenu) {
		this.roleMenu = roleMenu;
	}

	public Integer getMenuParent() {
		return menuParent;
	}

	public void setMenuParent(Integer menuParent) {
		this.menuParent = menuParent;
	}

	public Integer getMenuGrade() {
		return menuGrade;
	}

	public void setMenuGrade(Integer menuGrade) {
		this.menuGrade = menuGrade;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getMenuPath() {
		return menuPath;
	}

	public void setMenuPath(String menuPath) {
		this.menuPath = menuPath;
	}

	public String getMenuSign() {
		return menuSign;
	}

	public void setMenuSign(String menuSign) {
		this.menuSign = menuSign;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public String getDeleteData() {
		return deleteData;
	}

	public void setDeleteData(String deleteData) {
		this.deleteData = deleteData;
	}
	public Role() {
		super();
	}
	public Role(String roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	public Role(String roleId, String roleName, String userId, String userName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.userId = userId;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName
				+ ", roleMenu=" + roleMenu + ", menuParent=" + menuParent
				+ ", menuGrade=" + menuGrade + ", menuType=" + menuType
				+ ", menuPath=" + menuPath + ", menuSign=" + menuSign
				+ ", menuIcon=" + menuIcon + ", deleteData=" + deleteData + "]";
	}
	
}
