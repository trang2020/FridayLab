package test.java;
import main.java.CILab;
import main.java.CILabInterface;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    //if all the characters are Uppercase, method returns true
    public void detectCapitalUseTest1() {
        String testWord = myString.setString("USA");
        assertTrue(myString.detectCapitalUse());

    }
    @Test
    //if all the characters are Lowercase, method returns true
    public void detectCapitalUseTest2() {
        String testWord = myString.setString("usa");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    //if only the 1st character is uppercase, method returns true
    public void detectCapitalUseTest3() {
        String testWord = myString.setString("Usa");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    //if the number of characters that are uppercase is less than the length of the string,
    //method returns false
    public void detectCapitalUseTest4() {
        String testWord = myString.setString("uNITTEst");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    //if the only uppercase character is not the 1st character in the string, then
    //method returns false
    public void detectCapitalUseTest5() {
        String testWord = myString.setString("unittEst");
        assertFalse(myString.detectCapitalUse());
    }

}
