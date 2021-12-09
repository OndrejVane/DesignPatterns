package cz.ondrejvane.gof.creational.abstractfactory.win;

import cz.ondrejvane.gof.creational.abstractfactory.CheckBox;

public class WinCheckBox extends CheckBox {
    @Override
    public String render() {
        return "WinCheckBox";
    }
}
