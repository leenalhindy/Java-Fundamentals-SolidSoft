import java.util.Scanner;
public class Exercise7_10 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of element of array: ");
        int size = input.nextInt();
        System.out.print("Enter element of array: ");
        double [] arr = new double[size];
        for(int i=0;i<size;i++){
            arr [i] = input.nextDouble();
        }
        int indexOfSmallest= min(arr);
        System.out.print("The index of smallest element is: "+ indexOfSmallest );
    }
    public static int min(double[] array){
        double small = array[0];
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]<small) {
                small = array[i];
                index = i;
            }
        }
        return index ;
    }
}
