package com.datesc.rest;

import com.datesc.model.Match;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Services include start a game
 * Created by daiyan on 6/11/14.
 */
@Path("/soccer")
public class FootballMatchService
{
    public FootballMatchService()
    {
        initLog4j();
    }

    @GET
    @Path("/test")
    public Response getMsg()
    {
        String output = "Jersey say : test" ;
        return Response.status(Response.Status.ACCEPTED).entity(output).build();
    }


    @POST
    @Path("/proposal")
    @Produces(MediaType.APPLICATION_JSON)
    public Response proposeMatch(@QueryParam("where") String where,
                                 @QueryParam("startTime") String startTime,
                                 @QueryParam("type") String gameType,
                                 @QueryParam("level") String gameLevel,
                                 @QueryParam("cost") @DefaultValue("-1") double cost)
    {
        try
        {
            // construct a new match
            Match match = new Match();
            // made up the match by the params
            match.setLocation(where);

            // set date
            Date date = new SimpleDateFormat().parse(startTime);
            match.setStartTime(date);
            match.setType(gameType);
            match.setLevel(gameLevel);
            match.setCost(cost);

            // convert to a json string to pass back to the client
            Gson gson = new Gson();
            String jsonStr = gson.toJson(match);

            return Response.status(Response.Status.ACCEPTED).entity(jsonStr).build();
        }
        catch (ParseException e)
        {
            logger.error("error - propose a match", e);
            return Response.status(Response.Status.ACCEPTED).entity(e.getMessage()).build();
        }
    }

    private static void initLog4j()
    {
        try
        {
            Properties props = new Properties();
            props.load(new FileInputStream("log4j.properties"));
            PropertyConfigurator.configure(props);
        }
        catch (IOException e)
        {
            System.out.println("Could not load log4j");
        }

    }

    private static Logger logger = Logger.getLogger(FootballMatchService.class);

}
