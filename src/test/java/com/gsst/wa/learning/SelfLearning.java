package com.gsst.wa.learning;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelfLearning {
	
   @Given("^I am a student \"([^\"]*)\" and I have (\\d+) words in current unit$")
   public void i_am_a_student_and_i_have_words_in_current_unit(String userName, int remainingWords) {
       System.out.println("Prepare your data or running env/condition with parameter user name = " + userName + " remaining word number = " + remainingWords);
   }

   @When("^I start self learning$")
   public void i_start_self_learning() {
       System.out.println("Prepare user action and the request to backend...");
   }

   @Then("^I get my latest learning progress$")
   public void i_get_my_latest_learning_progress() {
       System.out.println("Assert the latest progress...");
   }

    @Then("^I have (\\d+) words to learn$")
    public void i_have_words_to_learn(int remainingWords) {
        System.out.println("Assert how many words...");
    }

    @Then("^Word, spelling, word_means, sentence, sentence_means are returned for each word$")
    public void word_info_are_returned() {
        System.out.println("Assert the word info, like word, spelling, word_means, sentence, sentence_means...");
    }

    @When("^I learn a word$")
    public void i_learn_a_word() {
        System.out.println("Prepare user action and the request to backend...");
    }

    @Then("^My latest learning progress is updated$")
    public void my_latest_learning_progress_is_updated() {
        System.out.println("Assert the latest progress again...");
    }

}
