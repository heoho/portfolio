package kr.ac.dit.Board.persistence;

import java.util.List;

import kr.ac.dit.Board.domain.BoardVO;
import kr.ac.dit.Board.domain.UploadFileVO;

public interface BoardDAO {

	// 게시글 목록
	public List<BoardVO> selectList() throws Exception;

	// 게시글 추가
	public void insert(BoardVO boardVO) throws Exception;

	// 게시글 상세
	public BoardVO select(int no) throws Exception;

	// 게시글 수정
	public void update(BoardVO boardVO) throws Exception;

	// 게시글 삭제
	public void delete(int no) throws Exception;

	// 파일 업로드
	public void insertFile(UploadFileVO uploadFileVO);

	public int selectMaxFileId();

	// DB에서 파일명 가져오기
	public List<UploadFileVO> selectAttachFile(int no);

	// 파일 다운로드
	public UploadFileVO selectDownloadFile(int fileId);
}