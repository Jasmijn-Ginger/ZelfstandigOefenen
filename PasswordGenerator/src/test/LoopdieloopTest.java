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
    void generatePasswordTest(){
        Assertions.assertTrue(loopdieloop.generatePassword(16).length()==16);
    }

    @Test
    void chooseRandomCharacterTest(){
        loopdieloop.chooseRandomCharacter(2, 5);
        Assertions.assertEquals('5', loopdieloop.character);
    }

//

}