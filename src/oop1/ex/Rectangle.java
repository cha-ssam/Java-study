package oop1.ex;

public class Rectangle {

    int width;
    int height;
//    int area = calculateArea();
//    int perimeter = calculatePerimeter();
//    boolean square = isSquare();

    void calculateArea(){
        System.out.println("넓이 :" + width * height);
    }
    void calculatePerimeter(){
        System.out.println("둘레 길이: " + 2 * (width + height));
    }
    void isSquare(){
        System.out.println("정사각형 여부: " + (width == height));
    }
}
