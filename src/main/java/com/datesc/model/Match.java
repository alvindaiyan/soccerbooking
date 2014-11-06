package com.datesc.model;

import java.util.Date;

/**
 * Todo: type, level should be enum rather than String
 * Todo: level should be enum
 * Created by daiyan on 6/11/14.
 */
public class Match
{
    private String location;
    private Date startTime;
    private String type;
    private String level;
    private double cost;


    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
}
