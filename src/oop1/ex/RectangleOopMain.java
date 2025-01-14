package oop1.ex;

import javax.net.ssl.HostnameVerifier;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 8;
        rectangle.height = 5;
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
}
