package com.example.profile.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.example.profile.service.ProfileService;

@Service
@Profile(value = "prod")
@PropertySource("classpath:application.properties")
public class ProdServiceImpl implements ProfileService {

	@Value( "${env.value}")
	private String env;
	
	@Override
	public String getProfile() {
		// TODO Auto-generated method stub
		return env;
	}

}
