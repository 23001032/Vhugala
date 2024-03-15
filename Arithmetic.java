import java.util.*;
 public class Arithmetic{
    public static void main(String args[]){
        Scanner answer=new Scanner(System.in);
        System.out.print("Choose the Arithmetic operation to perform\n(Addition,Multiplication,Subtraction,Division):");
        String maths=answer.nextLine();
         int valueA=43,valueB=65;
         switch(maths){
            case "Addition":
            int sum=valueA+valueB;
            System.out.println(sum);
            break;
            case "Multiplication":
            int product=valueA*valueB;
            System.out.println(product);
            break;
            case "Subtraction":
            int difference=valueA-valueB;
            System.out.println(difference);
            break;
            case "Division":
            double average=valueA/valueB;
            System.out.println(average);
            break;
         }
    }
    
}
