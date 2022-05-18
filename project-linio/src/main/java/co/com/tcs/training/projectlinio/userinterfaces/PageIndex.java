package co.com.tcs.training.projectlinio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageIndex {

    public static final Target BUTTON_LEFT_MENU = Target.the("left_menu").locatedBy("//div[@id='open-left-menu']");

    public static final Target SELECT_HOME = Target.the("hogar").locatedBy("//span[text()='Hogar']");

    public static final Target SELECT_MATTRESSES = Target.the("colchones").locatedBy("//a[text()='Colchones, Base Camas y Almohadas']");



}
