package com.datadog.api;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "summary", "com.datadog.api.TracePlugin", "rerun:target/rerun.txt"},
    snippets = CAMELCASE,
    tags = "not @skip and not @skip-java and not @with-pagination")
public class ScenariosTest {}
