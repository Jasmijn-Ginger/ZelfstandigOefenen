import java.util.List;

public class Security {

    public boolean checkIfPasswordIsSecure(String passWord){
        int secure = 0;
        for (char[] list : Lists.ALLE_LIJSTEN) {
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
