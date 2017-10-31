
public class Shots implements IRobotCommand
{

    private IRobotCommand component ;
    private String option;

    public Shots(IRobotCommand component)
    {
        this.component = component;
        option = "";
    }

    public String getCommand( ) 
    {
        return " Shots[" + option + "]" ;
        
    }
    
    public void setOption(String o) 
    {
         option = o;
    }
    
}
