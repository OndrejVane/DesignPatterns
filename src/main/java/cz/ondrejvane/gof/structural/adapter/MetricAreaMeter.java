package cz.ondrejvane.gof.structural.adapter;

public class MetricAreaMeter implements RequiredInterface {

    private AdapteeInterface adapteeInterface;

    public MetricAreaMeter() {
        this.adapteeInterface = new CentimeterAreaMeter();
    }

    @Override
    public int meterArea(int length, int width) {
        return adapteeInterface.centimeterArea(length,  width) / 10000;
    }
}
