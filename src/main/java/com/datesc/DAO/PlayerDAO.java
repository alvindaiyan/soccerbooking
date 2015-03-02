package com.datesc.DAO;


import com.datesc.model.Player;

/**
 * Created by Yan on 11/22/2014.
 */
public class PlayerDAO
{
    private static PlayerDAO singleton;


    public static PlayerDAO get()
    {
        if(singleton == null)
        {
            singleton = new PlayerDAO();
        }
        return singleton;
    }

    public Player getById(int userid)
    {
        return null;
    }
}
