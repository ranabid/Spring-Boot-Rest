package com.company.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.company.project.entity.GroupApplicationMapping;
import com.company.project.entity.VideoMetaData;
import com.company.project.repository.GroupApplicationMappingRepository;
import com.company.project.repository.VideoMetatDataRepository;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

	@Bean
	public VideoMetaData initVideoMetaDataRepo(VideoMetatDataRepository videoRepo) {
		VideoMetaData obj = videoRepo.save(new VideoMetaData("Group", "CCTech"));

		return obj;
	}

	@Bean
	public GroupApplicationMapping initGroupAppMapRepo(GroupApplicationMappingRepository grpAppRepo) {
		GroupApplicationMapping obj = grpAppRepo.save(new GroupApplicationMapping());
		return obj;
	}

}
