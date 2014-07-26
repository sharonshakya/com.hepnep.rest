package com.hepnep.rest.status;

import javax.ws.rs.*; 
import javax.ws.rs.core.MediaType;

/**
 * Thsi is the root path for our restful API service
 * IN the web.xml file, we specified that /api/* need to be the URL to get to this class
 * 
 * We are versioning the class in the URL Path. This is the first version v1. 
 * Example of how to get to this api resource:
 * http://localhost:7001/com.hepnep.rest/api/v1/status
 * 
 * @author sshakya
 *
 */

@Path("/v1/status")
public class V1_status {
	
	private static final String api_version = "00.00.01"; 
	/**
	 * 
	 * @return String 
	 */
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Web Service</p>"; 
	}
	
	/**
	 * This method will return the version number for this API. 
	 * @return String
	 */
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "Version Number:" + "<p>" + api_version + "</p>"; 
	}	
	
}
