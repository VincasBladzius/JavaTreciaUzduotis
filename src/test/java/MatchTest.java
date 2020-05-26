import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import players.Player;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class MatchTest {
    ArrayList<Player> roster = new ArrayList<>();
    Match match = new Match();
    @Before
    public void setUp() throws Exception {

        Player player1 = new Player("TestNameOne", "TestLastName", "TestNationality", 5);
        Player player2 = new Player("TestNameTwo", "TestLastName", "TestNationality", 5);
        Player player3 = new Player("TestNameThree", "TestLastName", "TestNationality", 5);
        Player player4 = new Player("TestNameFour", "TestLastName", "TestNationality", 5);
        Player player5 = new Player("TestNameFive", "TestLastName", "TestNationality", 5);
        roster.add(player1);
        roster.add(player2);
        roster.add(player3);
        roster.add(player4);
        roster.add(player5);
    }

    @Test
    public void setHostScore() {
        match.setHostScore(roster);
        assertEquals(25, match.getHostScore(), 150);
    }


    @Test
    public void setVisitorScore() {
        match.setHostScore(roster);
        assertEquals(25, match.getHostScore(), 150);
    }

    @Test
    public void setMatchScore() {
        assertEquals(25, match.setMatchScore(roster), 150);
    }

    @Test
    public void setHostName() {
        match.setHostName(roster.get(0).getNationality());
        assertEquals("TestNationality", match.getHostName());
    }

    @Test
    public void setVisitorName() {
        match.setVisitorName(roster.get(0).getNationality());
        assertEquals("TestNationality", match.getVisitorName());
    }
}