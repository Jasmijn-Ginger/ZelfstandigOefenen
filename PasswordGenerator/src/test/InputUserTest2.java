import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

class InputUserTest2 {


    private static final PrintStream standardOut = System.out;
    private static final InputStream standardIn = System.in;

    @AfterAll
    public static void reset(){
        System.setOut(standardOut);
        System.setIn(standardIn);
    }


    @BeforeAll
    static void provideInput() {
        ByteArrayInputStream testIn = new ByteArrayInputStream("12".getBytes());
        System.setIn(testIn);
    }



    @Test
    void givenAnswer_whenReadFromInput_thenReturnCorrectResult() {
        //provideInput("yes");
        String input = String.valueOf(InputUser.askAmountOfCharacters());
        Assertions.assertEquals("12", input);
    }


}