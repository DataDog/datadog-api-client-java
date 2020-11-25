package com.datadog.api;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "summary",
        "com.datadog.api.TracePlugin", "rerun:target/rerun.txt" }, snippets = CAMELCASE, tags = "not @skip")
public class ScenariosTest {
}