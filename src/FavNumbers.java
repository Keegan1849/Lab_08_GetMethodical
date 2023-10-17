import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int favInt;
        double favDbl;

        favInt = SafeInput.getInt(in,"What is your favorite integer? ");
        favDbl = SafeInput.getDouble(in, "What is your favorite double value?");

        System.out.println("Your favorite integer is: " + favInt + " Your favorite double value is: " + favDbl);
    }
}