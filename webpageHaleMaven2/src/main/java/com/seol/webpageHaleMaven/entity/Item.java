package com.seol.webpageHaleMaven.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "item")
public class Item {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="mit_id")
	    private  int mit_id;
		
		@Column(name="mit_key")
	    private  String mit_key;

		@Column(name="mit_name")
	    private String mit_name;
		
		@Column(name="mit_order")
	    private  Integer mit_order;
	    
		@Column(name="mit_type1")
	    private Integer mit_type1;
		
		@Column(name="mit_type2")
	    private  Integer mit_type2;
		
		@Column(name="mit_type3")
	    private  Integer mit_type3;
		
		@Column(name="mit_type4")
	    private  Integer mit_type4;
		
		@Column(name="mit_status")
	    private  Integer mit_status;
		
		@Column(name="mit_summary")
	    private String mit_summary;

		@Column(name="mit_content")
	    private String mit_content;
		
		@Column(name="mit_mobile_content")
	    private String mit_mobile_content;
		
		@Column(name="mit_price")
	    private Integer mit_price;
		
		@Column(name="mit_file")
	    private String mit_file;
		
		
		@Column(name="mem_id")
	    private Integer mem_id;
		
		@Column(name="mit_hit")
	    private Integer mit_hit;
		
		@Column(name="mit_datetime")
	    private String mit_datetime;
		
		@Column(name="mit_updated_datetime")
	    private String mit_updated_datetime;
		
		@Column(name="mit_sell_count")
	    private Integer mit_sell_count;
		
		@Column(name="mit_wish_count")
	    private Integer mit_wish_count;
		
		@Column(name="mit_download_days")
	    private String mit_download_days;
		
		
		@Column(name="mit_review_count")
	    private Integer mit_review_count;
		
		@Column(name="mit_review_average")
	    private Integer mit_review_average;
		
		
		@Column(name="mit_qna_count")
	    private Integer mit_qna_count;		
		
		@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
		@JoinColumn(name="brd_id")
		private Board board;
		//driectional Mapping foreign key 클래스
		
		@OneToMany(fetch=FetchType.LAZY,
				cascade= CascadeType.ALL)
		@JoinColumn(name="mit_id")
		private List<ItemReview> reviews;
		//Undirectional Mapping
		
		@OneToMany(fetch=FetchType.LAZY,
				cascade= CascadeType.ALL)
		@JoinColumn(name="mit_id")
		private List<ItemDetail> ItemDetails;
		
		
		
		/* 리뷰 추가 */
		public void addReview(ItemReview theItemReview) {	
			if(reviews==null) {
				reviews=new ArrayList<>();
			}
			this.reviews.add(theItemReview);
		}
		
		/* 아이템 옵션 추가 */
		
		public void addItemDetail(ItemDetail theItemDetail) {	
			if(ItemDetails==null) {
				ItemDetails=new ArrayList<>();
			}
			this.ItemDetails.add(theItemDetail);
		}
		
		
		public List<ItemDetail> getItemDetails() {
			return ItemDetails;
		}

		public void setItemDetails(List<ItemDetail> itemDetails) {
			ItemDetails = itemDetails;
		}

		public int getMit_id() {
			return mit_id;
		}

		public void setMit_id(int mit_id) {
			this.mit_id = mit_id;
		}

		public String getMit_key() {
			return mit_key;
		}

		public void setMit_key(String mit_key) {
			this.mit_key = mit_key;
		}

		public String getMit_name() {
			return mit_name;
		}

		public void setMit_name(String mit_name) {
			this.mit_name = mit_name;
		}

		public Integer getMit_order() {
			return mit_order;
		}

		public void setMit_order(Integer mit_order) {
			this.mit_order = mit_order;
		}

		public Integer getMit_type1() {
			return mit_type1;
		}

		public void setMit_type1(Integer mit_type1) {
			this.mit_type1 = mit_type1;
		}

		public Integer getMit_type2() {
			return mit_type2;
		}

		public void setMit_type2(Integer mit_type2) {
			this.mit_type2 = mit_type2;
		}

		public Integer getMit_type3() {
			return mit_type3;
		}

		public void setMit_type3(Integer mit_type3) {
			this.mit_type3 = mit_type3;
		}

		public Integer getMit_type4() {
			return mit_type4;
		}

		public void setMit_type4(Integer mit_type4) {
			this.mit_type4 = mit_type4;
		}

		public Integer getMit_status() {
			return mit_status;
		}

		public void setMit_status(Integer mit_status) {
			this.mit_status = mit_status;
		}

		public String getMit_summary() {
			return mit_summary;
		}

		public void setMit_summary(String mit_summary) {
			this.mit_summary = mit_summary;
		}

		public String getMit_content() {
			return mit_content;
		}

		public void setMit_content(String mit_content) {
			this.mit_content = mit_content;
		}

		public String getMit_mobile_content() {
			return mit_mobile_content;
		}

		public void setMit_mobile_content(String mit_mobile_content) {
			this.mit_mobile_content = mit_mobile_content;
		}

		public Integer getMit_price() {
			return mit_price;
		}

		public void setMit_price(Integer mit_price) {
			this.mit_price = mit_price;
		}

		public String getMit_file() {
			return mit_file;
		}

		public void setMit_file(String mit_file) {
			this.mit_file = mit_file;
		}

		public Integer getMem_id() {
			return mem_id;
		}

		public void setMem_id(Integer mem_id) {
			this.mem_id = mem_id;
		}

		public Integer getMit_hit() {
			return mit_hit;
		}

		public void setMit_hit(Integer mit_hit) {
			this.mit_hit = mit_hit;
		}

		public String getMit_datetime() {
			return mit_datetime;
		}

		public void setMit_datetime(String mit_datetime) {
			this.mit_datetime = mit_datetime;
		}

		public String getMit_updated_datetime() {
			return mit_updated_datetime;
		}

		public void setMit_updated_datetime(String mit_updated_datetime) {
			this.mit_updated_datetime = mit_updated_datetime;
		}

		public Integer getMit_sell_count() {
			return mit_sell_count;
		}

		public void setMit_sell_count(Integer mit_sell_count) {
			this.mit_sell_count = mit_sell_count;
		}

		public Integer getMit_wish_count() {
			return mit_wish_count;
		}

		public void setMit_wish_count(Integer mit_wish_count) {
			this.mit_wish_count = mit_wish_count;
		}

		public String getMit_download_days() {
			return mit_download_days;
		}

		public void setMit_download_days(String mit_download_days) {
			this.mit_download_days = mit_download_days;
		}

		public Integer getMit_review_count() {
			return mit_review_count;
		}

		public void setMit_review_count(Integer mit_review_count) {
			this.mit_review_count = mit_review_count;
		}

		public Integer getMit_review_average() {
			return mit_review_average;
		}

		public void setMit_review_average(Integer mit_review_average) {
			this.mit_review_average = mit_review_average;
		}

		public Integer getMit_qna_count() {
			return mit_qna_count;
		}

		public void setMit_qna_count(Integer mit_qna_count) {
			this.mit_qna_count = mit_qna_count;
		}

		public Board getBoard() {
			return board;
		}

		public void setBoard(Board board) {
			this.board = board;
		}

		public List<ItemReview> getReviews() {
			return reviews;
		}

		public void setReviews(List<ItemReview> reviews) {
			this.reviews = reviews;
		}

		@Override
		public String toString() {
			return "Item [mit_id=" + mit_id + ", mit_key=" + mit_key + ", mit_name=" + mit_name + ", mit_order="
					+ mit_order + ", mit_type1=" + mit_type1 + ", mit_type2=" + mit_type2 + ", mit_type3=" + mit_type3
					+ ", mit_type4=" + mit_type4 + ", mit_status=" + mit_status + ", mit_summary=" + mit_summary
					+ ", mit_content=" + mit_content + ", mit_mobile_content=" + mit_mobile_content + ", mit_price="
					+ mit_price + ", mit_file=" + mit_file + ", mem_id=" + mem_id + ", mit_hit=" + mit_hit
					+ ", mit_datetime=" + mit_datetime + ", mit_updated_datetime=" + mit_updated_datetime
					+ ", mit_sell_count=" + mit_sell_count + ", mit_wish_count=" + mit_wish_count
					+ ", mit_download_days=" + mit_download_days + ", mit_review_count=" + mit_review_count
					+ ", mit_review_average=" + mit_review_average + ", mit_qna_count=" + mit_qna_count + ", board="
					+ board + ", reviews=" + reviews + ", getMit_id()=" + getMit_id() + ", getMit_key()=" + getMit_key()
					+ ", getMit_name()=" + getMit_name() + ", getMit_order()=" + getMit_order() + ", getMit_type1()="
					+ getMit_type1() + ", getMit_type2()=" + getMit_type2() + ", getMit_type3()=" + getMit_type3()
					+ ", getMit_type4()=" + getMit_type4() + ", getMit_status()=" + getMit_status()
					+ ", getMit_summary()=" + getMit_summary() + ", getMit_content()=" + getMit_content()
					+ ", getMit_mobile_content()=" + getMit_mobile_content() + ", getMit_price()=" + getMit_price()
					+ ", getMit_file()=" + getMit_file() + ", getMem_id()=" + getMem_id() + ", getMit_hit()="
					+ getMit_hit() + ", getMit_datetime()=" + getMit_datetime() + ", getMit_updated_datetime()="
					+ getMit_updated_datetime() + ", getMit_sell_count()=" + getMit_sell_count()
					+ ", getMit_wish_count()=" + getMit_wish_count() + ", getMit_download_days()="
					+ getMit_download_days() + ", getMit_review_count()=" + getMit_review_count()
					+ ", getMit_review_average()=" + getMit_review_average() + ", getMit_qna_count()="
					+ getMit_qna_count() + ", getBoard()=" + getBoard() + ", getReviews()=" + getReviews()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		

		

		
}
