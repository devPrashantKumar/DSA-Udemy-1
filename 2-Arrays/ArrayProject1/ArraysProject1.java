package ArrayProject1;
import java.util.Scanner;

public class ArraysProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's temprature? : ");
        int days = sc.nextInt();
        float dayTemp[] = new float[days];
        for(int i=0;i<days;i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            dayTemp[i] = sc.nextFloat();
        }
        sc.close();

        float tempSum = 0;
        for(int i=0;i<days;i++){
            tempSum += dayTemp[i];
        }

        float averageTemp = tempSum/days;
        System.out.println("Average Temprature : "+averageTemp);
        
    }
}