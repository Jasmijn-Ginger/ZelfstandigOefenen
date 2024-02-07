import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LoopdieloopTest {

    static Lists lists = new Lists();
    Loopdieloop loopdieloop = new Loopdieloop();
    String tempPassword = "iI1$5kT9";
    String tempPassword2 = "I9K&_12@";

    @BeforeAll
    static void addLists(){
            lists.addAlleLijsten();}

    @Test
    void generatePasswordTest(){
        loopdieloop.generateTempPassword(16);
        Assertions.assertTrue(loopdieloop.tempPassword.length()==16);
    }

    @Test
    void chooseRandomCharacterTest(){
        Assertions.assertEquals('5', loopdieloop.chooseRandomCharacter(2, 5));
    }

    @Test
    void checkIfPassWordContainsSmallLetters(){
        Assertions.assertTrue(loopdieloop.checkIfPasswordContainsSmallLetters(tempPassword));
    }

    @Test
    void checkIfPasswordDoesntContainSmallLetters(){
        Assertions.assertFalse(loopdieloop.checkIfPasswordContainsSmallLetters(tempPassword2));
    }

//

}