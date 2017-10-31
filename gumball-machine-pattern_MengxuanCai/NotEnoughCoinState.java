
/**
 * Write a description of class NotEnoughCoinState here.
 * 
 * @MengxuanCai
 * @9/19/2016
 */
public class NotEnoughCoinState implements State
{
    // instance variables - replace the example below with your own
    GumballMachine gumballMachine;
    public NotEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertCoin(int coin) {
        if(coin == 25) {
            System.out.println("You insert a quarter");
        }else if(coin == 10) {
            System.out.println("You insert a dime");
        }else if(coin == 5) {
            System.out.println("You insert a nickle");
        }else {
            System.out.println("Sorry, only quarter, dime, nickle are accepted!");
        }
        coin += gumballMachine.getCoin();
        gumballMachine.setCoin(coin);
        if(gumballMachine.getCoin() >= 50) {
            gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
        }else {
            System.out.println("Please insert more coins!");
        }
    }
    public void ejectCoin() {
        int coin = gumballMachine.getCoin();
        if(coin > 0) {
            System.out.println("All your coins have been returned, total " + coin + "!");
            gumballMachine.setCoin(0);
        }else {
            System.out.println("There is no quarter in gumballMachine!");
        }
    }
    public void turnCrank() {
        int coin = gumballMachine.getCoin();
        if(coin > 0) {
             System.out.println("You turned crank, but there is not enough coin in Gumball Machine!");
        }else {
            System.out.println("You turned crank, but no coin in Gumball Machine!");
        }
    }
    public void dispense() {
        int coin = gumballMachine.getCoin();
        if(coin > 0) {
            System.out.println("No enough coins!, you only have " + coin + " coins in Gumball Machine!");
        }else {
            System.out.println("No coins inserted yet!");
        }
            
    }
    public String toString(){
        return "waiting for more coins!";
    }
    
}
