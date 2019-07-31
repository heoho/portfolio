package kr.ac.dit.Member.persistence;

import kr.ac.dit.Member.domain.LogonDTO;
import kr.ac.dit.Member.domain.MemberVO;

public interface MemberDAO {

	// 회원 가입
	public void insert(MemberVO memberVO) throws Exception;

	// 로그인
	public MemberVO select(LogonDTO logonDTO) throws Exception;

	// 회원 상세
	public MemberVO select(int id) throws Exception;

	// 회원 수정
	public void update(MemberVO memberVO) throws Exception;

	// 회원 삭제
	public void delete(int id) throws Exception;

}