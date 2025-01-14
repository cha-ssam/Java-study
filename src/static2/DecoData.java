package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        instanceValue++;  컴파일 오류
//        instanceMethod();  컴파일 오류

        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }
    private void instanceMethod(){
        System.out.println(instanceValue);
    }
    private static void staticMethod(){
        System.out.println(staticValue);
    }
}
