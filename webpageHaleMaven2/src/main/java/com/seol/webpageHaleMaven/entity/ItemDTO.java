package com.seol.webpageHaleMaven.entity;

import java.util.List;



import org.springframework.web.multipart.MultipartFile;


public class ItemDTO {
		
	    private  int mit_id;
		
	    private  String mit_key;

	    private String mit_name;
		
	    private  Integer mit_order;
	    
	    private Integer mit_type1;
		
	    private  Integer mit_type2;
		
	    private  Integer mit_type3;
		
	    private  Integer mit_type4;
		
	    private  Integer mit_status;
		
	    private String mit_summary;

	    private String mit_content;
		
	    private String mit_mobile_content;
		
	    private Integer mit_price;
		
	    private MultipartFile mit_file;
		
		/*
		 * 멀티파트 부분이 서버로 갈 때 안 된다? 그래서 server 폴더에서 server.xml 파일을 수정했다.
		 */	    
		/* DTO 에서 VO로 전환한다. */
		public Item _toConvertItem() {
			
			Item item = new Item();
			item.setMit_key(mit_key);
			item.setMit_name(mit_name);
			item.setMit_order(mit_order);
			item.setMit_type1(mit_type1);
			item.setMit_type2(mit_type2);
			item.setMit_type3(mit_type3);
			item.setMit_type4(mit_type4);
			item.setMit_status(mit_status);
			item.setMit_summary(mit_summary);
			item.setMit_content(mit_content);
			item.setMit_mobile_content(mit_mobile_content);
			item.setMit_price(mit_price);
			item.setMit_file(mit_file.getOriginalFilename());
			return item;
		}
		
	    @Override
		public String toString() {
			return "ItemDTO [mit_id=" + mit_id + ", mit_key=" + mit_key + ", mit_name=" + mit_name + ", mit_order="
					+ mit_order + ", mit_type1=" + mit_type1 + ", mit_type2=" + mit_type2 + ", mit_type3=" + mit_type3
					+ ", mit_type4=" + mit_type4 + ", mit_status=" + mit_status + ", mit_summary=" + mit_summary
					+ ", mit_content=" + mit_content + ", mit_mobile_content=" + mit_mobile_content + ", mit_price="
					+ mit_price + ", mit_file=" + mit_file + ", mem_id=" + mem_id + ", mit_hit=" + mit_hit
					+ ", mit_datetime=" + mit_datetime + ", mit_updated_datetime=" + mit_updated_datetime
					+ ", mit_sell_count=" + mit_sell_count + ", mit_wish_count=" + mit_wish_count
					+ ", mit_download_days=" + mit_download_days + ", mit_review_count=" + mit_review_count
					+ ", mit_review_average=" + mit_review_average + ", mit_qna_count=" + mit_qna_count + ", board="
					+ board + ", reviews=" + reviews + ", ItemDetails=" + ItemDetails + "]";
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

		public MultipartFile getMit_file() {
			return mit_file;
		}

		public void setMit_file(MultipartFile mit_file) {
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

		public List<ItemDetail> getItemDetails() {
			return ItemDetails;
		}

		public void setItemDetails(List<ItemDetail> itemDetails) {
			ItemDetails = itemDetails;
		}

		private Integer mem_id;
		
	    private Integer mit_hit;
		
	    private String mit_datetime;
		
	    private String mit_updated_datetime;
		
	    private Integer mit_sell_count;
		
	    private Integer mit_wish_count;
		
	    private String mit_download_days;
		
		
	    private Integer mit_review_count;
		
	    private Integer mit_review_average;
		
		
	    private Integer mit_qna_count;		
		
		private Board board;
		
		private List<ItemReview> reviews;
		
		private List<ItemDetail> ItemDetails;
		
		
	

		
}
