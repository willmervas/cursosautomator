package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^Navegar en Google")
    public void navigatedToGoogle(){
        google.navigatedToGoogle();

    }

    @When("^Buscar un criterio$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("como hacer un commit de visual studio a github");

    }

    @And("^Click en Buscar en Google$")
    public void clickSearchGoogle(){
        google.clickSearchGoogle();
    }

    @Then("^Validar resultados$")
    public void validateResults(){

    }

}