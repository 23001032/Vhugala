public class PrimeCheck{
    public static void main(String args[]){
        int num=11;
        boolean work=false;

        int i=2;
        do{
            if(num%i==0){
                work=true;
                break;
            }
            i++;
        }
        while(i<=num/2);
        if(!work){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}