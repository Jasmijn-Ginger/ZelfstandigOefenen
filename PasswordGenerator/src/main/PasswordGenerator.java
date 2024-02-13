import java.util.List;
import java.util.Random;

public class PasswordGenerator {
    Security security = new Security();
    Random rand = new Random();
    StringBuilder tempPassword = new StringBuilder();

    //For test purposes only: chooses character based on parameters
    public char chooseRandomCharacter(int number1, int number2){
        char[] lijst = Lists.ALLE_LIJSTEN.get(number1);
        return lijst[number2];
    }

    //chooses character based on random
    private char chooseRandomCharacter(){
        char[] lijst = Lists.ALLE_LIJSTEN.get(rand.nextInt(Lists.ALLE_LIJSTEN.size()));
        return lijst[rand.nextInt(lijst.length)];

    }

    //    Generates a password containing different characters, in the asked length
    public void generateTempPassword(int numberOfCharacters) {
        for (int i = 0; i < numberOfCharacters; i++) {
            tempPassword.append(chooseRandomCharacter());
        }
    }

    //Generates a temp password. checks if the temp password is secure. If not, it generates another password. If it's secure it return the password as string
           public String getSecurePassword(int numberOfCharacters){
            //while password  isn't secure: it loops to resetting password, generating new one, and checking if its safe
            while (!security.passWordIsSecure){
                tempPassword.delete(0, tempPassword.length());
                //generates a temp password in an amount of chacters given in parameter
                generateTempPassword(numberOfCharacters);
                //checks if temp password is secure
                security.checkIfPasswordIsSecure(tempPassword.toString());
            }
            //when password of secure: it returns it as String
            return tempPassword.toString();
        }
    }




}
