package com.goIt.homeWork7.Figure;

public class Line extends Shape implements GraphicsEditor{

    private static String name = "Line";
    protected static String colour  = "Pink";

    public Line() {
        super(name, colour);
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public  String getName() {
        System.out.println("Name:" + name);
        return name;

    }

    @Override
    public void parameter() {
        System.out.println( colour);

    }
}
