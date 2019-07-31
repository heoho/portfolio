package kr.ac.dit.Member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.dit.Member.domain.LogonDTO;
import kr.ac.dit.Member.domain.MemberVO;
import kr.ac.dit.Member.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;

	// 회원 가입
	@Override
	public void createMember(MemberVO memberVO) throws Exception {
		memberDAO.insert(memberVO);
	}

	// 로그인
	@Override
	public MemberVO loginMember(LogonDTO logonDTO) throws Exception {
		return memberDAO.select(logonDTO);
	}

	// 회원 상세
	@Override
	public MemberVO readMember(int id) throws Exception {
		return memberDAO.select(id);
	}

	// 회원 수정
	@Override
	public void updateMember(MemberVO memberVO) throws Exception {
		memberDAO.update(memberVO);
	}

	// 회원 삭제
	@Override
	public void deleteMember(int id) throws Exception {
		memberDAO.delete(id);
	}
}