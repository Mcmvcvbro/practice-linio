package co.com.tcs.training.projectlinio.stepdefinitions;

import co.com.tcs.training.projectlinio.tasks.AddToCart;
import co.com.tcs.training.projectlinio.tasks.CategoryAndSection;
import co.com.tcs.training.projectlinio.tasks.ProductAndQuantity;
import co.com.tcs.training.projectlinio.userinterfaces.PageLinio;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ShoppingStepDefinitions {

    PageLinio page;

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
        theActorCalled("david");
    }

    @Given("^el usuario debe estar en la aplicacion (.*)$")
    public void elUsuarioDebeEstarEnLaAplicacionHttpsWwwLinioComCo(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));

    }


    @When("^el usuario ingresa la categoria y seccion$")
    public void elUsuarioIngresaLaCategoriaYSeccion() {
        theActorInTheSpotlight().attemptsTo(CategoryAndSection.select());

    }

    @When("^el usuario selecciona el producto y su cantidad (.*) (.*)$")
    public void elUsuarioSeleccionaElProductoYSuCantidad(String product, String quality) {
        OnStage.theActorInTheSpotlight().attemptsTo(ProductAndQuantity.select(product, quality));

    }

    @Then("^el usuario da click para agregar al carrito$")
    public void elUsuarioDaClickParaAgregarAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.go());

    }

    @Then("^el usuario deberia ver el producto la cantidad y su valor$")
    public void elUsuarioDeberiaVerElProductoLaCantidadYSuValor() {

    }
}
