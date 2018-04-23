package cn.sep.samp2.samp.pojo;

import java.util.List;

public class ModelUtil {
	private String id;
	private String other;
	private String[] strs;
	private ProjectInfo obj1;
	private UserInfo obj2;
	private Object obj3;
	private List<Role> roles;
	
	public ModelUtil(String id, String other) {
		super();
		this.id = id;
		this.other = other;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public Object getObj1() {
		return obj1;
	}
	public void setObj1(ProjectInfo obj1) {
		this.obj1 = obj1;
	}
	public Object getObj2() {
		return obj2;
	}
	public void setObj2(UserInfo obj2) {
		this.obj2 = obj2;
	}
	public Object getObj3() {
		return obj3;
	}
	public void setObj3(Object obj3) {
		this.obj3 = obj3;
	}
	
	public ModelUtil(ProjectInfo obj1, UserInfo obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public ModelUtil(ProjectInfo obj1, UserInfo obj2, Object obj3) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	public ModelUtil() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ModelUtil [obj1=");
		builder.append(obj1);
		builder.append(", obj2=");
		builder.append(obj2);
		builder.append(", obj3=");
		builder.append(obj3);
		builder.append("]");
		return builder.toString();
	}
	public ModelUtil(String id, String[] strs) {
		super();
		this.id = id;
		this.strs = strs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String[] getStrs() {
		return strs;
	}
	public void setStrs(String[] strs) {
		this.strs = strs;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public ModelUtil(String id, List<Role> roles) {
		super();
		this.id = id;
		this.roles = roles;
	}
	
	
}
