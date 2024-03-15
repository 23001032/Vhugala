
import java.util.Scanner;
public class Report{
    public static void main(String[]args){
      
        Scanner pass=new Scanner(System.in);
        
        System.out.print("Enter the marks of Tshivenda:");
        int venda=pass.nextInt();
        System.out.print("Enter the marks of English:");
        int english=pass.nextInt();
        System.out.print("Enter the marks of Mathematics:");
        int math=pass.nextInt();
        System.out.print("Enter the marks of Life Orientation:");
        int lo=pass.nextInt();
        System.out.print("Enter the marks of Life Sciences:");
        int lfsc=pass.nextInt();
         System.out.print("Enter the marks of Physical Science:");
        int phy=pass.nextInt();
         System.out.print("Enter the marks of Geography:");
        int geo=pass.nextInt();
        
        
        if(venda>=0 && venda<=29){System.out.println("Tshivenda:Not Achieved");}
        else if(venda>=30 && venda<=39){System.out.println("Tshivenda:Elementary Achievement");}
        else if(venda>=40 && venda<=49){System.out.println("Tshivenda:Moderate Achievement");}
        else if(venda>=50 && venda<=59){System.out.println("Tshivenda:Adequate Achievement");}
        else if(venda>=60 && venda<=69){System.out.println("Tshivenda:Substantial Achievement");}
        else if(venda>=70 && venda<=79){System.out.println("Tshivenda:Meritorious Achievement");}
        else if(venda>=80 && venda<=100){System.out.println("Tshivenda:Outstanding Achievement");}
        else{System.out.println("Invalid marks");}
        
        if(english>=0 && english<=29){System.out.println("English:Not Achieved");}
        else if(english>=0 && english<=39){System.out.println("English:Elementary Achievement");}
        else if(english>=40 && english<=49){System.out.println("English:Moderate Achievement");}
        else if(english>=50 && english<=59){System.out.println("English:Adequate Achievement");}
        else if(english>=60 && english<=69){System.out.println("English:Substantial Achievement");}
        else if(english>=70 && english<=79){System.out.println("English:Meritorious Achievement");}
        else if(english>=80 && english<=100){System.out.println("English:Outstanding Achievement");}
        else{System.out.println("Invalid marks");}
        
        if(math>=0 && math<=29){System.out.println("Mathematics:Not Achieved");}
        else if(math>=0 && math<=39){System.out.println("Mathematics:Elementary Achievement");}
        else if(math>=40 && math<=49){System.out.println("Mathematics:Moderate Achievement");}
        else if(math>=50 && math<=59){System.out.println("Mathematics:Adequate Achievement");}
        else if(math>=60 && math<=69){System.out.println("Mathematics:Substantial Achievement");}
        else if(math>=70 && math<=79){System.out.println("Mathematics:Meritorious Achievement");}
        else if(math>=80 && math<=100){System.out.println("Mathematics:Outstanding Achievement");}
        else{System.out.println("Invalid marks");}
        
          if(lo>=0 && lo<=29){System.out.println("Life Orientation:Not Achieved");}
        else if(lo>=0 && lo<=39){System.out.println("Life Orientation:Elementary Achievement");}
        else if(lo>=40 && lo<=49){System.out.println("Life Orientation:Moderate Achievement");}
        else if(lo>=50 && lo<=59){System.out.println("Life Orientation:Adequate Achievement");}
        else if(lo>=60 && lo<=69){System.out.println("Life Orientation:Substantial Achievement");}
        else if(lo>=70 && lo<=79){System.out.println("Life Orientation:Meritorious Achievement");}
        else if(lo>=80 && lo<=100){System.out.println("Life Orientation:Outstanding Achievement");}
        else{System.out.println("Invalid marks");}
        
          if(lfsc>=0 && lfsc<=29){System.out.println("Life Sciences:Not Achieved");}
        else if(lfsc>=0 && lfsc<=39){System.out.println("Life Sciences:Elementary Achievement");}
        else if(lfsc>=40 && lfsc<=49){System.out.println("Life Sciences:Moderate Achievement");}
        else if(lfsc>=50 && lfsc<=59){System.out.println("Life Sciences:Adequate Achievement");}
        else if(lfsc>=60 && lfsc<=69){System.out.println("Life Sciences:Substantial Achievement");}
        else if(lfsc>=70 && lfsc<=79){System.out.println("Life Sciences:Meritorious Achievement");}
        else if(lfsc>=80 && lfsc<=100){System.out.println("Life Sciences:Outstanding Achievement");}
        else{System.out.println("Invalid marks");}
        
          if(phy>=0 && phy<=29){System.out.println("Physical Science:Not Achieved");}
        else if(phy>=0 && phy<=39){System.out.println("Physical Science:Elementary Achievement");}
        else if(phy>=40 && phy<=49){System.out.println("Physical Science:Moderate Achievement");}
        else if(phy>=50 && phy<=59){System.out.println("Physical Science:Adequate Achievement");}
        else if(phy>=60 && phy<=69){System.out.println("Physical Science:Substantial Achievement");}
        else if(phy>=70 && phy<=79){System.out.println("Physical Science:Meritorious Achievement");}
        else if(phy>=80 && phy<=100){System.out.println("Physical Science:Outstanding Achievement");}
        else{System.out.println("Invalid marks");}
        
          if(geo>=0 && geo<=29){System.out.println("Geography:Not Achieved");}
        else if(geo>=0 && geo<=39){System.out.println("Geography:Elementary Achievement");}
        else if(geo>=40 && geo<=49){System.out.println("Geography:Moderate Achievement");}
        else if(geo>=50 && geo<=59){System.out.println("Geography:Adequate Achievement");}
        else if(geo>=60 && geo<=69){System.out.println("Geography:Substantial Achievement");}
        else if(geo>=70 && geo<=79){System.out.println("Geography:Meritorious Achievement");}
        else if(geo>=80 && geo<=100){System.out.println("Geography:Outstanding Achievement");}
        else{System.out.println("Invalid marks");}
        
    }
}