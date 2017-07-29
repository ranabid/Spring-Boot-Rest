package com.company.project;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.project.entity.VideoMetaData;
import com.company.project.repository.GroupApplicationMappingRepository;
import com.company.project.repository.VideoMetatDataRepository;

@RestController
@RequestMapping("/superAdminService")
public class SuperAdminController {
	private final VideoMetatDataRepository videoMetatDataRepo;
	private final GroupApplicationMappingRepository groupApplicationMappingRepo;

	@Autowired
	public SuperAdminController(VideoMetatDataRepository videoMetatDataRepository,
			GroupApplicationMappingRepository grouApplicationMappingRepo) {
		this.videoMetatDataRepo = videoMetatDataRepository;
		this.groupApplicationMappingRepo = grouApplicationMappingRepo;

	}
	
	@RequestMapping("/test")
	public String testResponse() {
		System.out.println("Ok");
		return "success";
	}
	
	@RequestMapping(path="/{videoId}/", method = RequestMethod.GET)
	public Collection<VideoMetaData> getVideoMetaData(@PathVariable String videoId) {
		// test user
		String userId = "101";
		System.out.println();
		try {

			this.validateUser(userId);
			return this.videoMetatDataRepo.findById(Integer.parseInt(videoId));

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			return null;
		}
	}

	public void validateUser(String userId) throws Exception {
		if (!userId.equals("101")) {
			throw new Exception("Unauthorize access");
		}

	}

}
