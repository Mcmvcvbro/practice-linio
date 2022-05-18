package co.com.tcs.training.projectlinio.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;


public class PageCart {

    public static final Target DELETE = Target.the("eliminar").locatedBy("//a[@ng-click='cart.removeItem(item.sku)']");

    public static final Target EMPITY_CART = Target.the("carrito vacio").
            locatedBy("//h2[@class='highlight col-md-6 offset-md-3']");
    public static final Target PRODUCT_SELECTED = Target.the("producto seleccionado").locatedBy("//a[text()='Super Mega Combo Azul Queen 160x190 Resortado Marshall");

}
