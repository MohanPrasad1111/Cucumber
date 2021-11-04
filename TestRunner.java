package com.tuc.br.assemblytest.test.suite;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/products/", glue = {
		"com.tuc.br.assemblytest.step.definition" }, plugin = { "pretty", "html:target/site" }, monochrome = true)
public class TestRunner {
}
