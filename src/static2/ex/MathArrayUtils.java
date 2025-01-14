package static2.ex;

public class MathArrayUtils {
//    static int[] values = new int[5];

    private MathArrayUtils(){
        // private 인스턴스 생성을 막는다.
    }
    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {  // 자기 클래스내의 메서드는 static여도 쓸 수 있음.
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if( min > values[i]){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if( max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
