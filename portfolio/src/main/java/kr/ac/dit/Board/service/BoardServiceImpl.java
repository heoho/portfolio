package kr.ac.dit.Board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.dit.Board.domain.BoardVO;
import kr.ac.dit.Board.domain.UploadFileVO;
import kr.ac.dit.Board.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;

	// 게시글 목록
	@Override
	public List<BoardVO> listArticle() throws Exception {
		return boardDAO.selectList();
	}

	// 게시글 추가
	@Override
	public void createArticle(BoardVO boardVO) throws Exception {
		boardDAO.insert(boardVO);
	}

	// 게시글 상세
	@Override
	public BoardVO readArticle(int no) throws Exception {
		return boardDAO.select(no);
	}

	// 게시글 수정
	@Override
	public void updateArticle(BoardVO boardVO) throws Exception {
		boardDAO.update(boardVO);
	}

	// 게시글 삭제
	@Override
	public void deleteArticle(int no) throws Exception {
		boardDAO.delete(no);
	}

	// 파일 업로드
	@Override
	public void uploadFile(UploadFileVO uploadFileVO) {
		uploadFileVO.setFileId(boardDAO.selectMaxFileId() + 1);
		boardDAO.insertFile(uploadFileVO);
	}

	// DB에서 파일명 가져오기
	@Override
	public List<UploadFileVO> readAttachFile(int no) {
		return boardDAO.selectAttachFile(no);
	}

	// 게시글 다운로드
	@Override
	public UploadFileVO downloadFile(int fileId) {
		return boardDAO.selectDownloadFile(fileId);
	}
}