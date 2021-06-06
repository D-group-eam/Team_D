package com.seol.webpageHaleMaven.member;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.seol.webpageHaleMaven.validation.FieldMatch;
import com.seol.webpageHaleMaven.validation.PasswordMatch;


@PasswordMatch.List({
    @PasswordMatch(first = "changePassword", second = "matchingMem_password", message = "비밀번호가 일치하지 않아요.")
})
public class Password {
	@NotNull(message = "비밀번호를 입력하세요")
	@Size(min = 1, message = "비밀번호를 입력하세요")
	private String currentPassword;
	@NotNull(message = "비밀번호를 입력하세요")
	@Size(min = 1, message = "비밀번호를 입력하세요")
	private String changePassword;
	@NotNull(message = "비밀번호를 입력하세요")
	@Size(min = 1, message = "비밀번호를 입력하세요")
	private String chageMatchingPassword;
	
	
	public Password() {
		
	}


	public String getCurrentPassword() {
		return currentPassword;
	}


	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}


	public String getChangePassword() {
		return changePassword;
	}


	public void setChangePassword(String changePassword) {
		this.changePassword = changePassword;
	}


	public String getChageMatchingPassword() {
		return chageMatchingPassword;
	}


	public void setChageMatchingPassword(String chageMatchingPassword) {
		this.chageMatchingPassword = chageMatchingPassword;
	}
	
	
}
