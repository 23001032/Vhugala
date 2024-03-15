public class DreamCars{
    public static void main(String [] args){
       String [] car = new String[5];
       
       car[0]="Toyota";
       car[1]="Audi";
       car[2]="Benz";
       car[3]="BMW";
       car[4]="Ford";
       int i=0;
       do{
        System.out.println(car[i]);
        i++;
       }
       while(i<car.length);
       
    }
}