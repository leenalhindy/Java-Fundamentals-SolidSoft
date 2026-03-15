import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose:");
        System.out.println("1.Hexadecimal to decimal ");
        System.out.println("2.Decimal to hexadecimal");
        int choose = scan.nextInt();
        if( choose == 1){
            System.out.print("Enter Hexadecimal value: ");
            scan.nextLine();
            String hexa = scan.nextLine();
            int dec = HToD(hexa);
            System.out.print(" The Decimal value is: "+dec);
        }
        else{
            System.out.print("Enter Decimal value: ");
            int dec = scan.nextInt();
            String hexa = DToH(dec);
            System.out.print(" The Hexadecimal value is: "+hexa);
        }

    }

    public static String DToH(int dec) {
        String hexa = "";
        if (dec == 0) hexa = "0";
        char h;
        while (dec != 0) {
            int remain = dec % 16;
            if (remain <= 9) {
                h = (char) (remain + '0');
            } else
                h = (char) (remain - 10 + 'A');
            dec /= 16;
            hexa = h + hexa;
        }
        return hexa;
    }

    public static int HToD(String hexa) {
        int result = 0;
        hexa = hexa.toUpperCase();

        for (int i = 0; i < hexa.length(); i++) {
            char h = hexa.charAt(i);
            int value;

            if (h >= '0' && h <= '9') {
                value = h - '0';
            } else {
                value = h - 'A' + 10;
            }


            result = result * 16 + value;
        }
        return result;
    }
}
