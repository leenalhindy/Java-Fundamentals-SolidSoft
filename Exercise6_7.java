import java.util.Scanner;
public class Exercise6_7 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual rate: ");
        double annualRate =  input.nextDouble();
        double monthRate = annualRate /1200;
        System.out.print("Enter years: ");
        int years = input.nextInt();
        double futureValue = futureInvestmentValue(amount, monthRate,years);
        System.out.printf("The future investment value is: $%.2f", futureValue);
    }
    public static double futureInvestmentValue(double amount, double monthlyRate, int years){
        int numOfMonth= years*12;
        return amount * (Math.pow((1+monthlyRate),numOfMonth));
    }
}
