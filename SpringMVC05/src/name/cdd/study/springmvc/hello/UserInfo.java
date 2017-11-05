package name.cdd.study.springmvc.hello;

import java.util.Arrays;

public class UserInfo {
	private String userId;
	private String userName;
	private String userSex;
	private String[] userXq;
	
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
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String[] getUserXq() {
		return userXq;
	}
	public void setUserXq(String[] userXq) {
		this.userXq = userXq;
	}
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + ", userXq="
				+ Arrays.toString(userXq) + "]";
	}
	
}
