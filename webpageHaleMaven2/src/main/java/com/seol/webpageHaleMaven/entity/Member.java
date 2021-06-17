package com.seol.webpageHaleMaven.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "member")
public class Member {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="mem_id")
	private int mem_id;
	
	@Column(name="mem_email")
	private String mem_email;
	
	@Column(name="mem_username")
	private String mem_username;
	
	@Column(name="mem_nickname")
	private String mem_nickname; 
	
	@Column(name="mem_level")
	private Integer mem_level;
	
	@Column(name="mem_point")
	private Integer mem_point; 
	
	@Column(name="mem_phone")
	private String mem_phone;
	
	@Column(name="mem_birthday")
	private String mem_birthday;
	
	@Column(name="mem_sex")
	private Integer mem_sex;
	
	@Column(name="mem_zipcode")
	private String mem_zipcode;
	
	@Column(name="mem_address1")
	private String mem_address1;
	
	@Column(name="mem_address2")
	private String mem_address2;
	
	@Column(name="mem_address3")
	private String mem_address3;
	
	@Column(name="mem_address4")
	private String mem_address4;
	
	@Column(name="mem_receive_email")
	private Integer mem_receive_email;
	
	@Column(name="mem_use_note")
	private Integer mem_use_note;
	
	@Column(name="mem_receive_sms")
	private Integer mem_receive_sms;
	
	@Column(name="mem_open_profile")
	private Integer mem_open_profile;
	
	@Column(name="mem_denied")
	private Integer mem_denied;
	
	@Column(name="mem_email_cert")
	private Integer mem_email_cert;
	
	@Column(name="mem_register_datetime")
	private String mem_register_datetime;
	
	@Column(name="mem_register_ip")
	private String mem_register_ip;
	
	@Column(name="mem_lastlogin_datetime")
	private String mem_lastlogin_datetime;
	
	@Column(name="mem_lastlogin_ip")
	private String mem_lastlogin_ip;
	
	@Column(name="mem_is_admin")
	private Integer mem_is_admin;
	
	@Column(name="mem_profile_content")
	private String  mem_profile_content;
	
	@Column(name="mem_adminmemo")
	private String mem_adminmemo;
	
	@Column(name="mem_icon")
	private String mem_icon;	
	
	@Column(name="mem_photo")
	private String mem_photo;
	
	//테이블 필드 새로 추가시킬 것
	@Column(name="mem_password")
	private String mem_password;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "members_roles", 
	joinColumns = @JoinColumn(name = "mem_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Collection<Role> roles;
	
	@OneToMany(fetch=FetchType.LAZY,
			cascade=CascadeType.ALL)
	@JoinColumn(name="mem_id")
	private List<Cart> carts;
	
	//역할 클래스를 기존에 있는 역할 클래스 리스트에 추가한다. 
	public void addRoles(Role theRole) {	
		if(roles==null) {
			roles=new ArrayList<>();
		}
		this.roles.add(theRole);
	}
		
	
	public void addCarts(Cart theCart) {	
		if(carts==null) {
			carts=new ArrayList<>();
		}
		this.carts.add(theCart);
	}
	
	
	
	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public String getMem_password() {
		return mem_password;
	}

	public void setMem_password(String mem_password) {
		this.mem_password = mem_password;
	}
	

	
	public Collection<Role> getRoles() {
		return roles;
	}

//멤버의 역할을 설정한다. 역할 클래스 객체를 가진 리스트가 인자로 들어온다.
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	

	public Member() {
		
	}
	
	public Member(int mem_id, String mem_email, String mem_username, String mem_nickname, Integer mem_level,
			Integer mem_point, String mem_phone, String mem_birthday, Integer mem_sex, String mem_zipcode,
			String mem_address1, String mem_address2, String mem_address3, String mem_address4,
			Integer mem_receive_email, Integer mem_use_note, Integer mem_receive_sms, Integer mem_open_profile,
			Integer mem_denied, Integer mem_email_cert, String mem_register_datetime, String mem_register_ip,
			String mem_lastlogin_datetime, String mem_lastlogin_ip, Integer mem_is_admin, String mem_profile_content,
			String mem_adminmemo, String mem_icon, String mem_photo, String mem_password) {
		this.mem_id = mem_id;
		this.mem_email = mem_email;
		this.mem_username = mem_username;
		this.mem_nickname = mem_nickname;
		this.mem_level = mem_level;
		this.mem_point = mem_point;
		this.mem_phone = mem_phone;
		this.mem_birthday = mem_birthday;
		this.mem_sex = mem_sex;
		this.mem_zipcode = mem_zipcode;
		this.mem_address1 = mem_address1;
		this.mem_address2 = mem_address2;
		this.mem_address3 = mem_address3;
		this.mem_address4 = mem_address4;
		this.mem_receive_email = mem_receive_email;
		this.mem_use_note = mem_use_note;
		this.mem_receive_sms = mem_receive_sms;
		this.mem_open_profile = mem_open_profile;
		this.mem_denied = mem_denied;
		this.mem_email_cert = mem_email_cert;
		this.mem_register_datetime = mem_register_datetime;
		this.mem_register_ip = mem_register_ip;
		this.mem_lastlogin_datetime = mem_lastlogin_datetime;
		this.mem_lastlogin_ip = mem_lastlogin_ip;
		this.mem_is_admin = mem_is_admin;
		this.mem_profile_content = mem_profile_content;
		this.mem_adminmemo = mem_adminmemo;
		this.mem_icon = mem_icon;
		this.mem_photo = mem_photo;
		this.mem_password = mem_password;
	}

	public Member(int mem_id, String mem_email, String mem_username, String mem_nickname, Integer mem_level,
			Integer mem_point, String mem_phone, String mem_birthday, Integer mem_sex, String mem_zipcode,
			String mem_address1, String mem_address2, String mem_address3, String mem_address4,
			Integer mem_receive_email, Integer mem_use_note, Integer mem_receive_sms, Integer mem_open_profile,
			Integer mem_denied, Integer mem_email_cert, String mem_register_datetime, String mem_register_ip,
			String mem_lastlogin_datetime, String mem_lastlogin_ip, Integer mem_is_admin, String mem_profile_content,
			String mem_adminmemo, String mem_icon, String mem_photo, String mem_password, Collection<Role> roles) {
		this.mem_id = mem_id;
		this.mem_email = mem_email;
		this.mem_username = mem_username;
		this.mem_nickname = mem_nickname;
		this.mem_level = mem_level;
		this.mem_point = mem_point;
		this.mem_phone = mem_phone;
		this.mem_birthday = mem_birthday;
		this.mem_sex = mem_sex;
		this.mem_zipcode = mem_zipcode;
		this.mem_address1 = mem_address1;
		this.mem_address2 = mem_address2;
		this.mem_address3 = mem_address3;
		this.mem_address4 = mem_address4;
		this.mem_receive_email = mem_receive_email;
		this.mem_use_note = mem_use_note;
		this.mem_receive_sms = mem_receive_sms;
		this.mem_open_profile = mem_open_profile;
		this.mem_denied = mem_denied;
		this.mem_email_cert = mem_email_cert;
		this.mem_register_datetime = mem_register_datetime;
		this.mem_register_ip = mem_register_ip;
		this.mem_lastlogin_datetime = mem_lastlogin_datetime;
		this.mem_lastlogin_ip = mem_lastlogin_ip;
		this.mem_is_admin = mem_is_admin;
		this.mem_profile_content = mem_profile_content;
		this.mem_adminmemo = mem_adminmemo;
		this.mem_icon = mem_icon;
		this.mem_photo = mem_photo;
		this.mem_password = mem_password;
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Member [mem_id=" + mem_id + ", mem_email=" + mem_email + ", mem_username=" + mem_username
				+ ", mem_nickname=" + mem_nickname + ", mem_level=" + mem_level + ", mem_point=" + mem_point
				+ ", mem_phone=" + mem_phone + ", mem_birthday=" + mem_birthday + ", mem_sex=" + mem_sex
				+ ", mem_zipcode=" + mem_zipcode + ", mem_address1=" + mem_address1 + ", mem_address2=" + mem_address2
				+ ", mem_address3=" + mem_address3 + ", mem_address4=" + mem_address4 + ", mem_receive_email="
				+ mem_receive_email + ", mem_use_note=" + mem_use_note + ", mem_receive_sms=" + mem_receive_sms
				+ ", mem_open_profile=" + mem_open_profile + ", mem_denied=" + mem_denied + ", mem_email_cert="
				+ mem_email_cert + ", mem_register_datetime=" + mem_register_datetime + ", mem_register_ip="
				+ mem_register_ip + ", mem_lastlogin_datetime=" + mem_lastlogin_datetime + ", mem_lastlogin_ip="
				+ mem_lastlogin_ip + ", mem_is_admin=" + mem_is_admin + ", mem_profile_content=" + mem_profile_content
				+ ", mem_adminmemo=" + mem_adminmemo + ", mem_icon=" + mem_icon + ", mem_photo=" + mem_photo
				+ ", mem_password=" + "******" + ", roles=" + roles + "]";
	}

	public int getMem_id() {
		return mem_id;
	}

	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
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

	public Integer getMem_level() {
		return mem_level;
	}

	public void setMem_level(Integer mem_level) {
		this.mem_level = mem_level;
	}

	public Integer getMem_point() {
		return mem_point;
	}

	public void setMem_point(Integer mem_point) {
		this.mem_point = mem_point;
	}

	public String getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}

	public String getMem_birthday() {
		return mem_birthday;
	}

	public void setMem_birthday(String mem_birthday) {
		this.mem_birthday = mem_birthday;
	}

	public Integer getMem_sex() {
		return mem_sex;
	}

	public void setMem_sex(Integer mem_sex) {
		this.mem_sex = mem_sex;
	}

	public String getMem_zipcode() {
		return mem_zipcode;
	}

	public void setMem_zipcode(String mem_zipcode) {
		this.mem_zipcode = mem_zipcode;
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

	public Integer getMem_use_note() {
		return mem_use_note;
	}

	public void setMem_use_note(Integer mem_use_note) {
		this.mem_use_note = mem_use_note;
	}

	public Integer getMem_receive_sms() {
		return mem_receive_sms;
	}

	public void setMem_receive_sms(Integer mem_receive_sms) {
		this.mem_receive_sms = mem_receive_sms;
	}

	public Integer getMem_open_profile() {
		return mem_open_profile;
	}

	public void setMem_open_profile(Integer mem_open_profile) {
		this.mem_open_profile = mem_open_profile;
	}

	public Integer getMem_denied() {
		return mem_denied;
	}

	public void setMem_denied(Integer mem_denied) {
		this.mem_denied = mem_denied;
	}

	public Integer getMem_email_cert() {
		return mem_email_cert;
	}

	public void setMem_email_cert(Integer mem_email_cert) {
		this.mem_email_cert = mem_email_cert;
	}

	public String getMem_register_datetime() {
		return mem_register_datetime;
	}

	public void setMem_register_datetime(String mem_register_datetime) {
		this.mem_register_datetime = mem_register_datetime;
	}

	public String getMem_register_ip() {
		return mem_register_ip;
	}

	public void setMem_register_ip(String mem_register_ip) {
		this.mem_register_ip = mem_register_ip;
	}

	public String getMem_lastlogin_datetime() {
		return mem_lastlogin_datetime;
	}

	public void setMem_lastlogin_datetime(String mem_lastlogin_datetime) {
		this.mem_lastlogin_datetime = mem_lastlogin_datetime;
	}

	public String getMem_lastlogin_ip() {
		return mem_lastlogin_ip;
	}

	public void setMem_lastlogin_ip(String mem_lastlogin_ip) {
		this.mem_lastlogin_ip = mem_lastlogin_ip;
	}

	public Integer getMem_is_admin() {
		return mem_is_admin;
	}

	public void setMem_is_admin(Integer mem_is_admin) {
		this.mem_is_admin = mem_is_admin;
	}

	public String getMem_profile_content() {
		return mem_profile_content;
	}

	public void setMem_profile_content(String mem_profile_content) {
		this.mem_profile_content = mem_profile_content;
	}

	public String getMem_adminmemo() {
		return mem_adminmemo;
	}

	public void setMem_adminmemo(String mem_adminmemo) {
		this.mem_adminmemo = mem_adminmemo;
	}

	public String getMem_icon() {
		return mem_icon;
	}

	public void setMem_icon(String mem_icon) {
		this.mem_icon = mem_icon;
	}

	public String getMem_photo() {
		return mem_photo;
	}

	public void setMem_photo(String mem_photo) {
		this.mem_photo = mem_photo;
	}

	
}
