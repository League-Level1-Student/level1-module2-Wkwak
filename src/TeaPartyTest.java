import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
	public static void main(String[] args) {
		TeaParty tp = new TeaParty();
		tp.welcome("Austen", true, false);
		tp.welcome("Orwell", true, false);
		tp.welcome("Isaac Newton", false, true);
	}
	/**
     * Jane Austen is a woman, so say “Hello Ms. Austen”. 
     * George Orwell is a man, so say “Hello Mr. Orwell”. 
     * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
     **/

    @Test
    public void test() {
            TeaParty teaParty = new TeaParty();
            String greeting = teaParty.welcome(null, false, false);
            assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
            assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
            assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
    }
}
