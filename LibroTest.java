

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LibroTest
{
    /**
     * Default constructor for test class LibroTest
     */
    public LibroTest()
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
    public void Testlibro()
    {
        Libro libro1 = new Libro("cien años de soledad", "Gabriel Garcia", "Realismo magico", 1967);
        
        assertEquals("Realismo magico", libro1.getCategoria());
        assertEquals(1967, libro1.getAñoPublicacion());
        assertEquals("Gabriel Garcia", libro1.getAutor());
        assertEquals("cien años de soledad", libro1.getNombre());
    }
}

