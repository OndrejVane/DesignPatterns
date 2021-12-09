package cz.ondrejvane.gof.creational.abstractfactory.win;

import cz.ondrejvane.gof.creational.abstractfactory.Button;
import cz.ondrejvane.gof.creational.abstractfactory.CheckBox;
import cz.ondrejvane.gof.creational.abstractfactory.UIFactory;

public class WinFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
