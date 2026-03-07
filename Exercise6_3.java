import java.util.Scanner;
public class Exercise6_3 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        int rev_num = reverse( num);
        boolean ok = isPalindrome(num);
        System.out.println("The reverse number is : "+ rev_num);
        System.out.println("The number is palindrome: "+ ok);

    }
    public static int reverse(int n){
        int res =0 ;
        while ( n !=0){
            int last_n= n%10;
            res= res * 10 + last_n;
            n/=10;
        }
        return res;
    }
     public static boolean isPalindrome(int n ){
        return n == reverse(n);
     }
}
