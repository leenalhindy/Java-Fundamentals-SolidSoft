import java.util.Scanner;

public class Exercise7_1 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int numOfStudent = input.nextInt();
        int[] score = new int[numOfStudent];

        System.out.print("Enter " + numOfStudent + " scores: ");
        int best = 0;


        for(int i = 0; i < numOfStudent; i++){
            score[i] = input.nextInt();
            if(score[i] > best)
                best = score[i];
        }

        for (int j = 0; j < numOfStudent; j++){
            char grade;
            if(score[j] >= best - 10)
                grade = 'A';
            else if (score[j] >= best - 20)
                grade = 'B';
            else if(score[j] >= best - 30)
                grade = 'C';
            else if(score[j] >= best - 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("Student " + j + " score is " + score[j] +
                    " and grade is " + grade);
        }
    }
}