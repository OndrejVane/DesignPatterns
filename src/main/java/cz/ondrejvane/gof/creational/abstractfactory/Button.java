package cz.ondrejvane.gof.creational.abstractfactory;

public abstract class Button implements UIItem {

    @Override
    public String onClick() {
        return "Click button";
    }
}
