package com.formacionbdi.springboot.app.item.models.services;

import java.util.List;

import com.formacionbdi.springboot.app.item.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById (Long id, Integer cantidad);
}
