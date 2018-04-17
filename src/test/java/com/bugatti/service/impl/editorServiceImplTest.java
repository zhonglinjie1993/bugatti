package com.bugatti.service.impl;

import com.bugatti.dataObject.EditorDto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class editorServiceImplTest {


    @Autowired
    private editorServiceImpl editorService;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insertSelective() {
        EditorDto editorDto = new EditorDto();
        editorDto.setContent("231312312");
        int i = editorService.insertSelective(editorDto);
        System.out.println(i);

    }

    @Test
    public void selectByPrimaryKey() {
        EditorDto editorDto = editorService.selectByPrimaryKey(1);
        System.out.println(editorDto);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }


    @Test
    public void selectByExample() {
        EditorDto editorDto = new EditorDto();
        editorDto.setContent("2");
        List<EditorDto> editorDtos = editorService.selectByExample(editorDto);
        System.out.println(editorDtos);
    }

}