package com.yue.yuepicturebackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yue.yuepicturebackend.model.entity.User;
import com.yue.yuepicturebackend.service.UserService;
import com.yue.yuepicturebackend.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 32428
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2026-01-26 15:24:20
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




