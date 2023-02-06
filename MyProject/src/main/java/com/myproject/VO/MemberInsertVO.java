package com.myproject.VO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberInsertVO {
	//MemberDto 변수
	private String memberId;
	private String memberPw;
	private String memberName;
	private String memberEmail;
	private String memberTel;
	private String memberPost;
	private String memberBaseAddress;
	private String memberDetailAddress;
	private Date memberBirth;
	private String memberGender;
	private String memberStatus;
	private Long memberPoint;
	private Date memberJoinDate;
	private String memberGoodbye;
	private Date memberGoodbyeDate;
	
	//회원, 첨부파일 연결테이블 추가하기 위한 변수
	private int filesNo;
}
