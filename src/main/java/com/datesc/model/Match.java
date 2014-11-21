package com.datesc.model;

import java.util.Date;
import java.util.List;

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

    private List<Player> hostTeam;
    private List<Player> guestTeam;
    private List<Referee>  referees;

    private boolean finished_setup = false;


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

    public List<Player> getHostTeam()
    {
        return hostTeam;
    }

    public void setHostTeam(List<Player> hostTeam)
    {
        this.hostTeam = hostTeam;
    }

    public List<Player> getGuestTeam()
    {
        return guestTeam;
    }

    public void setGuestTeam(List<Player> guestTeam)
    {
        this.guestTeam = guestTeam;
    }

    public List<Referee> getReferees()
    {
        return referees;
    }

    public void setReferees(List<Referee> referees)
    {
        this.referees = referees;
    }


    // TODO need check whether the game has enough people to play
    // TODO check whether others requirements are reached
    public boolean isFinished_setup()
    {
        return true;
    }
}
