package co.com.tcs.training.projectlinio.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.tcs.training.projectlinio.userinterfaces.PageIndex.*;

public class CategoryAndSection implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_LEFT_MENU),
                MoveMouse.to(SELECT_HOME),
                MoveMouse.to(SELECT_MATTRESSES).andThen(actions -> actions.click()));

    }
    public static CategoryAndSection select (){
        return Tasks.instrumented(CategoryAndSection.class);
    }

}
