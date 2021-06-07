package com.aim.app.accounts.services;

import com.aim.app.accounts.models.Video;
import com.aim.app.accounts.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {
    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

//    Add video
    public void addNewVideo(Video video){
        videoRepository.save(video);
    }

    //Get All Videos
    public List<Video>getVideos(){
        return  videoRepository.findAll();
    }


//    Get a video
    public Optional<Video> getVideo(int id){
        return videoRepository.findById(id);
    }

//    GET a video by name
    public Optional<Video> getVideoByName(String video){
        return videoRepository.findVideoByName(video);
    }

//    DELETE video
    public void deleteVideo(int id){
        boolean exists = videoRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException(
                    "Video of " + id +" does not exist"
            );
        }
        videoRepository.deleteById(id);

    }
}
