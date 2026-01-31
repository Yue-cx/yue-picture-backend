package com.yue.yuepicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yue.yuepicturebackend.model.dto.space.SpaceAddRequest;
import com.yue.yuepicturebackend.model.dto.space.SpaceQueryRequest;
import com.yue.yuepicturebackend.model.entity.Picture;
import com.yue.yuepicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yue.yuepicturebackend.model.entity.User;
import com.yue.yuepicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author yue
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2026-01-30 20:41:34
*/
public interface SpaceService extends IService<Space> {

    /**
     * 验证空间信息的有效性
     * @param space 空间对象
     * @param add 是否为创建时校验
     */
    void validSpace(Space space, boolean add);

    /**
     * 根据空间级别填充空间信息
     * @param space 空间对象
     */
    void fillSpaceBySpaceLevel(Space space);

    /**
     * 添加空间
     * @param spaceAddRequest 添加请求
     * @param loginUser 登录用户
     * @return 新增空间 id
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    /**
     * 获取查询条件
     * @param spaceQueryRequest 查询请求
     * @return 查询条件
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 获取空间视图对象
     * @param space 空间对象
     * @param request 请求
     * @return 空间视图对象
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间视图对象分页
     * @param spacePage 空间分页
     * @param request 请求
     * @return 空间视图对象分页
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 检查空间权限
     * @param loginUser
     * @param space
     */
    void checkSpaceAuth(User loginUser, Space space);
}
