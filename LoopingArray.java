public class LoopingArray{
    public static void main(String args[]){
        int [] [] arr={{1,2,3,4},{5,6,7}};
       
         for(int i=0;i<arr.length;++i){
            
             for(int j=0;i<arr[i].length;++j){
                System.out.println(arr[i][j]);
            }
        }
    }
}