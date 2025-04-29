package methodReturnExample.FoodDeliverySystem;

public class MainTest {

    public static void main(String[] args) {
        Order order= new Order();
        order.orderFood("pizza")
                .orderColdDrink("pepsi")
                .deliveryAddress("VPO tajpur")
                .confirmOrder();


    }
}
