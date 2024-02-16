import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecurityAdvancedInputTest {

    SecurityAdvancedInput security = new SecurityAdvancedInput();

    String tempPassword0 = "5kY&96i_";
    String tempPassword1 = "5a6-A3P*&%";
    String tempPassword2 = "ie-PO&57";
    String tempPassword3 = "siK&k_eY";
    String tempPassword4 = "skie85IKLK";
    String tempPassword5 = "aA9587*%";
    String tempPassword6 = "b1B*%";

    int[] input1 = {1, 1, 1, 1};
    int[] input2 = {1, 2, 3, 4};
    int[] input3 = {2, 2, 2, 2};



    @Test
    void shouldBeSecure1(){
        Assertions.assertTrue(security.checkIfPasswordIsSecure(tempPassword0, input1));
    }

    @Test
    void shouldBeSecure2(){
        Assertions.assertTrue(security.checkIfPasswordIsSecure(tempPassword1, input2));
    }

    @Test
    void shouldBeSecure3(){
        Assertions.assertTrue(security.checkIfPasswordIsSecure(tempPassword2, input3));
    }


    @Test
    void shoudNotBeSecure(){
        Assertions.assertFalse(security.checkIfPasswordIsSecure(tempPassword0, input1));
    }

    @Test
    void shouldNotBeSecure2(){
        Assertions.assertFalse(security.checkIfPasswordIsSecure(tempPassword2, input2));
    }

    @Test
    void shouldNotBeSecure3(){
        Assertions.assertFalse(security.checkIfPasswordIsSecure(tempPassword3, input3));
    }




}