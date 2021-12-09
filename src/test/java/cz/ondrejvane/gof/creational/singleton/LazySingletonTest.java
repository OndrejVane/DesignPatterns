package cz.ondrejvane.gof.creational.singleton;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {

    private LazySingleton lazySingleton;

    @Before
    public void setUp() throws Exception {
        lazySingleton = LazySingleton.getInstance();
    }

    @Test
    public void testNotNull() {
        assertNotNull(lazySingleton);
    }

    @Test
    public void testSameObjectID() throws Exception {
        int firstID = System.identityHashCode(lazySingleton);
        tearDown();
        setUp();
        int secondID = System.identityHashCode(lazySingleton);

        assertEquals(firstID, secondID);
    }

    @Test
    public void foo() {
        assertEquals(lazySingleton.foo(), "foo");
    }

    @Test
    public void getInstance() {
        assertNotNull(LazySingleton.getInstance());
    }

    @After
    public void tearDown() throws Exception {
        lazySingleton = null;
    }
}
