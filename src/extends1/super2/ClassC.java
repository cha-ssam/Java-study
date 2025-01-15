package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10,20); // 기본생성자는 생성자가 하나도없으면 자동으로 만들어짐 - 근데 지금 B에 생성자 정의를 했으므로
        // super을 생략할 수 있는 경우는 기본생성자일때만 .
        System.out.println("ClassC 생성자");

    }
}
