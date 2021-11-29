package com.it.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class methods extends baseClass{

    //Seleft button
    public void ClickButtonDropDown() {
        driver.findElement(By.id("sitesDropdown")).click();
    }


    public void ChooseDropDown2() {
        driver.findElement(By.cssSelector(".dropdown-menu > li:nth-child(1) > a:nth-child(1)")).click();
    }

    public void ChooseDropDown() {
        driver.findElement(By.linkText("https://www.iths.se/kurstyp/foretagsutbildning/"));
    }

    //Choose years of experience
    public void ChooseYearsOfExperience(String text) {
        Select selectMenu = new Select(driver.findElement(By.id("sitesDropdown")));
        selectMenu.selectByVisibleText("text");
    }
}
