import java.util.Scanner;

public class InputUser {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int askAmountOfCharacters() {
        System.out.println("How many characters do you want your password to contain? It must be at least 4.");
        return SCANNER.nextInt();
    }

    public static String askRepeat(){
        System.out.println("Do you want another password? ");
        return SCANNER.next();
    }

    //ToDo write tests for this class
}
