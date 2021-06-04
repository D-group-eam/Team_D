package com.seol.webpageHaleMaven.member;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.seol.webpageHaleMaven.validation.FieldMatch;
import com.seol.webpageHaleMaven.validation.ValidEmail;


@FieldMatch.List({
    @FieldMatch(first = "mem_password", second = "matchingMem_password", message = "비밀번호가 일치하지 않아요.")
})
public class EditMember {
	
	private String mem_username;

	@NotNull(message = "닉네임를 입력하세요")
	@Size(min = 1, message = "닉네임을 입력하세요")
	private String mem_nickname;

	@NotNull(message = "is required")
	private Integer mem_sex;

	@ValidEmail
	@NotNull(message = "이메일을 입력하세요")
	@Size(min = 1, message = "이메일을 입력하세요")
	private String mem_email;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String mem_phone;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String mem_zipcode;

	@NotNull(message = "생일을 입력하세요")
	private String mem_birthday;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String mem_address1;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String mem_address2;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String mem_address3;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String mem_address4;


	@NotNull(message = "is required")
	private Integer mem_receive_email;

	@NotNull(message = "is required")
	private Integer mem_receive_sms;

	
	public EditMember() {
		
		
	}
	
	
	public String getMem_username() {
		return mem_username;
	}


	public void setMem_username(String mem_username) {
		this.mem_username = mem_username;
	}


	

	public String getMem_nickname() {
		return mem_nickname;
	}

	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}

	public Integer getMem_sex() {
		return mem_sex;
	}

	public void setMem_sex(Integer mem_sex) {
		this.mem_sex = mem_sex;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}

	public String getMem_zipcode() {
		return mem_zipcode;
	}

	public void setMem_zipcode(String mem_zipcode) {
		this.mem_zipcode = mem_zipcode;
	}

	public String getMem_birthday() {
		return mem_birthday;
	}

	public void setMem_birthday(String mem_birthday) {
		this.mem_birthday = mem_birthday;
	}

	public String getMem_address1() {
		return mem_address1;
	}

	public void setMem_address1(String mem_address1) {
		this.mem_address1 = mem_address1;
	}

	public String getMem_address2() {
		return mem_address2;
	}

	public void setMem_address2(String mem_address2) {
		this.mem_address2 = mem_address2;
	}

	public String getMem_address3() {
		return mem_address3;
	}

	public void setMem_address3(String mem_address3) {
		this.mem_address3 = mem_address3;
	}

	public String getMem_address4() {
		return mem_address4;
	}

	public void setMem_address4(String mem_address4) {
		this.mem_address4 = mem_address4;
	}

	public Integer getMem_receive_email() {
		return mem_receive_email;
	}

	public void setMem_receive_email(Integer mem_receive_email) {
		this.mem_receive_email = mem_receive_email;
	}

	public Integer getMem_receive_sms() {
		return mem_receive_sms;
	}

	public void setMem_receive_sms(Integer mem_receive_sms) {
		this.mem_receive_sms = mem_receive_sms;
	}
	
}
