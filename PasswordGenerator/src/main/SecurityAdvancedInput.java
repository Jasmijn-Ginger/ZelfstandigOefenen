public class SecurityAdvancedInput {

    public int numberOfCharInPassWord(String tempPassword, char[] list) {
        int amount = 0;
        for (char c : list) {
            String character = String.valueOf(c);
            if (tempPassword.contains(character)) {
                amount++;
            }
        }
        return amount;
    }

    public boolean checkIfPasswordIsSecure(String tempPassword, int[] amountOfCharacters) {
        int secure = 0;
        for (int i = 0; i < Lists.ALLE_LIJSTEN.size(); i++) {
            char[] tempList = Lists.ALLE_LIJSTEN.get(i);
            if (numberOfCharInPassWord(tempPassword, tempList) >= amountOfCharacters[i]) {
                secure++;
            } else {
                return false;
            }
        }
        return (secure == 4);

    }


}