package com.goIt.homeWork7.Figure;

public class Circle extends Shape implements GraphicsEditor{

    private static final String name = "Circle";
    protected static String colour  = "Black";

    public Circle() {
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
    public  void parameter() {

        System.out.println(colour);
    }

}
