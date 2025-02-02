package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.ParentMethod(); // 여기서 Child가 들어가있었다면 오버라이딩 돼서 호출한다고 볼 수 있을까
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음.");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
