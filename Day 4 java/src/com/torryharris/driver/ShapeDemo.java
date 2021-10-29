package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(10,20);
        Rectangle rectangle=new Rectangle(10,20);
        triangle.area();
        rectangle.area();
    }
}
