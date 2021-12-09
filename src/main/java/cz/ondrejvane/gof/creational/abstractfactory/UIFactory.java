package cz.ondrejvane.gof.creational.abstractfactory;

/**
 * Abstract factory (Abstraktní továrna) je návrhový vzor, jehož jádrem je specifikace tovární třídy.
 *
 * @author ondrejvane
 */
public interface UIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
