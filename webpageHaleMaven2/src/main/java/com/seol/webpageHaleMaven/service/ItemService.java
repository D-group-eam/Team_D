package com.seol.webpageHaleMaven.service;

import com.seol.webpageHaleMaven.entity.Item;
import com.seol.webpageHaleMaven.entity.ItemDTO;

public interface ItemService {

	
	void saveItem(Item item,String[] optionNameList, String[] optionPriceList, String userName);

	Item findByItemName(String itemName);
	
	public void deleteItem(int itemId);
}
