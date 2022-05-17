package co.com.tcs.training.projectlinio.tasks;

import co.com.tcs.training.projectlinio.userinterfaces.PageMatresses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ProductAndQuantity implements Task {

    String product;
    String quantity;

    public ProductAndQuantity(String product, String quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageMatresses.PRODUCT_NAME.of(product)),
                Click.on(PageMatresses.DROPDOWN_QUANTITY),
                Click.on(PageMatresses.SELECT_QUANTITY.of(quantity)));

        String cost = PageMatresses.PRICE.resolveAllFor(actor).get(0).getText().substring(1).replace(".","");

    }

    public static ProductAndQuantity select(String product, String quantity){
        return Tasks.instrumented(ProductAndQuantity.class, product, quantity);
    }
}
