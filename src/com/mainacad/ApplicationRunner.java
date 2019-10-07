package com.mainacad;

import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;
import com.mainacad.triangle.TriangleV1;

public class ApplicationRunner {

    public static void main(String[] args) {

        Square square = new Square();
        square.setSide(8.0);

        System.out.println(
                "Square with" + " side " + square.getSide() +
                        " with area " + square.getArea());
        Circle cercle = new Circle();
        cercle.setRadius(12);

        System.out.println(
                "Circle with radius " + cercle.getRadius() +
                        " with area " + cercle.getArea());

        Triangle triangle = new Triangle();
        triangle.setLength(8.0);
        triangle.setHeight(10.0);

        //Triangle triangle1 = new Triangle();
       // triangle1.setHeight(6.0);

        System.out.println(
                "Triangle with" + " length " + triangle.getLength() + " height " +  triangle.getHeight() +
                        " with area " + triangle.getArea());

        TriangleV1 triangleV1 = new TriangleV1();
        triangleV1.setA(7.0);
        triangleV1.setB(7.0);
        triangleV1.setC(7.0);

        System.out.println(
                "Triangle with" + " Side of triangle a " + triangleV1.getA() +
                        " Side of triangle b " +  triangleV1.getB() +
                        " Side of triangle c " +  triangleV1.getC() +
                        " with area " + triangleV1.getArea());

    }
}
