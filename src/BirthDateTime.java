import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year;
        int month;
        int day;
        int hour;
        int minutes;
        int monthLength=0;

        year = SafeInput.getRangedInt(in,"What is your birth year?",1950,2010);
        month = SafeInput.getRangedInt(in,"What is your birth month?",1,12);
        monthLength = BirthDateTime.monthLength(month);
        day = SafeInput.getRangedInt(in,"What is your birth day?",1,monthLength);
        hour = SafeInput.getRangedInt(in,"What was your birth hour?",0,23);
        minutes = SafeInput.getRangedInt(in,"How many minutes has passed?",0,59);


        System.out.println("Your birth date is " + month + "/" + day + "/" + year + " at " + hour + ":" + minutes);

    }
    public static int monthLength(int month){
        int monthLength=0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                monthLength = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                monthLength = 30;
                break;
            case 2:
                monthLength = 28;
                break;
            default:
                System.out.println("\n Please enter Valid Number between 1 to 12");

        }
        return monthLength;
    }
}