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
@Table(name= "item_detail")
public class ItemDetail {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="midt_id")
	private int midt_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mem_id")
	private Member mem_id;
	
	@Column(name="midt_title")
	private String midt_title;
	
	@Column(name="midt_price")
	private Integer midt_price;
	
	@Column(name="midt_status")
	private Integer midt_status;

	public int getMidt_id() {
		return midt_id;
	}

	public void setMidt_id(int midt_id) {
		this.midt_id = midt_id;
	}

	

	public Member getMem_id() {
		return mem_id;
	}

	public void setMem_id(Member mem_id) {
		this.mem_id = mem_id;
	}

	public String getMidt_title() {
		return midt_title;
	}

	public void setMidt_title(String midt_title) {
		this.midt_title = midt_title;
	}

	public Integer getMidt_price() {
		return midt_price;
	}

	public void setMidt_price(Integer midt_price) {
		this.midt_price = midt_price;
	}

	public Integer getMidt_status() {
		return midt_status;
	}

	public void setMidt_status(Integer midt_status) {
		this.midt_status = midt_status;
	}

	@Override
	public String toString() {
		return "ItemDetail [midt_id=" + midt_id + ", mem_id=" + mem_id + ", midt_title=" + midt_title + ", midt_price="
				+ midt_price + ", midt_status=" + midt_status + "]";
	}
	
	
	
}
