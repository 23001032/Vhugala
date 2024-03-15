import java.util.Scanner;
     public class VowelCount{
         public static void main(String[]args){
            Scanner vowel=new Scanner(System.in);
            
            System.out.print("Input value of a string:");
            String word=vowel.nextLine();

             int count=0;
             for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
            if(ch =='a'||ch== 'e'||ch=='i'||ch=='o'||ch=='u'||ch =='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U'){
                count++;
                }
             }
             System.out.print("Number of vowels "+count);

    }
   } 