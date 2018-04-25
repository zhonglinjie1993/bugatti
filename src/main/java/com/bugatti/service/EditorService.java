package com.bugatti.service;

import com.bugatti.dataObject.EditorDto;

import org.springframework.stereotype.Service;

import java.util.List;


public interface EditorService {

    int deleteByPrimaryKey(Integer id);


    int insertSelective(EditorDto record);

    EditorDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EditorDto record);

    List<EditorDto> selectByExample(EditorDto record);
}
