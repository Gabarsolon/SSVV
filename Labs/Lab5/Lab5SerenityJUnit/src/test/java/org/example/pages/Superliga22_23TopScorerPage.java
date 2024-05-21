package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@DefaultUrl("https://www.flashscore.ro/fotbal/romania/liga-1-superliga-2022-2023/clasament/#/4dxuXu3n/top_scorers")
public class Superliga22_23TopScorerPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    private WebElementFacade acceptCookiesButton;
    @FindBy(xpath = "//*[@id=\"tournament-table-tabs-and-content\"]/div[2]/div[1]/button")
    private WebElementFacade echipaDropdownButton;

    @FindBy(xpath = "//*[@id=\"tournament-table-tabs-and-content\"]/div[2]/div[1]/ul")
    private WebElementFacade listaEchipe;

    @FindBy(xpath = "//*[@id=\"tournament-table-tabs-and-content\"]/div[3]/div/div[2]/div[1]/div/a")
    private WebElementFacade topScorer;

    public void clickAcceptCookiesButton(){
        acceptCookiesButton.click();
    }
    public void clickOnEcipaDropdownButton() {
        echipaDropdownButton.click();
    }

    public boolean selectTeam(String teamName) {
//        List<WebElement> echipaButtons = listaEchipe.
//                findElements(By.tagName("button"))
//                .stream()
//                .map((Function<WebElement, WebElement>)
//                        element ->
//                                element.findElement(By.tagName("li")).
//                                findElement(By.tagName("button")))
//                .collect(Collectors.toList());

        List<WebElement> echipaButtons = new ArrayList<>(listaEchipe.
                findElements(By.tagName("button")));

        for (WebElement echipaButton : echipaButtons) {
            if (echipaButton.getText().equals(teamName)) {
                echipaButton.click();
                return true;
            }
        }
        return false;
    }

    public String getTopScorerName() {
        return topScorer.getText();
    }
}
