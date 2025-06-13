package co.qaconf.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscar_video_youtube.feature",
        glue = "co.qaconf.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class BuscarVideoYoutubeRunner {
}
