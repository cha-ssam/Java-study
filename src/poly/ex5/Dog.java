package poly.ex5;

public class Dog implements InterFaceAnimal{ // 인터페이스에서는 implements 를 사용

    @Override
    public void sound() {
        System.out.println("멍 멍");
    }

    @Override
    public void move() {
        System.out.println("이동합니다.");
    }
}
