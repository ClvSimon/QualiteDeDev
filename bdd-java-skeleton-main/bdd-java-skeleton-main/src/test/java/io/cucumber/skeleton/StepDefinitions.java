package io.cucumber.skeleton;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    ComptoirDuReve library;

    @Given("une boutique de livre")
    public void createBoutique() {
        library = new ComptoirDuReve();
    }

    @When("j'ajoute le tome {int} au panier")
    public void jAjouteLeTomeAuPanier(int numeroDeTome) {
        library.addBookToBasket(numeroDeTome);
    }

    @Then("le prix total est de {double}$")
    public void LePrixTotalEstDe$(double prix) {
        assertThat(library.totalprice()).isEqualTo(prix);
    }
}
