package kr.ac.dit.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.dit.Student.domain.StudentVO;
import kr.ac.dit.Student.persistence.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public void createStudent(StudentVO studentVO) throws Exception {
		studentDAO.insertStudent(studentVO);
	}

	@Override
	public List<StudentVO> readStudentList() throws Exception{
		return studentDAO.selectStudentList();
	}
}