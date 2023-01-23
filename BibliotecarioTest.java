

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BibliotecarioTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BibliotecarioTest
{
    /**
     * Default constructor for test class BibliotecarioTest
     */
    public BibliotecarioTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestBibliotecario()
    {
        Bibliotecario bibliote2 = new Bibliotecario("sebastian", "sebas", "sebas@gmail.com", 123);
        assertEquals("sebas", bibliote2.getContraseña());
        assertEquals("sebas@gmail.com", bibliote2.getCorreo());
        assertEquals("sebastian", bibliote2.getNombreUsuario());
        assertEquals(123, bibliote2.getId());
    }
}

