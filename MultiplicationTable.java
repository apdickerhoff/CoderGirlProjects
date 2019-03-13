import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Tables \n");
        System.out.println("How large would you like to see them? ");
        int n = keyboard.nextInt();
        int product;

        for (int i = 0; i <= n; i++) {
            {
                for (int j = 0; j <= i; j++) {
                    product = i * j;
                    System.out.println(i + " x " + j + " = " + product);
                }
            }
        }
    }
}