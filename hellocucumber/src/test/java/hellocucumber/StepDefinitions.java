package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    DayOfWeek day;
    private String today;
    private String actualAnswer;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }


    @Given("Aujourd'hui c'est Dimanche")
    public void today_is_sunday() {
        this.today = "Sunday";
    }
    @When("je demande si c'est déjà vendredi")
    public void i_ask_whether_it_s_friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        this.actualAnswer = IsItFriday.isItFriday(today);
    }
    @Then("On devrais me dire Nope")
    public void i_should_be_told(String string) {
        assertEquals("Nope", IsItFriday.isItFriday(string));
    }

}


class IsItFriday {

    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }


}