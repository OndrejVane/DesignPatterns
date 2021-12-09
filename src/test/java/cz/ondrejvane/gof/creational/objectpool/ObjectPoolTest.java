package cz.ondrejvane.gof.creational.objectpool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectPoolTest {

    ObjectPool pool;


    @Before
    public void setUp() throws Exception {
            pool = new ObjectPool(2);
    }

    @Test
    public void getDatabaseConnection() {

        DatabaseConnection databaseConnection = pool.getDatabaseConnection();
        assertNotNull(databaseConnection);
        assertEquals(pool.numberOfObjects(), 1);
        assertEquals(databaseConnection.select(), "user1");

        databaseConnection = pool.getDatabaseConnection();
        assertEquals(pool.numberOfObjects(), 0);
        assertEquals(databaseConnection.select(), "user1");

        databaseConnection = pool.getDatabaseConnection();
        assertNull(databaseConnection);
    }

    @Test
    public void releaseDatabaseConnection() {
        DatabaseConnection databaseConnection = pool.getDatabaseConnection();
        assertNotNull(databaseConnection);
        assertEquals(pool.numberOfObjects(), 1);
        assertEquals(databaseConnection.select(), "user1");

        pool.releaseDatabaseConnection(databaseConnection);
        assertEquals(pool.numberOfObjects(), 2);
        pool.releaseDatabaseConnection(databaseConnection);
        assertEquals(pool.numberOfObjects(), 2);
    }

    @After
    public void tearDown() throws Exception {
        pool = null;
    }
}
