package cz.ondrejvane.gof.creational.abstractfactory.win;

import cz.ondrejvane.gof.creational.abstractfactory.Button;

public class WinButton extends Button {
    @Override
    public String render() {
        return "WinButton";
    }
}
