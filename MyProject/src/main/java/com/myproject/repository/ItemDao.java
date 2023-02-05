package com.myproject.repository;

import java.util.List;

import com.myproject.entity.ItemDto;


public interface ItemDao {

	
	List<ItemDto> selectList();
}
