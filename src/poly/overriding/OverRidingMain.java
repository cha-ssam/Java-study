package poly.overriding;

public class OverRidingMain {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조 -> 다형적 참조라고 한다.
        Parent poly = new Child();
        System.out.println("poly -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩이 X
        poly.method(); // 메서드는 오버라이딩이 됨
    }
}
