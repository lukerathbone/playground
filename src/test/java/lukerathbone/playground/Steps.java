package lukerathbone.playground;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import sun.security.util.PendingException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Steps {

    @Autowired
    private TestRestTemplate restTemplate;


    @Given("^Mike is creating a new Campaign$")
    public void mike_is_creating_a_new_Campaign() throws Throwable {
        restTemplate.postForObject("/campaigns", new Object(), String.class);
    }

    @When("^he \"([^\"]*)\" the Campaign$")
    public void he_the_Campaign(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the Campaign is saved in the \"([^\"]*)\" state$")
    public void the_Campaign_is_saved_in_the_state(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}

