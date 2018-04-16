package com.bugatti.controller;

import com.bugatti.dataObject.ContentDto;
import com.bugatti.dataObject.ResultVo;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WangEditorController {


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
    public String wangEditor() {
        return "wangEditor";
    }


    @PostMapping("/save")
    //  ResponseBody  和前台ajax 的 返回参数要一致
    @ResponseBody
    public ResultVo save(@RequestBody ContentDto dto) {
        ResultVo vo = new ResultVo();
        if (StringUtils.isNotEmpty(dto.getContent())) {
            vo.setCode(1);
        }
        return vo;
    }


}
