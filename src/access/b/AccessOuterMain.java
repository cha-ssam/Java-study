package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

//        data.defaultField = 2;
//        data.defaultMethod();

//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess(); // public 이어서 호출 가능 .내부에서는 자기 자신꺼는 접근가능.
    }
}
