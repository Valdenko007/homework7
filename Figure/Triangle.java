package com.goIt.homeWork7.Figure;

public class Triangle extends Shape implements GraphicsEditor{

    private static String name = "Triangle";
    protected static String colour  = "Brown";

    public Triangle() {

        super(name, colour);

    }

    @Override
    public String getColour() {

        return colour;
    }

    @Override
    public String getName() {
        System.out.println("Name:" + name);
        return name;
    }

    @Override
    public void parameter() {
        System.out.println(colour);

    }
}
