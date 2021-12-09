package cz.ondrejvane.gof.creational.objectpool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseConnectionTest {

    @Test
    public void select() {
        assertEquals("user1", new DatabaseConnection().select());
    }
}
