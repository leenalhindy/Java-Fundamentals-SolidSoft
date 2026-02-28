import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers : ");
        int num = input.nextInt();

        int max = num;
        int counter = 1;


        while (num != 0) {
            num = input.nextInt();

            if (num > max) {
                max = num;
                counter = 1;
            } else if (num == max) {
                counter++;
            }
        }


        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count is " + counter);
    }
}
