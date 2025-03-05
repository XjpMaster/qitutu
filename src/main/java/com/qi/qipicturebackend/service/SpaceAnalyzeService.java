package com.qi.qipicturebackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qi.qipicturebackend.model.dto.space.analyze.*;
import com.qi.qipicturebackend.model.entity.Space;
import com.qi.qipicturebackend.model.entity.User;
import com.qi.qipicturebackend.model.vo.space.analyze.*;
import org.springframework.stereotype.Component;

import java.util.List;
public interface SpaceAnalyzeService extends IService<Space> {
    SpaceUsageAnalyzeResponse getSpaceUsageAnalyze(SpaceUsageAnalyzeRequest spaceUsageAnalyzeRequest,  User loginUser);

    List<SpaceCategoryAnalyzeResponse> getSpaceCategoryAnalyze(SpaceCategoryAnalyzeRequest spaceCategoryAnalyzeRequest, User loginUser);

    List<SpaceTagAnalyzeResponse> getSpaceTagAnalyze(SpaceTagAnalyzeRequest spaceTagAnalyzeRequest, User loginUser);

    List<SpaceSizeAnalyzeResponse> getSpaceSizeAnalyze(SpaceSizeAnalyzeRequest spaceSizeAnalyzeRequest, User loginUser);

    List<SpaceUserAnalyzeResponse> getSpaceUserAnalyze(SpaceUserAnalyzeRequest spaceUserAnalyzeRequest, User loginUser);

    List<Space> getSpaceRankAnalyze(SpaceRankAnalyzeRequest spaceRankAnalyzeRequest, User loginUser);
}
