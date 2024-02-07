import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecurityTest {

    Security security = new Security();

    String tempPassword0 = "5kY&96i_";
    String tempPassword1 = "56A35*&%";
    String tempPassword2 = "ie9sl&57";
    String tempPassword3 = "siK&k_eY";
    String tempPassword4 = "skie85IKLK";

    @Test
    void shouldBeSecure(){
        security.checkIfPasswordIsSecure(tempPassword0);
        Assertions.assertTrue(security.passWordIsSecure);
    }

    @Test
    void shoudNotBeSecure(){
        security.checkIfPasswordIsSecure(tempPassword1);
        Assertions.assertFalse(security.passWordIsSecure);
    }

    @Test
    void shouldNotBeSecure2(){
        security.checkIfPasswordIsSecure(tempPassword2);
        Assertions.assertFalse(security.passWordIsSecure);
    }

    @Test
    void shouldNotBeSecure3(){
        security.checkIfPasswordIsSecure(tempPassword3);
        Assertions.assertFalse(security.passWordIsSecure);
    }

    @Test
    void shouldNotBeSecure4(){
        security.checkIfPasswordIsSecure(tempPassword4);
        Assertions.assertFalse(security.passWordIsSecure);
    }


}