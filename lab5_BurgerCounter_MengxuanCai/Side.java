import java.util.*;
/**
 * Write a description of class Side here.
 * 
 * @MengxuanCai
 * @11/18/2016
 */
//new class compare to lab4
public class Side extends BurgerDecorator
{
    private double cost;
    List<String> addSide = new ArrayList<String>();

    public Side(Burger burger, List<String> sides) {
        super(burger);
        addSide = sides;
    }

    public double getCost() {
        cost = super.getCost();
        if (addSide.size() >= 1) {
            cost += (addSide.size() * 3.00);
        }
       return cost;
    }
    
    public void printDescription(){
       super.printDescription();
       String cheeseDecorator = "";
       for(String cheese : addSide){
           cheeseDecorator += cheese + " + ";
       }
       System.out.println(cheeseDecorator.substring(0, cheeseDecorator.lastIndexOf("+") ) );
    }
}
