import java.util.Random;
/**import java.util.Random;
 * Write a description of class HasEnoughCoinState here.
 * 
 * @MengxuanCai 
 * @09/19/2016
 */

public class HasEnoughCoinState implements State
{
	GumballMachine gumballMachine;
 
	public HasEnoughCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
	    if(coin == 25) {
	        System.out.println("You insert a quarter!");
	    }else if(coin == 10) {
	        System.out.println("You insert a dime!");
	    }else if(coin == 5) {
	        System.out.println("You insert a nickle!");
	    }else {
	        System.out.println("Only quarter, dime and nickle are accepted!");
	    }
	    gumballMachine.setCoin(gumballMachine.getCoin() + coin);
	}
 
	public void ejectCoin() {
		System.out.println("All your coins have been returned, total " + gumballMachine.getCoin() + "!");
		gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
	}
 
	public void turnCrank() {
		gumballMachine.setState(gumballMachine.getSoldState());
		
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank!";
	}
}
