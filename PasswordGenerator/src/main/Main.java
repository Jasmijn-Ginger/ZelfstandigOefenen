
public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        String again = "";
        while (again.equals("yes")){
            int number = InputUser.askAmountOfCharacters();
            System.out.println("Your random password is: " + passwordGenerator.getSecurePassword(number));
            again = InputUser.askRepeat();
        }
        System.out.println("Byebye");


    }
}
