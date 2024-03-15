import java.util.*;
public class Ascending {
    public static void main(String args[]){
        Scanner order=new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a=order.nextInt();
        int b=order.nextInt();
        int c=order.nextInt();
    if(a<b && a<c && b<c){
        System.out.printf("%d,%d,%d",a,b,c);
    }
    else if(b<a && b<c && c<a){
        System.out.printf("%d,%d,%d",b,c,a);
    }
    else if(c<a && c<b && b<a){
        System.out.printf("%d,%d,%d",c,b,a);
    }
    else if(b<a && b<c && a<c){
        System.out.printf("%d,%d,%d",b,a,c);
    }
    else if(a<b && a<c && c<b){
        System.out.printf("%d,%d,%d",a,c,b);
    }
    else{
        System.out.printf("%d,%d,%d",c,a,b);
    }


    }
    
}
