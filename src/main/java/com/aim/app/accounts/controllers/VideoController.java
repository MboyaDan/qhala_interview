package com.aim.app.accounts.controllers;

import com.aim.app.accounts.exceptions.ApiResponseException;
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
    @PostMapping("/addVideo")
    public void addNewVideo(@RequestBody Video video){
        videoService.addNewVideo(video);
    }

//    Get all videos
    @GetMapping("/videos")
    public List<Video>getVideos(){

//        return videoService.getVideos();
        throw new ApiResponseException("Oops no videos");
    }

    @GetMapping("/video/{id}")
    public Optional<Video> getVideo(@PathVariable int id){
        return  videoService.getVideo(id);
    }

//    GET video by name
    @GetMapping("/videoName/{video}")
    public Optional<Video> getVideoByName(@PathVariable String video){
        return videoService.getVideoByName(video);

    }

//    DELETE a video
    @DeleteMapping("/delete/{id}")
    public void deleteVideo(@PathVariable int id){
        videoService.deleteVideo(id);
    }

}
