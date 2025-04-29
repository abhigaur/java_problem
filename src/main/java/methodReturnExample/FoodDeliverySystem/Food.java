package methodReturnExample.FoodDeliverySystem;

public class Food {

   private String foodItem;

   public String getFood()
   {
       return foodItem;
   }
   public Food setFoodItem(String foodItem)
   {
       this.foodItem=foodItem;
       return this;
   }
}
