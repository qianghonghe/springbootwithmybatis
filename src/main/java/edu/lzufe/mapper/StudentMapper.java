package edu.lzufe.mapper;

import edu.lzufe.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    int save(Student student);
    int delteById(Integer id);
    int update(Student student);
    String findById(Integer id);
    List<Student> selectByPage(Map<String, Object> map);
    int findMaxCount();

}
