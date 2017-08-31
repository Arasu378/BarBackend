package com.arasu;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/insertEmailMangement")
public class InsertEmailManagementAPI {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public InsertEmailManagementRespones insertemail(InsertEmailManagementModel model){
		return InsertEmailManagementClass.insertemail(model);
	}

}
