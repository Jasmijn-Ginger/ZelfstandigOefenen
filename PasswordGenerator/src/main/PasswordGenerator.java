import java.util.Random;

public class PasswordGenerator {
    Security security = new Security();
    Random rand = new Random();
    StringBuilder tempPassword = new StringBuilder();
    private char[] lijst;

    //For test purposes only: chooses character based on parameters
    public char chooseRandomCharacter(int number1, int number2){
        lijst = Lists.alleLijsten.get(number1);
        return lijst[number2];
    }

    //chooses character based on random
    private char chooseRandomCharacter(){
        lijst = Lists.alleLijsten.get(rand.nextInt(Lists.alleLijsten.size()));
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
        //deletes previous temp password
        tempPassword.delete(0, tempPassword.length());
        //generates a temp password in an amount of chacters given in parameter
        generateTempPassword(numberOfCharacters);
        //checks if temp password is secure
        security.checkIfPasswordIsSecure(String.valueOf(tempPassword));
        //while password  isn't secure: it loops to resetting password, generating new one, and checking if its safe
        while (!security.passWordIsSecure){
            tempPassword.delete(0, tempPassword.length());
            for (int i=0; i < numberOfCharacters; i++){
                tempPassword.append(chooseRandomCharacter());
            }
            security.checkIfPasswordIsSecure(String.valueOf(tempPassword));
        }
        //when password of secure: it returns it as String
        return String.valueOf(tempPassword);
    }




}
