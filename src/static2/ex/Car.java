package static2.ex;

public class Car {
    private static int count;
    private String model;

    public Car(String model){
        this.model = model;
        System.out.println("차량 구입, 이름: " + model);
        count++;
    }
    static void showTotalCars(){
        System.out.println("구매한 차량 수: " + count );
    }
}
