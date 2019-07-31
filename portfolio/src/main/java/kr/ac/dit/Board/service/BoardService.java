package kr.ac.dit.Board.service;

import java.util.List;

import kr.ac.dit.Board.domain.BoardVO;
import kr.ac.dit.Board.domain.UploadFileVO;

public interface BoardService {

	// 게시글 목록
	public List<BoardVO> listArticle() throws Exception;

	// 게시글 추가
	public void createArticle(BoardVO boardVO) throws Exception;

	// 게시글 상세
	public BoardVO readArticle(int no) throws Exception;

	// 게시글 수정
	public void updateArticle(BoardVO boardVO) throws Exception;

	// 게시글 삭제
	public void deleteArticle(int no) throws Exception;

	// 파일업로드
	public void uploadFile(UploadFileVO uploadFileVO);

	// DB에서 파일명 가져오기
	public List<UploadFileVO> readAttachFile(int no);

	// 파일 다운로드
	public UploadFileVO downloadFile(int fileId);

}