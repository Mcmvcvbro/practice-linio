package co.com.tcs.training.projectlinio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PageMatresses {

    public static final Target PRODUCT_NAME = Target.the("name").
            locatedBy("//meta[@content={0}]/..");

    public static final Target SELECT_QUANTITY = Target.the("quantity").
            locatedBy("//ul[@id='select-dropdown-list-product-quantity']/li[@data-value={0}]");

    public static final Target PRICE = Target.the("price").
            locatedBy("//span[@class='price-main-md']");

    public static final Target BUTTON_BUY = Target.the("buy")
            .locatedBy("//button[@id='buy-now']");

    public static final Target GO_CART = Target.the("go cart").
            locatedBy("//a[@class='btn btn-sm btn-go-to-cart added-product']");

    public static final Target DROPDOWN_QUANTITY = Target.the("dropDown").
            locatedBy("//div[@class='select-dropdown select-dropdown-product-quantity']");
}
