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
        Assertions.assertEquals(16, passwordGenerator.tempPassword.length());
    }

    @Test
    void chooseRandomCharacterTest(){
        Assertions.assertEquals('5', passwordGenerator.chooseRandomCharacter(2, 5));
    }

    @Test
    void generateSecurePasswordTest(){
        Assertions.assertEquals(12, passwordGenerator.getSecurePassword(12).length());

    }

//

}