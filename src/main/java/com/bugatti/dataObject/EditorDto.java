package com.bugatti.dataObject;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class EditorDto implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 七牛云图片地址
     */
    private String imgUrl;

    private Date createDate;

    private Date modifyDate;

    /**
     * 文本
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "EditorDto{" +
                "id=" + id +
                ", imgUrl='" + imgUrl + '\'' +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", content='" + content + '\'' +
                '}';
    }
}