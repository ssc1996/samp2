package cn.sep.samp2.samp.pojo;

import java.util.List;

public class UserRoleList {

	private List<UserRole> urList;

	public List<UserRole> getUrList() {
		return urList;
	}

	public void setUrList(List<UserRole> urList) {
		this.urList = urList;
	}

	@Override
	public String toString() {
		return "UserRoleList [urList=" + urList + "]";
	}
}
