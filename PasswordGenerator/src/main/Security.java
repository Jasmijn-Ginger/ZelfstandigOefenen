public class Security {

    public boolean checkIfPasswordIsSecure(String passWord){
        int secure = 0;
        for (int i = 0; i<Lists.ALLE_LIJSTEN.size(); i++) {
            char[] tempList = Lists.ALLE_LIJSTEN.get(i);
            for (char c : tempList) {
                String character = String.valueOf(c);
                if (passWord.contains(character)) {
                    secure++;
                    break;
                }
            }
            if (secure != i+1){return false;}
        }
        return secure == 4;
    }


}
