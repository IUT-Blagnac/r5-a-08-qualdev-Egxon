package hellocucumber;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Non";
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;

    @Given("Aujourd'hui c'est {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("Je demande c'est quand Vendredi")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("Il faudrait me dire {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}
