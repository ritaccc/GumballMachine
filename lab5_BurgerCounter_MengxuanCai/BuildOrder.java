import java.util.*;
/**
 * @MengxuanCai
 * @11/18/2016
 */
public class BuildOrder {
    public static Component getOrder()
    {
        Composite myOrder = new Composite( "Order" ) ;
        /*myOrder.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        myOrder.addChild(new Leaf("The Purist", 8.00 ));*/
        
        Composite customBurger1 = new Composite( "Build Your Own Burger" );
        Composite customBurger2 = new Composite( "Build Your Own Burger" );

        List<String> addCheese = new ArrayList<String>();
        List<String> addTopping = new ArrayList<String>();
        List<String> addPremiumTopping = new ArrayList<String>();
        List<String> addSauce = new ArrayList<String>();
        List<String> addPremiumCheese = new ArrayList<String>();
        List<String> addBun = new ArrayList<String>();
        List<String> addSides = new ArrayList<String>();
        
        // Build Order 1
        addCheese.add("Yellow American");
        addCheese.add("Spicy Jalapeno Jack");
        addPremiumCheese.add("Danish Blue Cheese");
        addSauce.add("Thai Peanut Sauce");
        addSauce.add("Mayonnaise");
        addTopping.add("Dill Pickle Chips");
        addTopping.add("Black Olives");
        addTopping.add("Spicy Pickles");
        addPremiumTopping.add("Marinated Tomatoes");
        addBun.add("Ciabatta");
        addSides.add("Shoestring Fries");
        
        Burger makeBurger1 = new Side(new Bun(new PremiumTopping(new Toppings(new Sauce(new PremiumCheese(new Cheese(new BurgerBase("Organic Bison","1/2lb","On A Bun"), addCheese), addPremiumCheese), addSauce), addTopping), addPremiumTopping), addBun), addSides);
        customBurger1.setCustomBurger(makeBurger1);
        customBurger1.addChild(((Leaf)makeBurger1));
        myOrder.addChild(customBurger1);
        
        List<String> addCheese2 = new ArrayList<String>();
        List<String> addTopping2 = new ArrayList<String>();
        List<String> addPremiumTopping2 = new ArrayList<String>();
        List<String> addSauce2 = new ArrayList<String>();
        List<String> addPremiumCheese2 = new ArrayList<String>();
        List<String> addBun2 = new ArrayList<String>();
        List<String> addSides2 = new ArrayList<String>();
        
        // Building Order 2
        addCheese2.add("Greek Feta");
        addCheese2.add("Smoke Gouda");
        addPremiumCheese2.add("Fresh Mozarella");
        addSauce2.add("Habanero Salsa");
        addTopping2.add("Crushed Peanuts");
        addPremiumTopping2.add("Sunny Side up Egg");
        addPremiumTopping2.add("Marinated Tomatoes");
        addBun2.add("Gluten Free Bun");
        addSides2.add("Shoestring Fries");

        Burger makeBurger2 = new Side(new Bun(new PremiumTopping(new Toppings(new Sauce(new PremiumCheese(new Cheese(new BurgerBase("Hormone & Antibiotic Free Beef","1/3lb","On A Bun"), addCheese2), addPremiumCheese2), addSauce2), addTopping2), addPremiumTopping2), addBun2), addSides2);
        customBurger2.setCustomBurger(makeBurger2);
        customBurger2.addChild(((Leaf)makeBurger2));
        myOrder.addChild(customBurger2);
              
        return myOrder ;
        
    }

}