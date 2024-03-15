import java.util.Scanner;
public class Criterion{
    public static void main(String args[]){
        Scanner right=new Scanner(System.in);

        System.out.print("Enter a positive integer:");
        int a=right.nextInt();

        if(a%11==0){
            System.out.println("Divisible by 11");
         }
         else if(a%11!=0){
            System.out.println("Not divisible by 11");
         }
         else {
            System.out.println("Invalid integer");
         }


    }
}