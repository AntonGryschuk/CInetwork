package com.antongryschuk.cinetworkapi.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import com.antongryschuk.cinetworkapi.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = new HashMap<>();
	
	public ProfileService(){
		profiles.put("Martha", new Profile(0L, "Martha", "Melekh"));
	}
	
	public Response getProfiles() {	
		return Response.status(200).entity(profiles).build();
	}
}
