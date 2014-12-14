package com.datesc.rest;

import com.datesc.model.Match;
import com.datesc.DAO.MatchDAO;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * Services include start a game
 * Created by daiyan on 6/11/14.
 */
@Path("/soccer")
public class FootballMatchService
{

    @GET
    @Path("/browse")
    @Produces(MediaType.APPLICATION_JSON)
    public  Response getAllMatch()
    {
        // todo need a filter method
        List<Match> matchList = MatchDAO.get().getAllMatches();
        String result = convert2JsonStr(matchList);
        return  Response.status(Response.Status.ACCEPTED).entity(result).build();
    }


    @POST
    @Path("/proposal")
    @Produces(MediaType.APPLICATION_JSON)
    public Response proposeMatch(@FormParam("where") String where,
                                 @FormParam("startTime") String startTime,
                                 @FormParam("type") String gameType,
                                 @FormParam("level") String gameLevel,
                                 @FormParam("cost") @DefaultValue("-1") double cost)
    {
        try
        {
            // construct a new match
            Match match = new Match();
            // made up the match by the params
            match.setLocation(where);
            // set date
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(startTime);
            match.setStartTime(date);
            match.setType(gameType);
            match.setLevel(gameLevel);
            match.setCost(cost);

            // convert to a json string to pass back to the client
            String jsonStr = convert2JsonStr(match);

            // todo save to db
            MatchDAO.insert(match);
            
            return Response.status(Response.Status.OK).entity(jsonStr).build();
        }
        catch (Exception e)
        {   String err = getJsonErrMsg(e);
            return Response.status(Response.Status.ACCEPTED).entity(err).build();
        }
    }


    // ==========================================================================
    // some util functions
    // ==========================================================================
    private static String getJsonErrMsg(Exception e)
    {
        if(e == null) throw new NullPointerException("error - getJsonErrMsg");
        return "{\"error\", \"" + e.getMessage() + "\"}";
    }


    private static String convert2JsonStr(Object obj)
    {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }

}
