

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class NBALeagueTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NBALeagueTest
{
    private NBALeague nBALeagu1;

    /**
     * Default constructor for test class NBALeagueTest
     */
    public NBALeagueTest()
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
        nBALeagu1 = new NBALeague();
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
}
