package com.sda.cristi.advanced.abstractclass.ex1;

/**
 * a. Write an abstract class Shape
 * – Data members: numSides
 * – Constructor: initialize numSides
 * – Concrete method: get method for numSides
 * – Abstract methods: getArea(), getPerimeter()
 * b. Write a concrete subclass Rectangle
 * – Data members: width, height
 * c. Write a concrete subclass Triangle
 * – Data members: width, height
 */
public class Main {
    public static void main(String[] args) {
        Shape shape1=new Triangle(2.3,3.2);
        Shape shape2=new Rectangle(30,15);
        shape1.compareShapesByPerimeter(shape2);
        shape1.compareShapesByArea(shape2);
    }
}
