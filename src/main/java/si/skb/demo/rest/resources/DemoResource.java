package si.skb.demo.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import si.skb.demo.models.MultiplyResultHolder;

@Path("/demo")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class DemoResource {

    /**
     * Sample GET request. Multiplies two numbers and returnes a response with 200 HTTP status
     * @param first
     * @param second
     * @return
     */
    @GET
    @Path("/multiply/{first}/{second}")
    public Response multiply(@PathParam("first") int first, @PathParam("second") int second) {
        return Response.ok(new MultiplyResultHolder(first, second, first * second)).build();
    }

    /**
     * Sample POST request. Same as /multiply/{first}/{second} but factors are set in a body.
     * @param holder
     * @return
     */
    @POST
    @Path("/multiply")
    public Response multiplyPost(MultiplyResultHolder holder) {
        return Response.ok(new MultiplyResultHolder(holder.getFirst(), holder.getSecond(), holder.getFirst() * holder.getSecond())).build();
    }
}
