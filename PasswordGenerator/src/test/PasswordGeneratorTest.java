import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PasswordGeneratorTest {

    static Lists lists = new Lists();
    PasswordGenerator passwordGenerator = new PasswordGenerator();

    @BeforeAll
    static void addLists(){
            lists.addAlleLijsten();}

    @Test
    void generatePasswordTest(){
        passwordGenerator.generateTempPassword(16);
        Assertions.assertTrue(passwordGenerator.tempPassword.length()==16);
    }

    @Test
    void chooseRandomCharacterTest(){
        Assertions.assertEquals('5', passwordGenerator.chooseRandomCharacter(2, 5));
    }

    @Test
    void wallOfDefenceTest(){
        passwordGenerator.getSecurePassword(12);
        System.out.println(passwordGenerator.tempPassword);
    }

//

}