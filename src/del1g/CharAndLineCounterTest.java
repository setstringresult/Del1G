package del1g;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CharAndLineCounterTest {
    @Test
    public void testCountLines() {
        CharAndLineCounter counter = new CharAndLineCounter();
        counter.count("Hi");
        assertEquals(1,counter.getLineCounter());
        counter.count("Bye");
        assertEquals(2,counter.getLineCounter());
    }
    @Test
    public void testCountChar() {
        CharAndLineCounter counter = new CharAndLineCounter();
        counter.count("Hi");
        assertEquals(2,counter.getCharCounter());
        counter.count("Bye");
        assertEquals(5,counter.getCharCounter());
        counter.count("1234");
        assertEquals(9,counter.getCharCounter());


    }

    @Test
    public void testIsStopWord() {
        CharAndLineCounter counter = new CharAndLineCounter();
        assertEquals(true,counter.isStopWord("stop") );
        assertEquals(false, counter.isStopWord("hello") );

    }

}



