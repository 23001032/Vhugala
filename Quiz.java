import java.util.*;
  public class Quiz {
public static void main(String[]args){
    Scanner exam=new Scanner(System.in);

    System.out.println("Choose true or false to answer the questions");
    
    System.out.print("1.Charles Babbage is the father of computer?");
    boolean a=exam.nextBoolean();
    System.out.print("2.Gregor Mendel is the father of genetics?");
    boolean b=exam.nextBoolean();
    System.out.print("3.Limpopo is the capital city of South Africa?");
    boolean c=exam.nextBoolean();
    System.out.print("4.Elon Musk is the richest man in the universe ?");
    boolean d=exam.nextBoolean();
    System.out.print("5.Nelson Mandela is the third black man to be the president of South Africa?");
    boolean e=exam.nextBoolean();

    if(a==true){
        System.out.println("Correct");
    }else if(a==false){
        System.out.println("Incorrect");
    }
    else{System.out.println("Invalid answer");}
    
    if(b==true){
        System.out.println("Correct");
    }else if(b==false){
        System.out.println("Incorrect");
    }
    else{System.out.println("Invalid answer");}
    if(c==false){
        System.out.println("Correct");
    }else if(c==true){
        System.out.println("Incorrect");
    }
    else{System.out.println("Invalid answer");}
    if(d==true){
        System.out.println("Correct");
    }else if(d==false){
        System.out.println("Incorrect");
    }
    else{System.out.println("Invalid answer");}
    if(e==false){
        System.out.println("Correct");
    }else if(e==true){
        System.out.println("Incorrect");
    }
    else{System.out.println("Invalid answer");}

}     
}
