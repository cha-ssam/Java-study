package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = new Data(); // null 이면 예외 발생
        data.value = 10;
        System.out.println("data " + data.value);

    }
}
