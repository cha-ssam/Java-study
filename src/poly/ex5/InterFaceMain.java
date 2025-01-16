package poly.ex5;

public class InterFaceMain {

    public static void main(String[] args) {
        // 인터페이스 생성 불가

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();
        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }
    private static void soundAnimal (InterFaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    private static void moveAnimal (InterFaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.sound();
        System.out.println("동물 이동 테스트 종료");
    }
}
