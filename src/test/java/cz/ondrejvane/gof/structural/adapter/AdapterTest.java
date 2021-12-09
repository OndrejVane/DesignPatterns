package cz.ondrejvane.gof.structural.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {
    @Test
    public void testAdapter() {
        RequiredInterface requiredInterface = new MetricAreaMeter();
        assertEquals(1,requiredInterface.meterArea(100, 100));
    }
}
