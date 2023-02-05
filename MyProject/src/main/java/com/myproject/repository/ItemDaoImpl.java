package com.myproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myproject.entity.ItemDto;
@Repository
public class ItemDaoImpl implements ItemDao {
	
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<ItemDto> selectList() {
		
		
		return sqlSession.selectList("item.list");
	}
	
	

}
