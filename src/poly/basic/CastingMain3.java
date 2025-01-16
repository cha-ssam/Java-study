package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child; // 업캐스팅이 생략된거임. - 생략하자
        Parent parent2 = child; //  업캐스팅 생략

        parent1.ParentMethod();
        parent2.ParentMethod();

    }

}
