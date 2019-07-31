package kr.ac.dit.Student.persistence;

import java.util.List;

import kr.ac.dit.Student.domain.StudentVO;

public interface StudentDAO {
	public void insertStudent(StudentVO studentVO) throws Exception;
	public List<StudentVO> selectStudentList() throws Exception;
}
