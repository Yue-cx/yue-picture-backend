package com.yue.yuepicturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 空间等级类，用于表示存储空间的等级信息
 */
@Data
@AllArgsConstructor
public class SpaceLevel {

    private int value;      // 等级值，用于标识空间等级的数值

    private String text;    // 等级描述文本，用于展示空间等级的名称或描述

    private long maxCount;  // 该等级下允许的最大数量限制

    private long maxSize;   // 该等级下允许的最大存储空间大小限制
}