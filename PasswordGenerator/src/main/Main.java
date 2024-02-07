
public class Main {
    public static void main(String[] args) {
        Lists lists = new Lists();
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        lists.addAlleLijsten();

        System.out.println("Jouw gekozen wachtwoord is: " + passwordGenerator.getSecurePassword(16));


    }
}
