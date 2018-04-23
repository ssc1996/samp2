package cn.sep.samp2.samp.pojo;

import java.util.List;

public class ReRole {
	private String type;
	private List<Role> roleList;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	@Override
	public String toString() {
		return "ReRole [type=" + type + ", roleList=" + roleList + "]";
	}
}
