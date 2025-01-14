package access.ex;

public class Item {

    private String name;
    private int price;
    private int quantity;
    int sum = 0;

    public Item(String name,int price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    int showDetail(){
        sum += (price*quantity);
        System.out.println("상품명 : " + name + ", 합계: " + price*quantity);
        return sum;
    }


}
