public class Drink implements IRobotCommand
{
    
    private IRobotCommand component;
    private String option;
    public Drink(IRobotCommand c)
    {
        this.component = c;
        option = "";
        
    }

    public String getCommand( ) 
    {
        return " Drink[" + option + "]" ;
    }
    
    public void setOption(String o) 
    {
         option = o;
    }    
}
