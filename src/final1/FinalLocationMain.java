package final1;

public class FinalLocationMain {

    public static void main(String[] args) {
        // final 지역변수

        final int data1;
        data1 = 10; // 최초 한번만 값을 집어넣을 수 있다.
        final int data2 = 10;
        method(10);
    }

    static void method(final int parameter){
        // final을 매개변수로 넣으면 값을바꿀 수 없움.
    }
}
