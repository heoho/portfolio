package kr.ac.dit.Board.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.dit.Board.domain.BoardVO;
import kr.ac.dit.Board.domain.UploadFileVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	SqlSession sqlSession;

	// 게시글 목록
	@Override
	public List<BoardVO> selectList() throws Exception {
		return sqlSession.selectList("BoardMapper.selectList");
	}

	// 게시글 추가
	@Override
	public void insert(BoardVO boardVO) throws Exception {
		sqlSession.insert("BoardMapper.insert", boardVO);
	}

	// 게시글 상세
	@Override
	public BoardVO select(int no) throws Exception {
		return sqlSession.selectOne("BoardMapper.select", no);
	}

	// 게시글 수정
	@Override
	public void update(BoardVO boardVO) throws Exception {
		sqlSession.update("BoardMapper.update", boardVO);
	}

	// 게시글 삭제
	@Override
	public void delete(int no) throws Exception {
		sqlSession.delete("BoardMapper.delete", no);
	}

	// 파일 업로드
	@Override
	public void insertFile(UploadFileVO uploadFileVO) {
		sqlSession.insert("BoardMapper.insertFile", uploadFileVO);
	}

	@Override
	public int selectMaxFileId() {
		return sqlSession.selectOne("BoardMapper.selectMaxFileId");
	}

	// DB에서 파일명 가져오기
	@Override
	public List<UploadFileVO> selectAttachFile(int no) {
		return sqlSession.selectList("BoardMapper.selectAttachFile", no);
	}

	// 파일 다운로드
	@Override
	public UploadFileVO selectDownloadFile(int fileId) {
		return sqlSession.selectOne("BoardMapper.selectDownloadFile", fileId);
	}
}