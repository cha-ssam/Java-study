package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조

        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.ParentMethod();


        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.ParentMethod();
        child.childMethod();

        // 부모 변수가 자식인스턴스 참조 (다형적 참조)

        System.out.println("Parent -> Child");
        Parent poly = new Child();  //  부모 타입은 자식을 참조 할 수 있다.(반대는 안됨)
        poly.ParentMethod();

        // Child child1 = new Parent(); // 자식은 부모를 담을 수 없다.

        poly.ParentMethod(); // poly는 ChildMethod는 호출 할 수 없다. - 다형적 참조

        // poly.childMethod();


    }
}
