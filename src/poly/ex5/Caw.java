package poly.ex5;

public class Caw implements InterFaceAnimal{

    @Override
    public void sound() {
        System.out.println("음 메");
    }

    @Override
    public void move() {
        System.out.println("이동합니다");
    }
}
