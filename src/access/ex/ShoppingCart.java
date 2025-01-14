package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int cnt = 0;
    private int sum = 0;

    public void addItem(Item item){
        items[cnt] = item;
        cnt++;
    }
    public void displayItems(){
        for (int i = 0;i < cnt;i++){
            items[i].showDetail();
            sum += items[i].sum;
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
