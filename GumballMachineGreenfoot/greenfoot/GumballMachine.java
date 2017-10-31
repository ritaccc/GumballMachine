import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
        import java.util.Iterator;
        import java.util.List;
/**
 * Write a description of class GumballMachine here.
 *
 * @author (Mengxuan Cai)
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    Message m = new Message();
    Coin haveCoin = null;
    public GumballMachine() {
        GreenfootImage image = this.getImage();
        image.scale(350, 400);
    }
    public void selectPicker() {
        int pickerN = Greenfoot.getRandomNumber(2);
        World world = this.getWorld();
        List gPk = world.getObjects(GreenPicker.class);
        List rPk = world.getObjects(RandomPicker.class);
        Picker picker;
        if(pickerN == 1) {
            picker = (Picker)gPk.remove(0);
            Greenfoot.delay(100);
            this.setMessage("Green Picker");
            picker.moveTo(469, 396);
            Greenfoot.delay(100);
            picker.pick();
            Greenfoot.delay(100);
            picker.moveTo(669, 456);
        } else {
            picker = (Picker)rPk.remove(0);
            Greenfoot.delay(100);
            this.setMessage("Random Picker");
            picker.moveTo(455, 154);
            Greenfoot.delay(100);
            picker.pick();
            Greenfoot.delay(100);
            picker.moveTo(655, 94);
        }

        this.cleanUp();
    }
    public void cleanUp() {
        World world = this.getWorld();
        if(this.m.getWorld() != null) {
            world.removeObject(this.m);
        }

        List gb = world.getObjects(Gumball.class);
        Iterator var3 = gb.iterator();

        while(var3.hasNext()) {
            Gumball a = (Gumball)var3.next();
            world.removeObject(a);
        }

    }
    public void setMessage(String msg) {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mouseX = mouse.getX();
        int mouseY = mouse.getY();
        World world = this.getWorld();
        if(this.m.getWorld() != null) {
            world.removeObject(this.m);
        }

        world.addObject(this.m, mouseX, mouseY);
        this.m.setText(msg);
    }
    public void act()
    {
        Actor coin = this.getOneObjectAtOffset(10, 10, Coin.class);
        if(coin != null) {
            if(this.haveCoin != null) {
                coin.move(-300);
            } else {
                this.haveCoin = (Coin)coin;
                this.setMessage("Have Coin!");
                this.insertCoin(coin);
            }
        }

        if(Greenfoot.mousePressed(this)) {
            if(this.haveCoin == null) {
                this.setMessage("No Coin in Slot!");
            } else {
                this.setMessage("Crank Turned!");
                this.checkCoin(this.haveCoin);
            }
        }

    }
    private void insertCoin(Actor coin) {
        World world = this.getWorld();
        world.removeObject(coin);
    }

    public void moveInspector(int x, int y) {
        Inspector inspector = (Inspector)this.getOneIntersectingObject(Inspector.class);
        inspector.moveTo(x, y);
    }

    public void checkCoin(Coin coin) {
        this.moveInspector(533, 291);
        if(coin.isReal()) {
            if(coin.getValue() == 25) {
                this.setMessage("real quarter");
                this.selectPicker();
            } else if(coin.getValue() == 1) {
                this.setMessage("Sorry, not enough");
                Greenfoot.delay(300);
                this.cleanUp();
            }
        } else {
            this.setMessage("fake quarter");
            Greenfoot.delay(300);
            this.cleanUp();
        }

        this.haveCoin = null;
    }
}
