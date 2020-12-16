import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {
    Applicants applicants = new Applicants(1,"Johnson","JSS1",14);
    Principal principal = new Principal(1,"Okorie");


    @Test
    void admit() {

        assertEquals("Passed, You are now a Student",principal.admit(applicants));
    }

    @Test
    void expel() {
        assertEquals("You have been expelled",principal.expel(applicants));
    }
}