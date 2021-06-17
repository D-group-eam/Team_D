package com.seol.webpageHaleMaven.dao;

import java.util.List;

import com.seol.webpageHaleMaven.entity.ItemDetail;

public interface ItemDetailDao {
	void save(ItemDetail itemDetailList);

	List<ItemDetail> findItemDetailById(int itemId);
}
