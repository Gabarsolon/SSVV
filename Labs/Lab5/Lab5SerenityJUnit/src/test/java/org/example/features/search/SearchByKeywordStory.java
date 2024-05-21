package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.example.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    @Pending @Test
    public void searching_by_ambiguous_keyword_should_display_the_disambiguation_page() {
    }

    @Test
    public void searching_by_keyword_football_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("football");
        anna.should_see_definition("A sport played on foot in which teams attempt to get a ball into a goal or zone defended by the other team.");
    }

    @Test
    public void searching_by_keyword_bistrita_should_Display_the_corresponding_article(){
        anna.is_the_home_page();
        anna.looks_for("Bistrita");
        anna.should_see_definition("The capital city of Bistrița-Năsăud County, Romania.");
    }
} 