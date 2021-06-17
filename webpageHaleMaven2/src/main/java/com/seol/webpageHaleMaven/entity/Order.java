package com.seol.webpageHaleMaven.entity;

import java.sql.Date;

public class Order {

	private int motId;	
	private int memId;	
	private String memNickname;
	private String memRealname;	
	private String memEmail;	
	private String memPhone;	
	private String motMemo;	
	private int motTotalMoney;	
	private int motDeposit;	
	private int motCashRequest;	
	private int motCash;	
	private String motPayType;	
	private int motStatus;
	private Date motOrderDate;
	private int modtCount;
	private int mitPrice;
	
	public int getMotId() {
		return motId;
	}
	public void setMotId(int motId) {
		this.motId = motId;
	}
	public int getMemId() {
		return memId;
	}
	public void setMemId(int memId) {
		this.memId = memId;
	}
	public String getMemNickname() {
		return memNickname;
	}
	public void setMemNickname(String memNickname) {
		this.memNickname = memNickname;
	}
	public String getMemRealname() {
		return memRealname;
	}
	public void setMemRealname(String memRealname) {
		this.memRealname = memRealname;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMotMemo() {
		return motMemo;
	}
	public void setMotMemo(String motMemo) {
		this.motMemo = motMemo;
	}
	public int getMotTotalMoney() {
		return motTotalMoney;
	}
	public void setMotTotalMoney(int motTotalMoney) {
		this.motTotalMoney = motTotalMoney;
	}
	public int getMotDeposit() {
		return motDeposit;
	}
	public void setMotDeposit(int motDeposit) {
		this.motDeposit = motDeposit;
	}
	public int getMotCashRequest() {
		return motCashRequest;
	}
	public void setMotCashRequest(int motCashRequest) {
		this.motCashRequest = motCashRequest;
	}
	public int getMotCash() {
		return motCash;
	}
	public void setMotCash(int motCash) {
		this.motCash = motCash;
	}
	public String getMotPayType() {
		return motPayType;
	}
	public void setMotPayType(String motPayType) {
		this.motPayType = motPayType;
	}
	public int getMotStatus() {
		return motStatus;
	}
	public void setMotStatus(int motStatus) {
		this.motStatus = motStatus;
	}
	public Date getMotOrderDate() {
		return motOrderDate;
	}
	public void setMotOrderDate(Date motOrderDate) {
		this.motOrderDate = motOrderDate;
	}
	public int getModtCount() {
		return modtCount;
	}
	public void setModtCount(int modtCount) {
		this.modtCount = modtCount;
	}
	
	public int getMitPrice() {
		return mitPrice;
	}
	public void setMotPrice(int mitPrice) {
		this.mitPrice = mitPrice;
	}
	
	@Override
	public String toString() {
		return "Order [motId=" + motId + ", memId=" + memId + ", memNickname=" + memNickname + ", memRealname="
				+ memRealname + ", memEmail=" + memEmail + ", memPhone=" + memPhone + ", motMemo=" + motMemo
				+ ", motTotalMoney=" + motTotalMoney + ", motDeposit=" + motDeposit + ", motCashRequest="
				+ motCashRequest + ", motCash=" + motCash + ", motPayType=" + motPayType + ", motStatus=" + motStatus
				+ ", motOrderDate=" + motOrderDate + ", modtCount=" + modtCount + ", mitPrice=" + mitPrice + "]";
	}
	
}