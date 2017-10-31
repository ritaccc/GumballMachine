public class Decaf implements IRobotCommand
{
    private IRobotCommand component ;
    private String option;

    public Decaf(IRobotCommand c)
    {
        this.component = c ;
        option = "";
    }

    public String getCommand( ) 
    {
        return " Decaf[" + option + "]" ; \
        receiver.doAction();
    }
    
    public void setOption(String o) 
    {
        option = o;
         
    }
}
