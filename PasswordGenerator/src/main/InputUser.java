import java.util.Scanner;

public class InputUser {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInputUser() {
        System.out.println("How many characters do you want your password to contain? ");
        int input = scanner.nextInt();
        return input;
    }
}
