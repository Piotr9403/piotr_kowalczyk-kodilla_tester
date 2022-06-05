package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzSteps() {

        Given("^number is 6$", () -> {
            this.number = 6;
        });

        Given("^number is 15$", () -> {
            this.number = 15;
        });

        Given("^number is 7$", () -> {
            this.number = 7;
        });

        Given("^number is 10$", () -> {
            this.number = 10;
        });

        When("^I check its divisibility by three and five$", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkNumber(number);
        });


        Then("I should get a message {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}