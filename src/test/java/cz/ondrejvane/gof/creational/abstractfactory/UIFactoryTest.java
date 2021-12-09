package cz.ondrejvane.gof.creational.abstractfactory;

import cz.ondrejvane.gof.creational.abstractfactory.mac.MacFactory;
import cz.ondrejvane.gof.creational.abstractfactory.win.WinFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UIFactoryTest {

    UIFactory uiFactory;
    Button button;
    CheckBox checkBox;

    @Test
    public void testMacUI() {
        uiFactory = new MacFactory();

        // button test
        button = uiFactory.createButton();
        assertEquals("Click button", button.onClick());
        assertEquals("MacButton", button.render());

        // check box test
        checkBox = uiFactory.createCheckBox();
        assertEquals("Click check box", checkBox.onClick());
        assertEquals("MacCheckBox", checkBox.render());
    }

    @Test
    public void testWinUI() {
        uiFactory = new WinFactory();

        // button test
        button = uiFactory.createButton();
        assertEquals("Click button", button.onClick());
        assertEquals("WinButton", button.render());

        // check box test
        checkBox = uiFactory.createCheckBox();
        assertEquals("Click check box", checkBox.onClick());
        assertEquals("WinCheckBox", checkBox.render());
    }
}
