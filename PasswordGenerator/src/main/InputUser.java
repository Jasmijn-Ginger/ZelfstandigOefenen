import java.util.Scanner;

public class InputUser {

    private static final Scanner SCANNER = new Scanner(System.in);

    //asks in terminal amount of characters
    public static int askAmountOfCharacters() {
        System.out.println("How many characters do you want your password to contain? It must be at least 4.");
        return SCANNER.nextInt();
    }

    //asks in terminal if you want another password
    public static String askRepeat(){
        System.out.println("Do you want another password? ");
        return SCANNER.next().toLowerCase();
    }

//ToDo put an exception when input isn't valid
}
