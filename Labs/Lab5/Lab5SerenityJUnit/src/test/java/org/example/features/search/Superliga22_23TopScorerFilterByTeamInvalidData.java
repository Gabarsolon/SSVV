package org.example.features.search;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.Superliga22_23TopScorerSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/Superliga22_23TopScorerInvalidData.csv")
public class Superliga22_23TopScorerFilterByTeamInvalidData {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;
    @Steps
    public Superliga22_23TopScorerSteps superliga2223TopScorerSteps;

    public String echipa;
    public String top_marcator;

    @Qualifier
    public String getQualifier() {
        return echipa;
    }

    public String getEchipa() {
        return echipa;
    }

    public void setEchipa(String echipa) {
        this.echipa = echipa;
    }

    public String getTop_marcator() {
        return top_marcator;
    }

    public void setTop_marcator(String top_marcator) {
        this.top_marcator = top_marcator;
    }

    @Test
    public void testValidTopScorer(){
        superliga2223TopScorerSteps.opensPage();
        superliga2223TopScorerSteps.acceptsCookies();
        superliga2223TopScorerSteps.clicksEchipaButton();
        superliga2223TopScorerSteps.checksTeamDoesntExists(getEchipa());
    }
}
