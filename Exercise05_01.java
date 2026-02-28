import java.util.Scanner;
public class Exercise05_01 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();;
        int sum=0;
        double avg =0.0;
        int counter =0;
        while ( num != 0) {
            sum += num;
            counter++;
            num = input.nextInt();
        }
        if (counter>0) {
            avg = (double) sum / counter;
            System.out.print(" The Sum of number is " + sum + ", The average is " + avg);
        } else {  System.out.print("No number is entered");
    }
}}
