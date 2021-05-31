package com.seol.webpageHaleMaven.member;

import java.util.Collection;

import com.seol.webpageHaleMaven.entity.Role;


@FieldMatch.List({
    @FieldMatch(first = "mem_password", second = "matchingMem_password", message = "The password fields must match")
})
public class CrmMember {

	
	private String mem_username;
	private String mem_password;
	private String matchingMem_password;
	private String mem_nickname;
	private Integer mem_sex;
	private String mem_email;
	private String mem_phone;
	private String mem_zipcode;
	private java.sql.Timestamp mem_birthday;
	private String mem_address1;
	private String mem_address2;
	private String mem_address3;
	private String mem_address4;
	private String mem_register_ip;
	private java.sql.Timestamp mem_register_datetime;
	private Integer mem_receive_email;
	private Integer mem_receive_sms;
	private Collection<Role> roles;

}
