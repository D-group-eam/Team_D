package com.seol.webpageHaleMaven.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "movie_review")
public class ItemReview {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="mrt_id")
	private int mrt_id;
	
	@Column(name="mrt_title")
	private String mrt_title;
	
	@Column(name="mrt_content")
	private String mrt_content; 
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mem_id")
	private Member member;
	
	@Column(name="mrt_score")
	private Integer mrt_score; 
	
	@Column(name="mrt_datetime")
	private String mrt_datetime;
	
	@Column(name="mrt_ip")
	private String mrt_ip;
	
	public ItemReview() {
		
	}

	public int getMrt_id() {
		return mrt_id;
	}

	public void setMrt_id(int mrt_id) {
		this.mrt_id = mrt_id;
	}

	public String getMrt_title() {
		return mrt_title;
	}

	public void setMrt_title(String mrt_title) {
		this.mrt_title = mrt_title;
	}

	public String getMrt_content() {
		return mrt_content;
	}

	public void setMrt_content(String mrt_content) {
		this.mrt_content = mrt_content;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Integer getMrt_score() {
		return mrt_score;
	}

	public void setMrt_score(Integer mrt_score) {
		this.mrt_score = mrt_score;
	}

	public String getMrt_datetime() {
		return mrt_datetime;
	}

	public void setMrt_datetime(String mrt_datetime) {
		this.mrt_datetime = mrt_datetime;
	}

	public String getMrt_ip() {
		return mrt_ip;
	}

	public void setMrt_ip(String mrt_ip) {
		this.mrt_ip = mrt_ip;
	}

	@Override
	public String toString() {
		return "ItemReview [mrt_id=" + mrt_id + ", mrt_title=" + mrt_title + ", mrt_content=" + mrt_content
				+ ", member=" + member + ", mrt_score=" + mrt_score + ", mrt_datetime=" + mrt_datetime + ", mrt_ip="
				+ mrt_ip + "]";
	}
	
}
