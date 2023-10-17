import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        double price;
        double totalCost = 0;
        boolean stop;
        Scanner in = new Scanner(System.in);
        do {
            price = SafeInput.getRangedDouble(in, "What is the cost of your item?",0,10);
            stop = !SafeInput.getYNConfirm(in, "Do you have more items?");
            totalCost = price + totalCost;
        }while(!stop);
        System.out.println("The total cost of your items are: " + totalCost);
    }
}
