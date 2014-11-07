package com.datesc.DAO;

import com.datesc.model.Match;

import java.util.List;

/**
 * Data Access Object for Match
 * Created by daiyan on 7/11/14.
 */
public class MatchDAO
{
    private static MatchDAO singleton;

    private MatchDAO(){}

    public static MatchDAO get()
    {
        if(singleton == null)
        {
            singleton = new MatchDAO();
        }
        return singleton;
    }

    public static List<Match> getAllMatches()
    {
        // todo: implement the stub
        return null;
    }


    public static void insert(Match match)
    {
        // todo: implement the stub
    }

}
