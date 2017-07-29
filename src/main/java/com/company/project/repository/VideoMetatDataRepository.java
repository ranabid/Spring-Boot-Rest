package com.company.project.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.project.entity.VideoMetaData;

public interface VideoMetatDataRepository extends JpaRepository<VideoMetaData, Integer>{
	Collection<VideoMetaData> findById(Integer id);
}
