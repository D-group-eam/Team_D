package com.seol.webpageHaleMaven.entity;

public class OrderPage {
	
	private String nickname;
	private int page;
	private int itemsPerPage;
	private int startNum;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getItemsPerPage() {
		return itemsPerPage;
	}
	public void setItemsPerPage(int itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	
	@Override
	public String toString() {
		return "OrderPage [nickname=" + nickname + ", page=" + page + ", itemsPerPage=" + itemsPerPage + ", startNum="
				+ startNum + "]";
	}
	
	
	
}