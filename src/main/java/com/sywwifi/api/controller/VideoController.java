package com.sywwifi.api.controller;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.pojo.Video;
import com.sywwifi.api.service.VideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video/")
@Api(value = "测试任务管理", tags = {"视频管理API"}, description = "视频 相关操作")
public class VideoController {

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    /**
     * 创建视频
     *
     * @param video 视屏对象
     * @return 结果
     */
    @PostMapping("create")
    @ApiOperation(value = "通过手机号码登录", notes = "通过手机号码登录", produces = "application/json")
    public ResponseInfo createVideo(Video video) {
        return videoService.create(video);
    }

    /**
     * 更新视频对象
     *
     * @param video 视频对象
     * @return 结果
     */
    @PostMapping("update")
    @ApiOperation(value = "通过手机号码登录", notes = "通过手机号码登录", produces = "application/json")
    public ResponseInfo updateVideo(Video video) {
        return videoService.update(video);
    }

    /**
     * 获取视频对象
     *
     * @param videoId 视频ID
     * @return 结果
     */
    @GetMapping("get")
    @ApiOperation(value = "通过手机号码登录", notes = "通过手机号码登录", produces = "application/json")
    public ResponseInfo getVideo(Integer videoId) {
        return videoService.getById(videoId);
    }

    /**
     * 获取所有使用对象
     *
     * @return 结果
     */
    @GetMapping("getList")
    @ApiOperation(value = "通过手机号码登录", notes = "通过手机号码登录", produces = "application/json")
    public ResponseInfo getListVideo() {
        return videoService.getAll();
    }
}
