import java.util.Scanner;
public class Exercise02_01 {
    public static void main (String [] args){

        Scanner input= new Scanner (System.in);
        System.out.print("Enter miles value:");
        double miles= input.nextDouble();
        double kiloMeters= 1.6* miles;
        System.out.print("Mile is:"+miles+"Kilometer is:"+kiloMeters);
    }
}
