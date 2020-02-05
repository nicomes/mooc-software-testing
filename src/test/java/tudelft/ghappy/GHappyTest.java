package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GHappyTest {
    @Test
    public void testGGNaElkaar() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("xxggxx");
        Assertions.assertTrue(uitslag);
    }
    @Test
    public void testxxGGxGGxx() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("xxggxggxx");
        Assertions.assertTrue(uitslag);
    }
    @Test
    public void testxGGxGx() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("xxggxgxx");
        Assertions.assertTrue(uitslag);
    }
    @Test
    public void testxGGGx() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("xxgggxx");
        Assertions.assertTrue(uitslag);
    }
    @Test
    public void testxGxGGx() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("xxgxggxx");
        Assertions.assertTrue(uitslag);
    }
    @Test
    public void testxGxGxGx() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("xxgxgxgxx");
        Assertions.assertFalse(uitslag);
    }
    @Test
    public void testxGxxGxxGx() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("xxgxxgxxgxx");
        Assertions.assertFalse(uitslag);
    }
    @Test
    public void testGGxxxG() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("ggxxxg");
        Assertions.assertTrue(uitslag);
    }
    @Test
    public void testGxxxGG() {
        GHappy g = new GHappy();
        boolean uitslag = g.gHappy("gxxxgg");
        Assertions.assertTrue(uitslag);
    }
}
