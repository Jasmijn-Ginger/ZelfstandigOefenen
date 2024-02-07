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
        Assertions.assertEquals(12, passwordGenerator.getSecurePassword(4).length());
    }

    @Test
    void testPasswords(){
        System.out.println(passwordGenerator.getSecurePassword(10));
        System.out.println(passwordGenerator.getSecurePassword(8));
        System.out.println(passwordGenerator.getSecurePassword(7));
        System.out.println(passwordGenerator.getSecurePassword(6));
        System.out.println(passwordGenerator.getSecurePassword(5));
        System.out.println(passwordGenerator.getSecurePassword(4));
        System.out.println(passwordGenerator.getSecurePassword(12));

    }


//

}