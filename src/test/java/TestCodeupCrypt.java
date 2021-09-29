import org.junit.Test;
import static org.junit.Assert.*;

public class TestCodeupCrypt {

    @Test
    public void testVersion(){
        //delta refers to the amount of difference we are willing to accept
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.0;
        assertEquals(1.0, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("", CodeupCrypt.hashPassword(""));
        assertEquals("444", CodeupCrypt.hashPassword("444"));
        assertEquals("333", CodeupCrypt.hashPassword("333"));
        assertEquals("c4t", CodeupCrypt.hashPassword("cat"));
        assertEquals("c4t", CodeupCrypt.hashPassword("cAt"));
        assertEquals("c0d39p", CodeupCrypt.hashPassword("codeup"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue(CodeupCrypt.checkPassword("c4t", "cat"));
        assertFalse(CodeupCrypt.checkPassword("c4t", "ca"));
    }
}
