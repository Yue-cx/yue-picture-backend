package com.yue.yuepicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * 用户角色枚举
 */
@Getter
public enum UserRoleEnum {

    USER("用户", "user"),
    ADMIN("管理员", "admin");

    private final String text;

    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

/**
 * 根据值获取对应的枚举实例
 * @param value 要匹配的值
 * @return 如果找到匹配的枚举实例则返回，否则返回null
 */
    public static UserRoleEnum getEnumByValue(String value) {
        // 如果传入的值为空，直接返回null
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        // 遍历所有的枚举实例
        for (UserRoleEnum userRoleEnum : UserRoleEnum.values()) {
            // 检查当前枚举实例的值是否与传入的值相等
            if (userRoleEnum.getValue().equals(value)) {
                // 如果找到匹配的枚举实例，立即返回
                return userRoleEnum;
            }
        }
        // 如果遍历完所有枚举实例都没有找到匹配项，返回null
        return null;
    }
}
