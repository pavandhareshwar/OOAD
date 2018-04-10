package com.cub.springbootstarter.profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
	
//	@Autowired
	private ProfileRepository profileRepository = new ProfileRepository();
	
	List<Profile> profiles = new ArrayList<> (Arrays.asList(
			new Profile("Alex", "alex@gmail.com", "alex", "1234567890"),
			new Profile("Bob", "bob@gmail.com", "bob", "1234567890")
			));

	public List<Profile> getAllProfiles() {
		List<Profile> profiles = new ArrayList<>();
		profileRepository.findAll().forEach(profiles::add);
		
		return profiles;
	}
	
	public Profile getProfile(String name) {
		return profiles.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst().get();
	}
	
	public void addProfile(Profile profile) {
		//profiles.add(profile);
		profileRepository.save(profile);
	}
	
	public void updateProfile(Profile profile, String name) {
		for (int i = 0; i < profiles.size(); i++) {
			Profile p = profiles.get(i);
			if (p.getName().equalsIgnoreCase(name)) {
				profiles.set(i, profile);
			}
		}
	}
	
	public void deleteProfile(String name) {
		profiles.removeIf(p -> p.getName().equalsIgnoreCase(name)); 
	}
}
