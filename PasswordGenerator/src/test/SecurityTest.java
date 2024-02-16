import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecurityTest {

    Security security = new Security();

    String tempPassword0 = "5kY&96i_";
    String tempPassword1 = "56A35*&%";
    String tempPassword2 = "ie9sl&57";
    String tempPassword3 = "siK&k_eY";
    String tempPassword4 = "skie85IKLK";
    String tempPassword5 = "aA9587*%";
    String tempPassword6 = "b1B*%";


    @Test
    void shouldBeSecure1(){
        Assertions.assertTrue(security.checkIfPasswordIsSecure(tempPassword0));
    }

    @Test
    void shouldBeSecure2(){
        Assertions.assertTrue(security.checkIfPasswordIsSecure(tempPassword5));
    }

    @Test
    void shouldBeSecure3(){
        Assertions.assertTrue(security.checkIfPasswordIsSecure(tempPassword6));
    }


    @Test
    void shoudNotBeSecure(){
        Assertions.assertFalse(security.checkIfPasswordIsSecure(tempPassword1));
    }

    @Test
    void shouldNotBeSecure2(){
        Assertions.assertFalse(security.checkIfPasswordIsSecure(tempPassword2));
    }

    @Test
    void shouldNotBeSecure3(){
        Assertions.assertFalse(security.checkIfPasswordIsSecure(tempPassword3));
    }

    @Test
    void shouldNotBeSecure4(){
        Assertions.assertFalse(security.checkIfPasswordIsSecure(tempPassword4));
    }


}