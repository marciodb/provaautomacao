package com.provaautomacao.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"json:target/REPORT_NAME.json", "pretty",
        "html:target/HTML_REPORT_NAME"},
        features = "src/test/java/com/provaautomacao/features/ComprarProduto.feature/",
        glue = {""}


)
public class TestRunner {
    }

