package kr.ac.dit.Student.service;

import java.util.List;

import kr.ac.dit.Student.domain.StudentVO;

public interface StudentService {
	public void createStudent(StudentVO studentVO) throws Exception;
	public List<StudentVO> readStudentList() throws Exception;
}