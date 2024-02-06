import java.util.List;
import java.util.Random;

public class Loopdieloop {


    //Gives a random number between 0 and the lenght of the list given as parameter
    public int randomMethod(char[] lijst){
        Random rand = new Random();
        return rand.nextInt((lijst.length));
    }

    public void randomMethod(){
        System.out.println("test");
    }

    //Gives a random number between 0 and the lenght of the list given as parameter
    public int randomMethod(List lijst){
        Random rand = new Random();
        return rand.nextInt((lijst.size()));
    }

    //Returns a list with either letters, capitals, symbols or numbers
    public char[] chooseList(int randomNumber){
        return Lists.alleLijsten.get(randomNumber);
    }

    //Returns a random character
    public String chooseCharacter(int randomNumber, char[] lijst){
        return new String(String.valueOf(lijst[randomNumber]));
    }

//    Generates a password containing different characters, in the asked lenght
    public String generatePassword(int numberOfCharacters, int randomNumber1, int randomNumber2){
        String wachtwoord = "";
        for (int i=0; i < numberOfCharacters; i++){
            wachtwoord += chooseList(randomNumber1)[randomNumber2];
        }
        return wachtwoord;
    }

}
