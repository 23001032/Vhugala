import java.util.*;
public class UpperCaseCheck{
    public static void main(String args[]){
        Scanner word=new Scanner(System.in);
        System.out.print("Enter a letter:");
        char letter=word.next().charAt(0);

        if(Character.isUpperCase(letter)){
          System.out.print(letter+" is uppercase");
         }else if(Character.isLowerCase(letter)){
           System.out.print(letter+" is lowercase");
         }
            
         }
    }
