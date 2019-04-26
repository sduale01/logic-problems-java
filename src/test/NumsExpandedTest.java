package test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import main.NumsExpanded;

public class NumsExpandedTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", NumsExpanded.expandedForm(12)); 
        assertEquals("40 + 2", NumsExpanded.expandedForm(42)); 
        assertEquals("70000 + 300 + 4", NumsExpanded.expandedForm(70304)); 
    }
}