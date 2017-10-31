import java.util.*;
/**
 * Write a description of class PremiumCheese here.
 * 
 * @MengxuanCai
 * @11/18/2016 (a version number or a date)
 */
public class PremiumCheese extends BurgerDecorator
{
    public double cost;
    List<String> addPremiumCheese = new ArrayList<String>();

    public PremiumCheese(Burger burger, List<String> premiumCheese) {
        super(burger);
        addPremiumCheese = premiumCheese;
    }

    public double getCost() {
        cost = super.getCost();
        if (addPremiumCheese.size() >= 1) {
            cost += (addPremiumCheese.size() * 1.50);
        }
        return cost;
    }
    
    public void printDescription(){
       super.printDescription();
       String cheeseDecorator = "";
       for(String cheese : addPremiumCheese){
           cheeseDecorator += cheese + " + ";
       }
       System.out.println(cheeseDecorator.substring(0, cheeseDecorator.lastIndexOf("+") ) );
    }
}
