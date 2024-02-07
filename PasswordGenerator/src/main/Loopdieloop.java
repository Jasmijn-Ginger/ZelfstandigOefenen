import java.util.List;
import java.util.Random;

public class Loopdieloop {

    char[] lijst;
    char character;

    Random rand = new Random();

    //For test purposes only: chooses character based on parameters
    public void chooseRandomCharacter(int number1, int number2){
        lijst = Lists.alleLijsten.get(number1);
        character = lijst[number2];
    }

    //chooses character based on random
    private void chooseRandomCharacter(){
        lijst = Lists.alleLijsten.get(rand.nextInt(Lists.alleLijsten.size()));
        character = lijst[rand.nextInt(lijst.length)];
    }


//    Generates a password containing different characters, in the asked length
    public String generatePassword(int numberOfCharacters){
        String wachtwoord = "";
        for (int i=0; i < numberOfCharacters; i++){
            chooseRandomCharacter();
            wachtwoord += character;
        }
        return wachtwoord;
    }


}
