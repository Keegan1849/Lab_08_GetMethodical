import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.println("What is your message?");
        String msg =in.nextLine();
        PrettyHeader.prettyHeader(msg);
    }


    public static void prettyHeader(String msg) {

        int msgLength = msg.length();
        int center = (60 - (msgLength + 6)) / 2;
        int maxLength =60 - msgLength;

        for (int row = 1; row <= 60; row++) {
            System.out.print("*");
        }
        System.out.println();

        for (int row = 1; row <= 60; row++) {
            if (row == 1 || row == 2 || row == 3 || row == (maxLength-2) || row == (maxLength-1) || row==maxLength) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (row == center){
                System.out.print(msg);
            }
        }
        System.out.println();
        for (int row = 1; row <= 60; row++) {
            System.out.print("*");
        }

    }
}