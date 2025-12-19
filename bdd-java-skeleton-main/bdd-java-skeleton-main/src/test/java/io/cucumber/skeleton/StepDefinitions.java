package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions {

    @Given("something")
    public void I_do_something() {
        // context
    }

    @When("I call the method")
    public void I_call_the_method() {
        // method to call
    }

    @Then("result is ok")
    public void the_result_should_be_true() {
        assertThat(true).isTrue();
    }
}
