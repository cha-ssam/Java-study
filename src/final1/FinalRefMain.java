package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
        // data1 = new Data();  참조형에 대해서도 final 로 선언하면 한번만 담을 수 있음 .

        //참조 대상의 값은 변경 가능

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
