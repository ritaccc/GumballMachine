public class iPhone
{
    IRobotCommand rc;
    Robot robot = new Robot(rc);
    Milk milk = new Milk(rc);
    Shots shot = new Shots(rc);
    Drink drink = new Drink(rc);
    Decaf decaf = new Decaf(rc);
    
    public iPhone( ) { }

    public void setDecaf(String s)
    {
        // input: NO, YES and 1/2
        decaf.setOption(s);
        
    }
    
    public void setShots(String s)
    {
        // input: 1, 2, 3, d
        shot.setOption(s);
    }

    public void setMilk(String s)
    {
        // input: WH, NF, 1, 2
        milk.setOption(s);
    }
    
    public void setDrink(String s)
    {
        // input: A, L, M, C, CM, CDI, E, ECP
        drink.setOption(s);
    }
    
    public String sendCommand()
    {
        // return command string for robot
        String s = robot.getCommand();
        if(!decaf.getCommand().contains("[]")) {
            s += decaf.getCommand();
        }
        if(!shot.getCommand().contains("[]")) {
            s += shot.getCommand();
        }
        if(!milk.getCommand().contains("[]")) {
            s += milk.getCommand();
        }
        if(!drink.getCommand().contains("[]")) {
            s += drink.getCommand();
        }
        return s ; // replace with your code
    }
}
