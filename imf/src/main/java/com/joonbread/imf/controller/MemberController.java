package com.joonbread.imf.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joonbread.imf.repository.MemberDTO;
import com.joonbread.imf.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	
	private static final Logger logger=
            LoggerFactory.getLogger(MemberController.class);
    
    @Inject // MemberService 객체가 주입됨
    MemberService memberService;

	@RequestMapping("/list.do")
	public String view(Model model) {
		List<MemberDTO> list = memberService.memberList();
		
		logger.info(list.toString());
		
		model.addAttribute("list",list);
		
		return "member/list";
	}
	
}
