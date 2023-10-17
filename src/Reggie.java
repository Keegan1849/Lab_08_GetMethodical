import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String prompt="Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String prompt2 ="What is you m number? Be sure to include the m at the beginning.";
        String mPattern = "(M|m)\\d{5}";
        String prompt3 = "Please choose one of the options [S-Save O- Open V- View Q- Quit]";
        String choicePattern = "[OoSsVvQq]";


        String ssn = SafeInput.getRegExString(in,prompt,ssnPattern);
        System.out.println("Your SSN is: " + ssn);
        String mNumber = SafeInput.getRegExString(in,prompt2,mPattern);
        System.out.println("Your M number is: " + mNumber);
        String choice = SafeInput.getRegExString(in,prompt3,choicePattern);
        System.out.println("Your choice was: " + choice);
}
}
