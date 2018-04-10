package com.cub.springbootstarter.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileControllerNew {
	
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/profiles")
	public List<Profile> getProfile() {
		return profileService.getAllProfiles();
	}
	
	@RequestMapping("/profiles/{name}")
	public Profile getProfile(@PathVariable String name) {
		return profileService.getProfile(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/profiles")
	public void addProfile(@RequestBody Profile profile) {
		profileService.addProfile(profile);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/profiles/{name}")
	public void updateProfile(@RequestBody Profile profile, @PathVariable String name) {
		profileService.updateProfile(profile, name);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/profiles/{name}")
	public void deleteProfile(@PathVariable String name) {
		profileService.deleteProfile(name);
	}
}
