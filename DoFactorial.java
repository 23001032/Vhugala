public class DoFactorial {
    public static void main(String args[]){
        int num=7;
        int answer=1;
        int i=1;

        do{
            answer=answer*i; /*NB:The variable is a storage container it holds values and data*/
            i++;
        }
        while(i<=num);
        System.out.println(answer);
    }
    
}
