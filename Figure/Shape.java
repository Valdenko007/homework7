package com.goIt.homeWork7.Figure;

public abstract class Shape {
    private String name;
    private String colour;



    protected Shape(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public Shape() {

    }

    public String getName() {

        return name;
    }
    public String getColour() {

        return colour;
    }

    public void parameter() {

    }

}
