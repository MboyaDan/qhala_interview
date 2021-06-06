package com.aim.app.accounts.repositories;

import com.aim.app.accounts.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

    @Query("SELECT s FROM Video s WHERE s.videoName = ?1")
    Optional<Video> findVideoByName(String videoName);
}
