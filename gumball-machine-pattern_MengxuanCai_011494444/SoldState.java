
/**
 * @MengxuanCai
 * @9/19/2016
 */
public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertCoin(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectCoin() {
        
        System.out.println("You have " + gumballMachine.getCoin() + " coins left in slot!");
        gumballMachine.setCoin(0);
        gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
        
        if (gumballMachine.getCount() > 0) {
            gumballMachine.releaseBall();
            if(gumballMachine.getCoin() > 0) {
                gumballMachine.ejectCoin();  
            }
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.ejectCoin();
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


