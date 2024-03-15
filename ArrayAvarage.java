public class ArrayAvarage {
    public static void main(String args[]){
        int [] arr={2,5,9,4};
        int i=0;
        int sum=0;
        do{
            sum+=arr[i];
            i++;
        }
        while(i<=arr.length);
        int average=sum/arr.length;
        System.out.println(average);
    }
}
