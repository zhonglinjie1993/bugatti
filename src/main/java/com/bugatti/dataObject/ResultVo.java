package com.bugatti.dataObject;

import lombok.Data;

@Data
public class ResultVo {
    /**
     *  返回的结果码【0：成功；1：失败】
     */
    private Integer code=1;
    /**
     * 信息
     */
    private String msg;
    /**
     * 数据
     */
    public Object data;


}
