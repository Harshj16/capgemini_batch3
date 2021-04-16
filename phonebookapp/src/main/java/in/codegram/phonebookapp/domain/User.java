package in.codegram.phonebookapp.domain;

/**
 * This domain will work as a data traveller object between layer to layer. This
 * object will not be managed by spring.
 * 
 * @author pankaj
 *
 */
public class User extends Person {
	
	/**
	 * loginName of the user
	 */
	private String loginName;
	/**
	 * password of the user
	 */
	private String pwd;
	/**
	 * role of the user : 1: Admin, 2: User
	 */
	private Integer role;
	/**
	 * status of the user : 1 : Active, 2: Blocked
	 */
	private Integer status;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}


	

}
