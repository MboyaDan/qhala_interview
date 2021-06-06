package com.aim.app.accounts.services;

import com.aim.app.accounts.models.Video;
import com.aim.app.accounts.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VideoService {
    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    //Get All Videos
    public List<Video>getVideos(){
        return  videoRepository.findAll();
    }

//    Get a video
    public Optional<Video> getVideo(int id){
        return videoRepository.findById(id);
    }
}
