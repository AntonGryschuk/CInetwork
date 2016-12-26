package com.antongryschuk.cinetworkapi.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.antongryschuk.cinetworkapi.model.Profile;
import com.antongryschuk.cinetworkapi.service.ProfileService;

@Path("/profiles")
public class ProfileResource {
	
	private  ProfileService profileService = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProfiles(){	
		return profileService.getProfiles();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addProfile(final Profile profile){
		return null;
	}
	
}
