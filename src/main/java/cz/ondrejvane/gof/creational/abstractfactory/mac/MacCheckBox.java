package cz.ondrejvane.gof.creational.abstractfactory.mac;

import cz.ondrejvane.gof.creational.abstractfactory.CheckBox;

public class MacCheckBox extends CheckBox {
    @Override
    public String render() {
        return "MacCheckBox";
    }
}
