import java.util.Scanner;
public class Exercise6_12 {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first character : ");
    char c1 = input.next().charAt(0);
    System.out.print("Enter second character : ");
    char c2 = input.next().charAt(0);
    displayCharacters( c1 , c2);
    }
    public static void displayCharacters(char c1 ,char c2){
        int counter =0;
         for(int i = (int)c1;i<(int)c2;i++){
             counter++;
             System.out.print((char)i+" ");
             if(counter % 10 ==0)
             System.out.println();
}   }
}
