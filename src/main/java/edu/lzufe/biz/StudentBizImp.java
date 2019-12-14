package edu.lzufe.biz;

import edu.lzufe.mapper.ClassInfoMapper;
import edu.lzufe.mapper.StudentMapper;
import edu.lzufe.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class StudentBizImp implements IStudentBiz {
    @Autowired private StudentMapper studentMapper;
    @Autowired private ClassInfoMapper classInfoMapper;
    @Override
    public int save(Student student) {
        return studentMapper.save(student);
    }

    @Override
    public int delteById(Integer id) {
        return studentMapper.delteById(id);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public String findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public List<Student> selectByPage(Map<String, Object> map) {
        return studentMapper.selectByPage(map);
    }

    @Override
    public int findMaxCount() {
        return studentMapper.findMaxCount();
    }
}
