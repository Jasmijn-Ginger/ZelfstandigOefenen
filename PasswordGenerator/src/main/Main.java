
public class Main {
    public static void main(String[] args) {
        Lists lists = new Lists();
        PasswordGenerator passwordGenerator = new PasswordGenerator();
//

        String again = "";
        while (again.equals("yes")){
            int number = InputUser.askAmountOfCharacters();
            System.out.println("Your random password is: " + passwordGenerator.getSecurePassword(number));
            again = InputUser.askRepeat();
        }
        System.out.println("Byebye");


    }
}
