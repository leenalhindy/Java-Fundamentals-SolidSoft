import java.util.Scanner;
public class Exercise03_17 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random()*3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int guess = input.nextInt();
        if (guess == random) {
            System.out.println("The computer is " + random + ". It is a draw.");
        }
        else if ((guess == 0 && random == 2) || (guess == 1 && random == 0) || (guess == 2 && random == 1)) {
            System.out.println("The computer is " + random + ". You won!");
        }
        else {
            System.out.println("The computer is " + random + ". You lost.");
        }
    }




    }

