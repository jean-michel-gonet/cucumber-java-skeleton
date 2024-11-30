package io.cucumber.skeleton;

import java.lang.Double;
import java.util.Map;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.DataTableType;

public class StepDefinitions {

	private static class Ingredient {
		private String name;
		private Double quantity; 
		private String units;
		
		private Ingredient(String name, Double quantity, String units) {
			this.name = name;
			this.quantity = quantity;
			this.units = units;
		}
	}

    @DataTableType
    public Ingredient mySystemEntry(Map<String, String> entry) {
        throw new IllegalArgumentException("This message is never shown during test execution");
    }

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
	
	@When("I mix the following ingredients")
	public void i_wait_hour(DataTable dataTable) {
	    List<Ingredient> ingredients = dataTable.asList(Ingredient.class);
		
	}

	@Then("my belly should growl")
	public void my_belly_should_growl() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
