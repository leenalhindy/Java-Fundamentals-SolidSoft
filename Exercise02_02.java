import java.util.Scanner;
public class Exercise02_02 {
    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of sides :" );
        double lengthOfSide = input.nextFloat();
        double area = ( Math.sqrt(3) / 4 )  * (Math.pow (lengthOfSide ,2));
        double volume = area * lengthOfSide;
        System.out.println(" The Area of triangle : "+area );
        System.out.print(" The Volume of traingle : "+ volume);
    }
}
