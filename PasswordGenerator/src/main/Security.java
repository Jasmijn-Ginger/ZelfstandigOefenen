public class Security {

    Lists lists = new Lists();

    public boolean charinPassWord(char[] list, String passWord){
        int inPassWord = 0;
        for (char c : list) {
            String letter = String.valueOf(c);
            if (passWord.contains(letter)) {
                inPassWord++;
            }
            if (inPassWord > 0) {
                return true;
            }
        }
        return false;
    }

//    public boolean checkIfPasswordIsSecure(String passWord){
//        int secure = 0;
//        for (char[] l : Lists.ALLE_LIJSTEN) {
//            if (charinPassWord(l, passWord)){
//                secure++;
//            }
//        }
//        return secure == 4;
//    }

    public boolean checkIfPasswordIsSecure(String passWord){
        int secure = 0;
        for (char[] l : Lists.ALLE_LIJSTEN) {
            if (charinPassWord(l, passWord)){
                secure++;
            }
        }
        return secure == 4;
    }


//nu: twee methods proberen samen te voegen

}
