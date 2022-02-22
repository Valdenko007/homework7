package com.goIt.homeWork7.Figure;

public class Quad extends Shape implements GraphicsEditor{

    private static String name = "Quad";
    protected static String colour  = "Blue";

    public Quad() {
        super(name, colour);
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public  String getName() {
        return name;
    }

    @Override
    public void parameter() {
        System.out.println( colour);

    }
}
