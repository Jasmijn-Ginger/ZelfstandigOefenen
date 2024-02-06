import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopdieloopTest {

    static Lists lists = new Lists();
    Loopdieloop loopdieloop = new Loopdieloop();

    @BeforeAll
    static void addLists(){
            lists.addAlleLijsten();}


    @Test
    void randomMethod() {
        Assertions.assertTrue(loopdieloop.randomMethod(lists.getListBigLetters())<lists.getListBigLetters().length && loopdieloop.randomMethod(lists.getListBigLetters()) >= 0);
    }

    @Test
    void chooseListTest(){
        Assertions.assertEquals(lists.getListNumbers(), loopdieloop.chooseList(2));
    }

    @Test
    void chooseListTest2(){
        Assertions.assertEquals(lists.getListBigLetters(), loopdieloop.chooseList(1));
    }

    @Test
    void chooseCharacterTest(){
        Assertions.assertEquals("c", loopdieloop.chooseCharacter(2, lists.getListTinyLetters()));
    }

    @Test
    void chooseCharacterTest2(){
        Assertions.assertEquals("%", loopdieloop.chooseCharacter(3, lists.getListSymbols()));
    }

    @Test
    void generatePasswordTest(){
        Assertions.assertEquals("4444", loopdieloop.generatePassword(4, 2, 3));
    }

    @Test
    void generatePasswordTest2(){
        Assertions.assertEquals("FFFFFF", loopdieloop.generatePassword(6, 1, 5));
    }
}