package com.example.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.profile.service.ProfileService;

@RestController
public class ProfileController {

	@Autowired
	ProfileService profileService;
	
	@GetMapping("get-profile")
	public String getProfile() {
		return profileService.getProfile();
	}
}
