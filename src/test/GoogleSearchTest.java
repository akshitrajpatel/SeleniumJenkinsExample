package com.example.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        // Open Google
        driver.get("https://www.google.com");

        // Find the search box
        WebElement searchBox = driver.findElement(By.name("q"));

        // Type in the search query
        searchBox.sendKeys("Selenium WebDriver");

        // Submit the search
        searchBox.submit();

        // Verify the search result page title
        assertTrue(driver.getTitle().contains("Selenium WebDriver"));
    }
}
