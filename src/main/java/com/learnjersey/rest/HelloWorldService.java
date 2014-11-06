package com.learnjersey.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by daiyan on 15/10/14.
 */
@Path("/hello")
public class HelloWorldService
{
    public HelloWorldService()
    {
        super();
        System.out.println("==================>initial?<==================");
    }

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg,
                           @QueryParam("from") String from,
                           @QueryParam("to") String to,
                           @QueryParam("event") String event)
    {
        String output = "Jersey say : " + msg + " from " + from + " to " + to + " doing " + event;
        return Response.status(Response.Status.ACCEPTED).entity(output).build();
    }


}
