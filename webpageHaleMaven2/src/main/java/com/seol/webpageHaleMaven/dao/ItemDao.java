package com.seol.webpageHaleMaven.dao;

import java.util.List;

import com.seol.webpageHaleMaven.entity.Item;

public interface ItemDao {

	Item findByItemName(String itemName);
	
	void save(Item theItem);

	void deleteItem(int theItemId);
	
	List<Item> getItem();
}
