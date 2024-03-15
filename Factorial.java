import java.util.*;
public class Factorial{
    public static void main(String[]args){
        Scanner law=new Scanner(System.in);
        System.out.print("Enter any value:");
        int answ=law.nextInt();

        int num=1;
        for(int i=1;i<=answ;i++){
            num=num*i;
            
        }
        System.out.println(num);
    }
}