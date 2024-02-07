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

    public String getSecurePassword(int numberOfCharacters){
        tempPassword.delete(0, tempPassword.length());
        generateTempPassword(numberOfCharacters);
        security.checkIfPasswordIsSecure(String.valueOf(tempPassword));
        while (!security.passWordIsSecure){
            tempPassword.delete(0, tempPassword.length());
            for (int i=0; i < numberOfCharacters; i++){
                tempPassword.append(chooseRandomCharacter());
            }
            security.checkIfPasswordIsSecure(String.valueOf(tempPassword));
        }
        return String.valueOf(tempPassword);
    }




}
