package com.aim.app.accounts.models;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Video {
    @Id
    @GeneratedValue
    private int id;
    private String videoName;
    private Date releaseDate;
    private String userName;

    public Video() {
        super();
    }

    public Video(int id, String videoName, Date releaseDate, String userName) {
        this.id = id;
        this.videoName = videoName;
        this.releaseDate = releaseDate;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", videoName='" + videoName + '\'' +
                ", releaseDate=" + releaseDate +
                ", userName='" + userName + '\'' +
                '}';
    }
}
