package cz.ondrejvane.gof.structural.adapter;

/**
 * Třída, která bude adaptována na metry
 */
public class CentimeterAreaMeter implements AdapteeInterface{

    @Override
    public int centimeterArea(int length, int width) {
        return length * width;
    }
}
