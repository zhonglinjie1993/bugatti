package com.bugatti.controller;

import com.bugatti.dataObject.ContentDto;
import com.bugatti.dataObject.EditorDto;
import com.bugatti.dataObject.ResultVo;
import com.bugatti.service.EditorService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class WangEditorController {


    @Autowired
    private EditorService editorService;


    /**
     * 测试页面
     */
    @GetMapping("/toPage")

    public String toPage() {
        return "index";
    }

    /**
     * 富文本编辑器页面
     */
    @GetMapping("/wangEditor")
    @ApiOperation(value="富文本编辑器页面", notes="富文本编辑器页面aaaaaa")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    public String wangEditor() {
        return "wangEditor";
    }


    @PostMapping("/save")
    //  ResponseBody  和前台ajax 的 返回参数要一致
    @ApiOperation(value="富文本编辑器页面", notes="富文本编辑器页面aaaaaa")
    @ApiImplicitParam(name = "dto", value = "EditorDto", required = true, dataType = "EditorDto")
    public ResultVo save(@RequestBody EditorDto dto) {
        ResultVo vo = new ResultVo();


        int i = editorService.insertSelective(dto);
        if (i > 0) {
            vo.setCode(0);
        }

        return vo;
    }


}
