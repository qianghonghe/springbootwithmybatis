package edu.lzufe.biz;

import edu.lzufe.mapper.ClassInfoMapper;
import edu.lzufe.model.ClassInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassInfoBizImp implements IClassInfoBiz {

    @Autowired
    private ClassInfoMapper classInfoMapper;
    @Override
    public ClassInfo findAll() {
        return classInfoMapper.findAll();
    }
}
