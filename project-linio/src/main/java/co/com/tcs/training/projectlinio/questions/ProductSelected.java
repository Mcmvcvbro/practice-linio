package co.com.tcs.training.projectlinio.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.training.projectlinio.userinterfaces.PageCart.PRODUCT_SELECTED;

public class ProductSelected implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return PRODUCT_SELECTED.resolveAllFor(actor).get(0).getText();
    }

    public static ProductSelected name() { return new ProductSelected(); }
}
