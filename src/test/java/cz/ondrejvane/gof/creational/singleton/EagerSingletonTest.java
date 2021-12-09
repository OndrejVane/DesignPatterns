package cz.ondrejvane.gof.creational.singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EagerSingletonTest {

    private EagerSingleton eagerSingleton;

    @Before
    public void setUp() throws Exception {
        eagerSingleton = EagerSingleton.SELF;
    }

    @Test
    public void testNotNull() {
        assertNotNull(eagerSingleton);
    }

    @Test
    public void testSameObjectID() throws Exception {
        int firstID = System.identityHashCode(eagerSingleton);
        tearDown();
        setUp();
        int secondID = System.identityHashCode(eagerSingleton);

        assertEquals(firstID, secondID);
    }

    @Test
    public void foo() {
        assertEquals(eagerSingleton.foo(), "foo");
    }

    @After
    public void tearDown() throws Exception {
        eagerSingleton = null;
    }
}
