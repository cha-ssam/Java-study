package poly.ex5;

public class Cat implements InterFaceAnimal{

    @Override
    public void sound() {
        System.out.println("냐 옹");
    }

    @Override
    public void move() {
        System.out.println("이동합니다.");
    }
}
