package com.seol.webpageHaleMaven.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "board")
public class Board {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="brd_id")
	private int brd_id;
	
	@Column(name="bgr_id")
	private Integer bgr_id;
	
	@Column(name="brd_key")
	private String brd_key;
	
	@Column(name="brd_name")
	private String brd_name; 
	
	@Column(name="brd_mobile_name")
	private String brd_mobile_name;
	
	@Column(name="brd_order")
	private Integer brd_order; 
	
	@Column(name="brd_search")
	private Integer brd_search;
	
	
	@OneToMany(fetch = FetchType.LAZY,
			mappedBy = "board",
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,CascadeType.REFRESH})
	private List<Item> items;
	// directional Mapping 당하는 입장
	
	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy="board", cascade=
	 * {CascadeType.PERSIST,
	 * CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH}) private
	 * List<Movie> movies;
	 */
	
	public Board() {
	}

	public int getBrd_id() {
		return brd_id;
	}

	public void setBrd_id(int brd_id) {
		this.brd_id = brd_id;
	}

	public Integer getBgr_id() {
		return bgr_id;
	}

	public void setBgr_id(Integer bgr_id) {
		this.bgr_id = bgr_id;
	}

	public String getBrd_key() {
		return brd_key;
	}

	public void setBrd_key(String brd_key) {
		this.brd_key = brd_key;
	}

	public String getBrd_name() {
		return brd_name;
	}

	public void setBrd_name(String brd_name) {
		this.brd_name = brd_name;
	}

	public String getBrd_mobile_name() {
		return brd_mobile_name;
	}

	public void setBrd_mobile_name(String brd_mobile_name) {
		this.brd_mobile_name = brd_mobile_name;
	}

	public Integer getBrd_order() {
		return brd_order;
	}

	public void setBrd_order(Integer brd_order) {
		this.brd_order = brd_order;
	}

	public Integer getBrd_search() {
		return brd_search;
	}

	public void setBrd_search(Integer brd_search) {
		this.brd_search = brd_search;
	}

	@Override
	public String toString() {
		return "Board [brd_id=" + brd_id + ", bgr_id=" + bgr_id + ", brd_key=" + brd_key + ", brd_name=" + brd_name
				+ ", brd_mobile_name=" + brd_mobile_name + ", brd_order=" + brd_order + ", brd_search=" + brd_search
				+ "]";
	}

	/*
	 * public void addMovies(Movie theMovie) { if(movies ==null) { movies = new
	 * ArrayList<>(); } movies.add(theMovie); theMovie.setBoard(this); }
	 */
	
}
