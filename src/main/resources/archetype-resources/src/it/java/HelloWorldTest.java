#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.model.CucumberFeature;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloWorldTest {

    private String name;
    private String greeting;

    @Given(value = "^I am user ([^${symbol_escape}${symbol_escape}${symbol_escape}"]*)${symbol_dollar}")
    public void i_am_user(String name) {
        if (!name.equalsIgnoreCase("Anonymous")) {
            this.name = name;
        }
    }

    @When("^I ask for a greeting${symbol_dollar}")
    public void ask_for_a_greeting() {
          greeting = Greeting.greet(name);
    }



    @Then("^I should be greeted with '([^${symbol_escape}${symbol_escape}${symbol_escape}"]*)'${symbol_dollar}")
    public void shouldBeGreetedWith(String expectedGreeting) {
        assertThat(greeting, is(expectedGreeting));
    }


}
