package Arrays.ArrayProject1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProject1UsingStreams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many day's temprature? : ");
        int days = sc.nextInt();
        Float dayTemp[] = new Float[days];
        for(int i=0;i<days;i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            dayTemp[i] = sc.nextFloat();
        }
        sc.close();

        Double averageTemp = Arrays.stream(dayTemp).mapToDouble(Float::doubleValue).average().orElse(0.0);
        /// Float averageTemp1 = Arrays.stream(dayTemp).average().orElse(0.0);
        Double numDays = (double) (Arrays.stream(dayTemp).filter(x-> x>averageTemp).count());

        System.out.println("Average Temprature : "+averageTemp);
        System.out.println("Days above Average Temprature : "+numDays);

        
    }
}
