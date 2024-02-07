import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

class InputUserTest {


    private static final PrintStream standardOut = System.out;
    private static final InputStream standardIn = System.in;

    @AfterAll
    public static void reset(){
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    //nog manier vinden om te resetten. Kom er niet uit.
    @BeforeAll
    static void provideInput() {
        ByteArrayInputStream testIn = new ByteArrayInputStream("yes\r\na".getBytes());
        System.setIn(testIn);
    }



    @Test
    void givenName_whenReadFromInput_thenReturnCorrectResult() {
        //provideInput("a");
        String input = InputUser.askRepeat();
        Assertions.assertEquals("yes", input);
    }

    @Test
    void givenName_whenReadFromInput_thenReturnCorrectResult2() {
        //provideInput("a");
        String input = InputUser.askRepeat();
        Assertions.assertEquals("no", input);
    }

}