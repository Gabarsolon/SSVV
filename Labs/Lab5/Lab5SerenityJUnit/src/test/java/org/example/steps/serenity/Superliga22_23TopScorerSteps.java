package org.example.steps.serenity;

import org.example.pages.Superliga22_23TopScorerPage;

public class Superliga22_23TopScorerSteps {
    Superliga22_23TopScorerPage superliga2223TopScorerPage;

    public void opensPage(){
        superliga2223TopScorerPage.open();
    }
    public void acceptsCookies(){
        superliga2223TopScorerPage.clickAcceptCookiesButton();
    }
    public void clicksEchipaButton(){
        superliga2223TopScorerPage.clickOnEcipaDropdownButton();
    }

    public void selectsTeam(String team){
        assert superliga2223TopScorerPage.selectTeam(team);
    }

    public void checksTopScorerName(String name){
        assert superliga2223TopScorerPage.getTopScorerName().equals(name);
    }

    public void checksTeamDoesntExists(String name){
        assert !superliga2223TopScorerPage.getTopScorerName().equals(name);
    }
}
