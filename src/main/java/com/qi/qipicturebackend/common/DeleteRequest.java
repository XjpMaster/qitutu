package com.qi.qipicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/*
 * @Description: 删除请求封装类
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
