package com.zdmoney.credit.framework.vo;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.zdmoney.credit.framework.vo.common.BaseParamVo;

/**
 * 功能号400004 Vo对象
 * 
 * @author Ivan
 *
 */
public class Vo_400004 extends BaseParamVo {

	@NotEmpty(message = "员工工号参数为空")
	@Length(max = 50, message = "员工工号参数超过50个字符")
	private String userCode;

	@NotEmpty(message = "校验类型参数为空")
	@Length(max = 1, message = "校验类型参数超过1个字符")
	private String validType;

	@Length(max = 50, message = "验证码唯一标识参数超过50个字符")
	private String token;

	@NotEmpty(message = "校验数据参数为空")
	@Length(max = 60, message = "校验数据参数超过60个字符")
	private String validData;

	@NotEmpty(message = "新密码参数为空")
	@Length(max = 60, message = "新密码参数超过60个字符")
	private String password;

	public String getValidType() {
		return validType;
	}

	public void setValidType(String validType) {
		this.validType = validType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getValidData() {
		return validData;
	}

	public void setValidData(String validData) {
		this.validData = validData;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

}
