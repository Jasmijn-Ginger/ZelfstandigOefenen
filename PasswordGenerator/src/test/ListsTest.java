import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListsTest {

    Lists lijsten = new Lists();
   @Test
    void getListTinyLetters() {
       String checkingcontent = "";
       for (int i = 0; i < lijsten.getListTinyLetters().length; i++){
           checkingcontent += lijsten.getListTinyLetters()[i];
       }
       Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz", checkingcontent);
    }

    @Test
    void getListBigLetters() {
        String checkingcontent = "";
        for (int i = 0; i < lijsten.getListBigLetters().length; i++){
            checkingcontent += lijsten.getListBigLetters()[i];
        }
        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz".toUpperCase(), checkingcontent);
    }

    @Test
    void getListNumbers() {
        String checkingcontent = "";
        for (int i = 0; i < lijsten.getListNumbers().length; i++){
            checkingcontent += lijsten.getListNumbers()[i];
        }
        Assertions.assertEquals("123456789", checkingcontent);
    }

    @Test
    void getListSymbols() {
        String checkingcontent = "";
        for (int i = 0; i < lijsten.getListSymbols().length; i++){
            checkingcontent += lijsten.getListSymbols()[i];
        }
        Assertions.assertEquals("-_*%$#@!&", checkingcontent);
    }

    @Test
    void getAlleLijstenTest(){
       lijsten.addAlleLijsten();
        Assertions.assertTrue(lijsten.getAlleLijsten().size()==4);
    }
}