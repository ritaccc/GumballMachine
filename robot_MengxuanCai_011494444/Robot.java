public class Robot implements IRobotCommand
{
     private String option;
     private IRobotCommand component;
     public Robot(IRobotCommand c){
         this.component = c;
         option = "";
     }
     public String getCommand( ) 
     {
         return "Robot:" ;
     }
     
     public void setOption(String o) 
     {
         
     }
}
