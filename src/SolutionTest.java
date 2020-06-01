import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class SolutionTest {
    @Test
    public void test1() {
      Solution pc = new Solution();
      assertEquals("15", pc.NumToString(15));
    }

    @Test
    public void test2() {;
      Solution pc = new Solution();
      assertEquals("196", pc.NumToString(196));
    }

    @Test
    public void test3() {;
      Solution pc = new Solution();
      assertEquals("722", pc.NumToString(722));
    }
    
    @Test
    public void test4() {;
      Solution pc = new Solution();
      assertEquals("3456", pc.NumToString(3456));
    }
}