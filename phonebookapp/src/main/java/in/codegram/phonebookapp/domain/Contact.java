package in.codegram.phonebookapp.domain;

/**
 * This domain is used for data traveller object It should be managed by spring
 * 
 * @author panka
 *
 */
public class Contact extends Person {

	private Integer userId;
	private String remark;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
