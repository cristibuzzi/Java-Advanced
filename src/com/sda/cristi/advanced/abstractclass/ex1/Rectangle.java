package com.sda.cristi.advanced.abstractclass.ex1;

public class Rectangle extends Shape{
   private double length;
   private double width;
   public Rectangle(double length, double width){
       super(4);
       this.length=length;
       this.width=width;
   }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

