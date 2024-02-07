public class Security {

    Lists lists = new Lists();
    boolean passWordIsSecure = true;
    private int smallLettersInPassword;
    private int bigLettersInPassword;
    private int numbersInPassword;
    private int symbolsInPassword;
    public void checkIfPasswordIsSecure(String passWord){
        smallLettersInPassword = 0;
        bigLettersInPassword = 0;
        numbersInPassword = 0;
        symbolsInPassword = 0;

        /*checks to see if there are small letters in pw:
            -if there are it moves on to the next list: big letters
            -if there aren't any the password isn't safe: passWordIsSecure will be false and the loop stops.
         */
        for (int i = 0; i < lists.getListTinyLetters().length; i++) {
            String var = String.valueOf(lists.getListTinyLetters()[i]);
            if (passWord.contains(var)) {
                smallLettersInPassword++;
            }
            if (smallLettersInPassword > 0) {
                break;
            }
        }
        if (smallLettersInPassword == 0) {
            passWordIsSecure = false;
            return;
        }
          /*checks to see if there are big letters in pw:
            -if there are it moves on to the next list: numbers
            -if there aren't any the password isn't safe: passWordIsSecure will be false and the loop stops.
         */
        for (int i = 0; i < lists.getListBigLetters().length; i++) {
            String var = String.valueOf(lists.getListBigLetters()[i]);
            if (passWord.contains(var)) {
                bigLettersInPassword++;
            }
            if (bigLettersInPassword > 0) {
                break;
            }
        }
        if (bigLettersInPassword == 0) {
            passWordIsSecure = false;
            return;
        }
          /*checks to see if there are numbers in pw:
            -if there are it moves on to the next list: symbols
            -if there aren't any the password isn't safe: passWordIsSecure will be false and the loop stops.
         */
        for (int i = 0; i < lists.getListNumbers().length; i++) {
            String var = String.valueOf(lists.getListNumbers()[i]);
            if (passWord.contains(var)) {
                numbersInPassword++;
            }
            if (numbersInPassword > 0) {
                break;
            }
        }
        if (numbersInPassword == 0) {
            passWordIsSecure = false;
            return;
        }
         /*checks to see if there are symbols in pw:
            -if there are, passWordIsSecure will be true.
            -if there aren't any the password isn't safe: passWordIsSecure will be false.
         */
        for (int i = 0; i < lists.getListSymbols().length; i++) {
            String var = String.valueOf(lists.getListSymbols()[i]);
            if (passWord.contains(var)) {
                symbolsInPassword++;
            }
            if (symbolsInPassword > 0) {
                break;
            }
        }
        if (symbolsInPassword == 0) {
            passWordIsSecure = false;
        }
        else{passWordIsSecure = true;}

    }
}
