package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; // protected 는 상속관계 OR 같은 패키지
        // defaultValue = 1; // default 는 같은 패키지
        // privateValue = 1; // 접근 불가 , 컴파일 오류

        publicMethod();
        protectedMethod();
         // defaultMethod();
        // privateMethod();

        printMethod();

    }
}
