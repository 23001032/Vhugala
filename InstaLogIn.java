import java.util.*;
public class InstaLogIn{
   public static void main(String args[]){
    Scanner pin=new Scanner(System.in);
    System.out.println("Username:Vhu_Ga_La7");
     
     System.out.print("Enter password:");
     String enterPassword=pin.nextLine();
     String password="Nemadandila@7";

     if(password.equals(enterPassword)){
         System.out.print("Log in succesfully");
     }else{
          System.out.print("Incorrect password");   

     }
   } 
}