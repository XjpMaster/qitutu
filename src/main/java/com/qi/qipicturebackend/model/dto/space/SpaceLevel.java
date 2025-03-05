package com.qi.qipicturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description: 空间等级
 */
@Data
@AllArgsConstructor
public class SpaceLevel {

    private int value;

    private String text;

    private long maxCount;

    private long maxSize;
}
