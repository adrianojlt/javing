package pt.adrz.samples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringsTests {

    @Test
    public void string_references_01() {

        String x = "100";
        String y = x;
        x += 5;

        StringBuffer s1 = new StringBuffer("100");
        StringBuffer s2 = s1;
        s1.append("5");

        assertNotSame(x, y);
        assertSame(s1, s2);
        assertEquals("1005", s1.toString());
        assertEquals("1005", s2.toString());
    }

    /**
     * Whenever you create a string object using string literal,
     * that object is stored in the string constant pool and whenever you create a string object using new keyword
     * such object is stored in the heap memory.
     */
    @Test
    public void string_references_02() {

        // String literal stored in runtime constant pool (string pool)
        String s1 = "asdf";
        String s2 = "asdf";

        // allocated in the heap memory
        // Creating string objects using new operator
        // Here you are saying: "No, JVM. I dont want to use the
        // String pool. Create instead a new String object
        String s3 = new String("asdf");
        String s4 = new String("asdf");

        // force JVM to add this to the String Pool
        String s5 = new String("asdf").intern();

        assertSame(s1, s2);
        assertNotSame(s1, s3);
        assertNotSame(s3, s4);
        assertSame(s1, s5);
        assertEquals(s1, "asdf");
        assertEquals(s2, "asdf");
        assertEquals("asdf", s3);
        assertEquals("asdf", s4);
    }
}
