package com.aim.app.accounts.repositories;

import com.aim.app.accounts.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
