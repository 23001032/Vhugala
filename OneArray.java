
public class OneArray {
    public static void main(String args[]){

     int [] arr={2,19,26,17,40};
     int sum=0;
     for(int i:arr){
        sum+=arr[i];
     }
        int average=sum/arr.length;
        System.out.println("Average is "+average);
        
    }

}
    

