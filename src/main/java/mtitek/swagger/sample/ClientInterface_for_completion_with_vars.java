package mtitek.swagger.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("res_path/")
public interface ClientInterface_for_completion_with_vars {

    @GET
    @Path("res_method_path/not_completed_item")
    public Response foo();
}