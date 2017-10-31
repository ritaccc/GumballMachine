/**
 * @MengxuanCai
 * @9/19/2016
 */
public class GumballMachine implements IGumballMachine {
 
    State soldOutState;
    //State noQuarterState;
    //State hasQuarterState;
    State soldState;
    State notEnoughCoinState;
    State hasEnoughCoinState;
    State state = soldOutState;
    int count = 0;
    int coin = 0;
    int gumballInSlot = 0;
    
 
    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        notEnoughCoinState = new NotEnoughCoinState(this);
        hasEnoughCoinState = new HasEnoughCoinState(this);
        soldState = new SoldState(this);

        this.count = count;
        if (count > 0) {
            state = notEnoughCoinState;
        } 
    }
    public void insertDime() {
        state.insertCoin(10);
    }
    public void insertNickel() {
        state.insertCoin(5);
    }
    public void insertQuarter() {
        state.insertCoin(25);
    }
    public void setCoin(int coin){
        this.coin = coin;
    }
    public int getCoin() {
        //System.out.println("test " + coin + " coins left!");
        return coin;
    }
   
    public boolean isGumballInSlot() {
        if(gumballInSlot > 0) {
            System.out.println("have " + gumballInSlot + " gumballs in slot!");
            return true;
        }else {
            System.out.println("No gumball in slot!");
            return false;
        }
    }
    public void takeGumballFromSlot(){
        if(isGumballInSlot()){
            System.out.println("You can take " + gumballInSlot +" gumball!");
            gumballInSlot = 0;
        }else {
            System.out.println("No gumballs in slot!");
        } 
    }
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
 
        if (count != 0) {
            count = count - 1;
            gumballInSlot += 1;
            coin -= 50;
            System.out.println("A gumball comes rolling out the slot...");
            System.out.println("you have " + gumballInSlot + " gumball in slot!");
        }
        
        //System.out.println("you have " + coin + " coins left in the slot!");
        
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = notEnoughCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughCoinState() {
        return notEnoughCoinState;
    }

    public State getHasEnoughCoinState() {
        return hasEnoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
