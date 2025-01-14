package static2;

// import static static2.DecoData.*;


public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출 ");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근

        DecoData data3 = new DecoData();
        data3.staticCall(); //  이러면 인스턴스 소속 같으니까 class소속으로 확실하게 명시해주는ㄱ 좋음

        DecoData.staticCall();

    }
}
