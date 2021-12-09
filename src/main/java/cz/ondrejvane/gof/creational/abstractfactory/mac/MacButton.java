package cz.ondrejvane.gof.creational.abstractfactory.mac;

import cz.ondrejvane.gof.creational.abstractfactory.Button;

public class MacButton extends Button {
    @Override
    public String render() {
        return "MacButton";
    }
}
