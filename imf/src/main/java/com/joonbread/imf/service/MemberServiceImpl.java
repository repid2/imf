package com.joonbread.imf.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joonbread.imf.repository.MemberDAO;
import com.joonbread.imf.repository.MemberDTO;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO memberDAO;

	@Override
	public List<MemberDTO> memberList() {
		
		return memberDAO.view();
	}
	
	
	
}
