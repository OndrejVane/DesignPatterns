package cz.ondrejvane.gof.creational.abstractfactory.mac;

import cz.ondrejvane.gof.creational.abstractfactory.Button;
import cz.ondrejvane.gof.creational.abstractfactory.CheckBox;
import cz.ondrejvane.gof.creational.abstractfactory.UIFactory;

public class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
