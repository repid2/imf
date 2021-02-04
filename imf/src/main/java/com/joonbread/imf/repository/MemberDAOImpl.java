package com.joonbread.imf.repository;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	private static final Logger logger=
			LoggerFactory.getLogger(MemberDAOImpl.class);
    //SqlSession 객체를 개발자가 직접 생성하지 않고 스프링에서 연결시켜 줌
   
	@Inject //의존관계 주입
    SqlSession sqlSession;
	
	private static final String namespace = "com.joonbread.imf.repository.MemberDTO.";
	@Override
	public List<MemberDTO> view() {
		logger.info("회원리스트 출력");
		List<MemberDTO> list = sqlSession.selectList(namespace+"memberList");
		return list;
	}

	
	
}
