package kr.ac.dit.Member.service;

import kr.ac.dit.Member.domain.LogonDTO;
import kr.ac.dit.Member.domain.MemberVO;

public interface MemberService {

	// 회원가입
	public void createMember(MemberVO memberVO) throws Exception;

	// 로그인
	public MemberVO loginMember(LogonDTO logonDTO) throws Exception;

	// 게시글 상세
	public MemberVO readMember(int id) throws Exception;

	// 게시글 수정
	public void updateMember(MemberVO memberVO) throws Exception;

	// 게시글 삭제
	public void deleteMember(int id) throws Exception;

}