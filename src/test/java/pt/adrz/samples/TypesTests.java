package pt.adrz.samples;

import org.junit.jupiter.api.Test;
import pt.adrz.samples.basics.Reference;
import static org.junit.jupiter.api.Assertions.*;

public class TypesTests {

    @Test
    public void pass_by_value_new_instance_test() {

        Reference ref = new Reference("first Object");

        Reference newRef = Reference.changeWithInstance(ref);

        assertNotEquals(ref, newRef);
        assertEquals("first Object", ref.field);
        assertEquals("new instance", newRef.field);
    }

    @Test
    public void pass_by_value_change_object_test() {

        Reference ref = new Reference("first Object");

        Reference.changeValue(ref, "new value");

        assertNotEquals("first Object", ref.field);
        assertEquals("new value", ref.field);
    }
}
