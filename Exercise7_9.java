import java.util.Scanner;
public class Exercise7_9 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size od array: ");
        int size = input.nextInt();
        double []arr = new double[size];
        System.out.print("Enter the element od array: ");
        for(int i=0; i<size;i++)
            arr[i]= input.nextDouble();
        double smallestElement = min( arr);
        System.out.print("The smallest number in array is: "+ smallestElement);
    }
    public static double min(double[] array){
        double small= array[0];
        for(int i =0;i<array.length;i++){
            if (array[i]<small)
                small=array[i];
        }
        return small;
    }
}
