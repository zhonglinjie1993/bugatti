package com.bugatti.service.impl;

import com.bugatti.dataObject.EditorDto;
import com.bugatti.repository.EditorMapper;
import com.bugatti.service.editorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class editorServiceImpl implements editorService {
    @Autowired
    private EditorMapper editorMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return editorMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(EditorDto record) {
        return editorMapper.insertSelective(record);
    }

    @Override
    public EditorDto selectByPrimaryKey(Integer id) {
        return editorMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EditorDto record) {
        return editorMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<EditorDto> selectByExample(EditorDto record) {
        return editorMapper.selectByExample(record);
    }
}
