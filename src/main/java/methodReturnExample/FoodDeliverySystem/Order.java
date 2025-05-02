package methodReturnExample.FoodDeliverySystem;

import javax.sound.midi.Soundbank;

public class Order {

    Food food;
    Drink drink;
    Delivery delivery;

    public Order orderFood(String selectFood)
    {
        food= new Food();
        food.setFoodItem(selectFood);
        System.out.println("Order Started... ");
        return this;

    }

    public Order orderColdDrink (String coldDrink)
    {
        drink=new Drink();
        drink.setDrink(coldDrink);
        return this;
    }

    public Order deliveryAddress(String deliverAddress)
    {
        delivery= new Delivery();
        delivery.setAddress(deliverAddress);
        return this;

    }

    public void confirmOrder()
    {
        System.out.println("Food Selected: "+food.getFood());

        System.out.println("Drink  Selected: "+drink.getDrink());

        System.out.println("Delivery   Address: "+delivery.getAddress());

        System.out.println("Order Confirmed!");

    }

}
