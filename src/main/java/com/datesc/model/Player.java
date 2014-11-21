package com.datesc.model;

/**
 * TODO: create a abstract class for all human player
 * Created by Yan on 11/22/2014.
 */
public class Player
{
    private String name;
    private int exp;
    private int level;
    private float lon; // frequent place
    private float lat; // frequent place

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getExp()
    {
        return exp;
    }

    public void setExp(int exp)
    {
        this.exp = exp;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public float getLon()
    {
        return lon;
    }

    public void setLon(float lon)
    {
        this.lon = lon;
    }

    public float getLat()
    {
        return lat;
    }

    public void setLat(float lat)
    {
        this.lat = lat;
    }
}
