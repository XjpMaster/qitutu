package com.qi.qipicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qi.qipicturebackend.model.dto.space.SpaceAddRequest;
import com.qi.qipicturebackend.model.dto.space.SpaceQueryRequest;
import com.qi.qipicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qi.qipicturebackend.model.entity.User;
import com.qi.qipicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author Mr.Xiao
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-02-16 15:04:39
*/
public interface SpaceService extends IService<Space> {


    /**
     * 创建空间
     * @param spaceAddRequest
     * @param loginUser
     * @return
     */
    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);
    /**
     * 验证空间信息
     * @param space
     * @param add
     * @return
     */
    void validSpace(Space space, boolean add);

    /**
     * 获取空间视图
     * @param space
     * @param request
     * @return
     */
    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    /**
     * 获取空间视图分页
     * @param spacePage
     * @param request
     * @return
     */
    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    /**
     * 获取查询条件
     * @param spaceQueryRequest
     * @return
     */
    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    /**
     * 填充空间等级
     * @param space
     */
    void fillSpaceBySpaceLevel(Space space);

    void checkSpaceAuth(User loginUser, Space space);
}
