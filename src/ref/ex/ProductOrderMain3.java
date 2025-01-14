package ref.ex;

import java.util.Scanner;
import java.util.SequencedCollection;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int size = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[size];

        for (int i = 0; i < size; i ++){
            System.out.println(i + 1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : " );
            String productName = scanner.nextLine();
            System.out.print("가격 : " );
            int price = scanner.nextInt();
            System.out.print("수량 : " );
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(productName,price,quantity);
        }

       printOrders(orders);
       int sum = 0;
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명 " + order.productName + ", 가격 : " + order.price + " 수량 :" + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
