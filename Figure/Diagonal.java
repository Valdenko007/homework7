package com.goIt.homeWork7.Figure;

public class Diagonal extends Shape implements GraphicsEditor{

    private static String name = "Diagonal";
    protected static String colour  = "Yellow";

    public Diagonal() {
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
        System.out.println(colour);
    }
}
