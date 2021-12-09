package cz.ondrejvane.gof.creational.objectpool;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Návrhový vzor Object pool (Fond) použijeme, potřebujeme-li omezit počet vytvářených instancí.
 *
 * @author ondrejvane
 */
public class ObjectPool {

    private Queue<DatabaseConnection> pool;
    private int capacity;

    public ObjectPool(int capacity) {
        this.capacity = capacity;
        pool = new LinkedList<>();
        for (int i = 0; i < this.capacity; i++) {
            pool.add(new DatabaseConnection());
        }
    }

    public synchronized DatabaseConnection getDatabaseConnection() {
        return pool.poll();
    }

    public synchronized void releaseDatabaseConnection(DatabaseConnection databaseConnection) {
        if (pool.size() == capacity)
            return;
        pool.add(databaseConnection);
    }

    public int numberOfObjects() {
        return pool.size();
    }
}
