import java.util.*;
/*
 * @MengxuanCai
 * @11/18/2016
 */
public class Cheese extends BurgerDecorator {
    
    public double cost;
    List<String> addCheese = new ArrayList<String>();

    public Cheese(Burger burger, List<String> cheese) {
        super(burger);
        addCheese = cheese;
    }

    public double getCost() {
        cost = super.getCost();
        if (addCheese.size() > 1) {
            cost += ((addCheese.size()-1) * 1);
        }
       return cost;
    }
    
    public void printDescription(){
       super.printDescription();
       String cheeseDecorator = "";
       for(String cheese : addCheese){
           cheeseDecorator += cheese + " + ";
           
       }
       
       System.out.println(cheeseDecorator.substring(0, cheeseDecorator.lastIndexOf("+") ) );
    }
    public void setCommand() {
        this.command = cmd;
    
    }
    commnd = new  decafcommand();
    public void invoke() {]
        command.getGetCommand();
    }
}
