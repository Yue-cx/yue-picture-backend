package com.yue.yuepicturebackend.model.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 6117340359083409221L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
