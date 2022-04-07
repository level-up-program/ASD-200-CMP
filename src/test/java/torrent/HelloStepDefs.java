package torrent;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloStepDefs{

    @Given("I'm in a <good> mood")
    public void inAGoodMood(String mood){
        System.out.println("My mood is +"+mood);
    }

    @When("You say hello")
    public void iwillsayHello(){
        System.out.println("Say hello");
    }

    @Then("I will respond <hello>")
    public void helloEqualsHello(){
        System.out.println("Hello is hello");
    }
}