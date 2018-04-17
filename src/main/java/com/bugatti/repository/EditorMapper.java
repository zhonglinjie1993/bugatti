package com.bugatti.repository;

import com.bugatti.dataObject.EditorDto;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EditorMapper {
    int deleteByPrimaryKey(Integer id);


    int insertSelective(EditorDto record);

    EditorDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EditorDto record);

    List<EditorDto> selectByExample(EditorDto record);

}