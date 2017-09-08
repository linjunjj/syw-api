package com.sywwifi.api.service.impl;

import com.sywwifi.api.commons.ResponseInfo;
import com.sywwifi.api.dao.VideoMapper;
import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.pojo.Video;
import com.sywwifi.api.pojo.VideoExample;
import com.sywwifi.api.service.VideoService;
import com.sywwifi.api.util.ServerResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    private final VideoMapper videoMapper;

    @Autowired
    public VideoServiceImpl(VideoMapper videoMapper) {
        this.videoMapper = videoMapper;
    }

    @Override
    public ResponseInfo<Video> create(Video video) {
        int result = videoMapper.insertSelective(video);
        return ServerResponseUtil.getResponseInfo(video, result);
    }

    @Override
    public ResponseInfo delete(Integer videoId) {
        Video video = videoMapper.selectByPrimaryKey(videoId);
        int result = videoMapper.deleteByPrimaryKey(videoId);
        return ServerResponseUtil.getResponseInfo(video, result);
    }

    @Override
    public ResponseInfo<Video> update(Video video) {
        int result = videoMapper.updateByPrimaryKeySelective(video);
        return ServerResponseUtil.getResponseInfo(video, result);
    }

    @Override
    public ResponseInfo<Video> getById(Integer videoId) {
        Video video = videoMapper.selectByPrimaryKey(videoId);
        return ServerResponseUtil.getResponseInfo(video);
    }

    @Override
    public ResponseInfo<List<Video>> getAll() {
        List<Video> videoList = videoMapper.selectByExample(new VideoExample());
        return ServerResponseUtil.getResponseInfo(videoList, videoList.size());
    }
}
