package com.datesc.model;

import java.util.List;

/**
 * Created by Yan on 11/22/2014.
 */
public class Shirt
{
    private List<String> shirt_color;
    private List<String> pants_color;


    public List<String> getShirt_color()
    {
        return shirt_color;
    }

    public void setShirt_color(List<String> shirt_color)
    {
        this.shirt_color = shirt_color;
    }

    public List<String> getPants_color()
    {
        return pants_color;
    }

    public void setPants_color(List<String> pants_color)
    {
        this.pants_color = pants_color;
    }
}
