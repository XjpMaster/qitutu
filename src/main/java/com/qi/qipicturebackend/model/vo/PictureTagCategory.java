package com.qi.qipicturebackend.model.vo;

import lombok.Data;

import java.util.List;

/*
 * @Description: 标签分类
 */
@Data
public class PictureTagCategory {

    /**
     * 标签列表
     */
    private List<String> tagList;
    /**
     * 分页列表
     */
    private List<String> categoryList;
}
