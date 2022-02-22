package com.goIt.homeWork7;

import com.goIt.homeWork7.Figure.*;

public class figureNameOutput {


    public static void main(String[] args) {
        Shape f1 = new Circle();
        Shape q1 = new Circle();
        System.out.println(f1.getName()+" :");
        q1.parameter();

        System.out.println("---------------");

        Shape f2 = new Diagonal();
        Shape q2 = new Diagonal();
        System.out.println(f2.getName() +" :");
        q2.parameter();

        System.out.println("---------------");

        Shape f3 = new Line();
        Shape q3 = new Line();
        System.out.println(f3.getName()+" :");
        q3.parameter();

        System.out.println("---------------");

        Shape f4 = new Quad();
        Shape q4 = new Quad();
        System.out.println(f4.getName()+" :");
        q4.parameter();

        System.out.println("---------------");

        Shape f5 = new Triangle();
        Shape q5 = new Triangle();
        System.out.println(f5.getName()+" :");
        q5.parameter();

    }
}
