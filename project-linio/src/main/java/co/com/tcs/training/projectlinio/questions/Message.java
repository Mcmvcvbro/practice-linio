package co.com.tcs.training.projectlinio.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.tcs.training.projectlinio.userinterfaces.PageCart.EMPITY_CART;

public class Message implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return EMPITY_CART.resolveAllFor(actor).get(0).getText();
    }

    public static Message isVisible() {return new Message();}
}
