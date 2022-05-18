package co.com.tcs.training.projectlinio.tasks;

import co.com.tcs.training.projectlinio.userinterfaces.PageMatresses;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.tcs.training.projectlinio.userinterfaces.PageCart.DELETE;


public class Cart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PageMatresses.BUTTON_BUY),
                Click.on(PageMatresses.GO_CART),
                Click.on(DELETE));

    }

    public static Cart clickAndDelete () {
        return Tasks.instrumented(Cart.class);
    }
}
