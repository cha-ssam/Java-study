package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {

        Parent poly = new Child();
        // 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 다운 캐스팅 ( 부모 타입 -> 자식 타입)

        Child child = (Child) poly; // poly를 강제로 형변환해서 호출 할 수 있음
        child.childMethod();

        // 일시적 다운캐스팅
        ((Child) poly).childMethod();
    }
}
