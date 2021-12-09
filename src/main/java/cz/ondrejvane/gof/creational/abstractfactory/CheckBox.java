package cz.ondrejvane.gof.creational.abstractfactory;

public abstract class CheckBox implements UIItem{
    @Override
    public String onClick() {
        return "Click check box";
    }
}
