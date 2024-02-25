package com.demoblaze.runners.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@RegistroExitoso",
        glue = "com.demoblaze.runners.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
        /*snippets son todos*/
)
public class Runner {
}
