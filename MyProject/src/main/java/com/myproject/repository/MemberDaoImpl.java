package com.myproject.repository;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.myproject.entity.MemberDto;
import com.myproject.entity.MemberImgDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private PasswordEncoder encoder;
	
	//회원 등록
	@Override
	public void insert(MemberDto memberDto) {
		String memberPw = memberDto.getMemberPw();
		String encode = encoder.encode(memberPw);
		memberDto.setMemberPw(encode);
		sqlSession.insert("member.insert", memberDto);
	}
	
	//회원 프로필 등록
	@Override
	public void memberProfileInsert(MemberImgDto memberImgDto) {
		sqlSession.insert("member.profileInsert", memberImgDto);
	}
	
	//로그인
	@Override
	public boolean login(MemberDto memberDto) {
		MemberDto findDto = sqlSession.selectOne("member.one", memberDto);
		if(findDto == null) return false;
		boolean match = encoder.matches(memberDto.getMemberPw(), findDto.getMemberPw());
		return match;
	}
	
     

}






