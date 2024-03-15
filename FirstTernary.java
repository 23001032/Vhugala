public class FirstTernary{
    public static void main(String arguments[]){
          
     String name="Worship";
     String name2=new String(name); 
     int value=0;
     value=(name==name2) ? 1:2; 
    if(value==1){
        System.out.println("Good Morning");
    }
    else if(value==2){
        System.out.println("Good Afternoon");
    }
    else{
        System.out.println("Good Evening");
    }  
    }
}