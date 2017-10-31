import java.util.*;
/**
 * @MengxuanCai
 * @11/18/2016
 */
public class Composite implements Component {

    private List<Component> components = new ArrayList<Component>();
    private String description ;
    private Burger customBurger;
    private double cost = 0;
        
    public Composite ( String d ){
        description = d ;
    }

    public void printDescription() {
        
        if(null != customBurger ){
            System.out.println( description+" : " + customBurger.getCost());
            for (Component obj  : components)
                {
                    obj.printDescription();
                              
                }
            
        } else {
            System.out.println( description );
            
            if(description.equals("Order")) {
                for (Component obj  : components)
                {
                    obj.printDescription();
                    Composite burger = (Composite)obj;
                    cost += burger.getBurger().getCost();
                    System.out.print("\n");
                              
                }
                
                System.out.println("Subtotal: $" + cost);
            }
            
        }
        
      }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    public Burger getBurger() {
        return customBurger;
    }
    
    public void setCustomBurger(Burger burger){
       customBurger = burger;
    }
     
}
 
