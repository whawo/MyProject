package com.myproject.repository;

import java.util.List;

import com.myproject.entity.MemberDto;
import com.myproject.entity.MemberImgDto;


public interface MemberDao {
	
	//등록
	//회원 등록(비밀번호 암호화 하여 등록)
	void insert(MemberDto memberDto);
	//회원, 첨부파일 연결테이블 등록
	void memberProfileInsert(MemberImgDto memberImgDto);
	
	//로그인
	boolean login(MemberDto memberDto);

	
}
