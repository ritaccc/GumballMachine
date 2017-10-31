public class Milk implements IRobotCommand
{

    private IRobotCommand component ;
    private String option;

    public Milk(IRobotCommand c)
    {
        this.component = c;
        option = "";
    }

    public String getCommand( ) 
    {
        return " Milk[" + option + "]" ;
    }
    
    public void setOption(String o) 
    {
         option = o;
    }
    
}
