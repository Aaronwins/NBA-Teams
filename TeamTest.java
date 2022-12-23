

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TeamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TeamTest
{
    private Team team1;

    /**
     * Default constructor for test class TeamTest
     */
    public TeamTest()
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
        team1 = new Team("Cleveland Cavs", 74, 200, "J.B. Bickerstaff", 2, 21, 11);
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
