
public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        boolean again = true;
        while (again){
            int number = InputUser.askAmountOfCharacters();
            System.out.println("Your random password is: " + passwordGenerator.getSecurePassword(number));
            again = "yes".equals(InputUser.askRepeat());
        }
        System.out.println("Byebye");


    }
}
