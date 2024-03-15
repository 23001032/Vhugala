public class CountSpaces{
    public static void main(String args[]){
        String quote="Dont Give up on what you want";
         
         int count=0;        
         for(int j=0;j<quote.length();j++){
            if(quote.charAt(j) == ' '){
                count++; }  
            }       
            System.out.print("Total number of spaces is "+count);  
    
}
}