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
@Table(name= "cart")
public class Cart {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cart_id")
	private int cart_id;
	
	@Column(name="mem_id")
	private int mem_id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mit_id")
	private Item mit_id;
	
	@Column(name="cart_stock")
	private String cart_stock;
	
	@Column(name="cart_date")
	private String cart_date;

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getMem_id() {
		return mem_id;
	}

	public void setMem_id(int mem_id) {
		this.mem_id = mem_id;
	}

	
	public Item getMit_id() {
		return mit_id;
	}

	public void setMit_id(Item mit_id) {
		this.mit_id = mit_id;
	}

	public String getCart_stock() {
		return cart_stock;
	}

	public void setCart_stock(String cart_stock) {
		this.cart_stock = cart_stock;
	}

	public String getCart_date() {
		return cart_date;
	}

	public void setCart_date(String cart_date) {
		this.cart_date = cart_date;
	}

	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", mem_id=" + mem_id + ", mit_id=" + mit_id + ", cart_stock=" + cart_stock
				+ ", cart_date=" + cart_date + "]";
	}

	
	
}
