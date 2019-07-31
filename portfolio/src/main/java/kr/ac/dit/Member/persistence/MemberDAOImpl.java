package kr.ac.dit.Member.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.dit.Member.domain.LogonDTO;
import kr.ac.dit.Member.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession sqlSession;

	// 회원 가입
	@Override
	public void insert(MemberVO memberVO) throws Exception {
		sqlSession.insert("MemberMapper.insert", memberVO);
	}

	// 로그인
	@Override
	public MemberVO select(LogonDTO logonDTO) throws Exception {
		return sqlSession.selectOne("MemberMapper.select", logonDTO);
	}

	// 회원 상세
	@Override
	public MemberVO select(int id) throws Exception {
		return sqlSession.selectOne("MemberMapper.select", id);
	}

	// 회원 수정
	@Override
	public void update(MemberVO memberVO) throws Exception {
		sqlSession.update("MemberMapper.update", memberVO);
	}

	// 회원 삭제
	@Override
	public void delete(int id) throws Exception {
		sqlSession.delete("MemberMapper.delete", id);
	}
}