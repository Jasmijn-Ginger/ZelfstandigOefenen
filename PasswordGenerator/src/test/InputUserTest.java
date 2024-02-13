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


    @BeforeAll
    static void provideInput() {
        ByteArrayInputStream testIn = new ByteArrayInputStream("yes".getBytes());
        System.setIn(testIn);
    }



    @Disabled
    void givenAnswer_whenReadFromInput_thenReturnCorrectResult() {
        //provideInput("yes");
        String input = InputUser.askRepeat();
        Assertions.assertEquals("yes", input);
    }

    //ToDo nog steeds dezelfde fout in code: blijft hangen op eerder gegeven answer, reset niet. Glenn vragen.
}