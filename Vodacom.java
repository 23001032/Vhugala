import java.util.*;
public class Vodacom{
    public static void main(String[]args){
    Scanner pay=new Scanner(System.in);
        System.out.println("Airtime: R29.00 ");
        System.out.println("Just4You ");
        System.out.println("1)Everyday-ta ");
        System.out.println("2)Voice ");
        System.out.println("3)Data ");
        System.out.println("4)Town");
        System.out.println("5)Student");
        System.out.println("6)Social&Video");
        System.out.println("7)Device ");
        System.out.println("8)Next");
        int option1=pay.nextInt();

        if(option1==1){System.out.println("Everyday-ta:Pay once and get a daily bundle allocated every day:");
        System.out.println("1)100MB daily at R16(3 days)");
        System.out.println("2)175MB daily at R22(3 days)");
        System.out.println("3)100MB daily at R25(5 days)");
        System.out.println("4)250MB daily at R29(3 days)");
        System.out.println("5)100MB daily at R29(7 days)");
        System.out.println("6)Back");
        int option2=pay.nextInt();
        if(option2==6){ System.out.println("Airtime: R29.00 ");
        System.out.println("Just4You ");
        System.out.println("1)Everyday-ta ");
        System.out.println("2)Voice ");
        System.out.println("3)Data ");
        System.out.println("4)Town");
        System.out.println("5)Student");
        System.out.println("6)Social&Video");
        System.out.println("7)Device ");
        System.out.println("8)Next");}
        }
        else if(option1==3){
            System.out.println("Buy Data ");
            System.out.println("1)Just4You ");
            System.out.println("2)1 Hour ");
            System.out.println("3)Todays ");
            System.out.println("4)7 Days(65% OFF) ");
            System.out.println("5)30 Days(25% OFF)");
            System.out.println("6)30 days Every Month");
            System.out.println("7)Pay Once Recurring");
            System.out.println("8)For Another Number");
            System.out.println("9)Night Owl");
            System.out.println("10)Back");
        }
        

    }
}