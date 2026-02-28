import java.util.Scanner;
public class Exercise02_06 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :" );
        int num = input.nextInt();
        int n1 = num % 10;
        int remaining = num / 10;
        int n2 = remaining % 10;
        int n3 = remaining / 10;
        int sum = n1+n2+n3;
        System.out.print("The sum of the number: "+ sum);

    }
}
