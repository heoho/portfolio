package kr.ac.dit.Member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.dit.Member.domain.LogonDTO;
import kr.ac.dit.Member.domain.MemberVO;
import kr.ac.dit.Member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;

	// 회원가입 페이지
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public void createGET() throws Exception {
	}

	// 회원가입
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPOST(MemberVO memberVO) throws Exception {
		memberService.createMember(memberVO);
		return "redirect:/board/list";
	}

	// 로그인 페이지
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("logonDTO") LogonDTO logonDTO) {
	}

	// 로그인
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void loginPOST(LogonDTO logonDTO, HttpSession httpSession, Model model) throws Exception {
		MemberVO memberVO = memberService.loginMember(logonDTO);
		if (memberVO == null) {
			return;
		}
		model.addAttribute("memberVO", memberVO);
	}

	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public void logout(HttpSession httpSession) {
		if (httpSession.getAttribute("login") != null) {
			httpSession.removeAttribute("login");
			httpSession.invalidate();
		}
	}

	// 회원 상세 페이지
	@RequestMapping("/read")
	public void readGET(@RequestParam("id") int id, Model model) throws Exception {
		model.addAttribute("memberVO", memberService.readMember(id));
	}

	// 회원 수정 페이지
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void updateGET(@RequestParam("id") int id, Model model) throws Exception {
		model.addAttribute(memberService.readMember(id));
	}

	// 회원 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updatePOST(MemberVO memberVO) throws Exception {
		memberService.updateMember(memberVO);
		return "redirect:/member/read";
	}

	// 회원 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteGET(@RequestParam("id") int id) throws Exception {
		memberService.deleteMember(id);
		return "redirect:/board/list";
	}
}