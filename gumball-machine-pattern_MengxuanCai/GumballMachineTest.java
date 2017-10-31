
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @MengxuanCai
 * @9/19/2016
 */
public class GumballMachineTest
{
    /**
     * Default constructor for test class GumballMachineTest
     */
    private GumballMachine gumballMachine;
    private GumballMachine gm1;
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        gumballMachine = new GumballMachine(5);
        gm1 = new GumballMachine(0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testInsertEnoughCoinForOneCrank() {
        System.out.println(" --------Test insert enough coin for one crank!-------");
        gumballMachine.insertQuarter();
        gumballMachine.insertNickel();
        gumballMachine.insertQuarter();
        gumballMachine.insertDime();
        //assertEquals(65, gumballMachine.getCoin());
        gumballMachine.turnCrank();
        //assertEquals(15, gumballMachine.getCoin());
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        assertEquals(false, gumballMachine.isGumballInSlot());
    }
    @Test
    public void testNoCoinToCrank() {
        System.out.println("--------Test no coin to crank !--------");
        assertEquals(0, gumballMachine.getCoin());
        gumballMachine.turnCrank();
        assertEquals(false, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
    }
    @Test
    public void testNotEnoughCoinToCrank() {
        System.out.println("--------Test not enough coin to crank !--------");
        gumballMachine.insertQuarter();
        assertEquals(25, gumballMachine.getCoin());
        gumballMachine.turnCrank();
        assertEquals(false, gumballMachine.isGumballInSlot());
        gumballMachine.insertNickel();
        gumballMachine.turnCrank();
        assertEquals(false, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
    }
    @Test
    public void testInsertEnoughCoinForTwoCrank(){
        System.out.println("-------- Test insert enough coin for two crank! --------");
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.insertDime();
        gumballMachine.turnCrank();
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        assertEquals(true, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        assertEquals(false, gumballMachine.isGumballInSlot()); 
    }
    @Test
    public void testEjectCoins() {
        System.out.println("--------Test eject the coins you insert! --------");
        gumballMachine.insertQuarter();
        gumballMachine.insertDime();
        gumballMachine.insertNickel();
        assertEquals(40, gumballMachine.getCoin());
        gumballMachine.ejectCoin();
        assertEquals(false, gumballMachine.isGumballInSlot());
        gumballMachine.takeGumballFromSlot();
        
    }
    @Test
  
    
    
 
}
