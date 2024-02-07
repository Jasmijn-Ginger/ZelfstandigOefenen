import java.util.Random;

public class Loopdieloop {
    Lists lists = new Lists();
    char[] lijst;
    Random rand = new Random();
    StringBuilder tempPassword = new StringBuilder();

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
    public void generateTempPassword(int numberOfCharacters){
        for (int i=0; i < numberOfCharacters; i++){
            tempPassword.append(chooseRandomCharacter());
        }
    }

    public boolean checkIfPasswordContainsSmallLetters(String passWord){
        for (int i = 0; i<lists.getListTinyLetters().length; i++){
            String var = String.valueOf(lists.getListTinyLetters()[i]);
            if (passWord.toString().contains(var)){
                return true;
            }
        }
        return false;
    }
//
//    public boolean checkIfPasswordContainsBigLetters(String passWord){
//        for (int i = 0; i<lists.getListBigLetters().length; i++){
//            String var = String.valueOf(lists.getListBigLetters()[i]);
//            if (passWord.toString().contains(var)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean checkIfPasswordContainsNumbers(String passWord){
//        for (int i = 0; i<lists.getListNumbers().length; i++){
//            String var = String.valueOf(lists.getListNumbers()[i]);
//            if (passWord.toString().contains(var)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean checkIfPasswordContainsSymbols(String passWord){
//        for (int i = 0; i<lists.getListSymbols().length; i++){
//            String var = String.valueOf(lists.getListSymbols()[i]);
//            if (passWord.toString().contains(var)){
//                return true;
//            }
//        }
//        return false;
//    }
//


}
