package com.aim.app.accounts.controllers;

import com.aim.app.accounts.models.Video;
import com.aim.app.accounts.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class VideoController {
    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }
//    Add video
    @PostMapping("/addBook")
    public void addNewVideo(@RequestBody Video video){
        videoService.addNewVideo(video);
    }

//    Get all videos
    @GetMapping("/videos")
    public List<Video>getVideos(){
        return videoService.getVideos();
    }

//    GET a video
    @GetMapping("/video/{id}")
    public Optional<Video> getVideo(@PathVariable int id){
        return  videoService.getVideo(id);
    }
}
