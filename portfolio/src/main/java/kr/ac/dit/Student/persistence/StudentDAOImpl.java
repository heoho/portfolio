package kr.ac.dit.Student.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.dit.Student.domain.StudentVO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	 @Autowired
	 SqlSession sqlSession;
	 @Override
	 public void insertStudent(StudentVO studentVO) throws Exception {
	  sqlSession.insert("StudentMapper.insertStudent", studentVO);
	 }
	 @Override
	 public List<StudentVO> selectStudentList() throws Exception {
	  return sqlSession.selectList("StudentMapper.selectStudentList");
	 }
	}