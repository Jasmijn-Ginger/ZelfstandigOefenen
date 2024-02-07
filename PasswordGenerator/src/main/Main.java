
public class Main {
    public static void main(String[] args) {
        Lists lists = new Lists();
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        lists.addAlleLijsten();

        int number = InputUser.askAmountOfCharacters();

        System.out.println("Your random password is: " + passwordGenerator.getSecurePassword(number));
        String again = InputUser.askRepeat();
        while (again.equals("yes") || again.equals("Yes") || again.equals("YES")){
            int number2 = InputUser.askAmountOfCharacters();
            System.out.println("Your random password is: " + passwordGenerator.getSecurePassword(number2));
            again = InputUser.askRepeat();
        }
        System.out.println("Byebye");



    }
}
