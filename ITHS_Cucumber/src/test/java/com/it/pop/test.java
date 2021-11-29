package com.it.pop;

import org.junit.jupiter.api.Test;

public class test extends methods{

    @Test
    public void testDropDown() {

        driver.navigate().to("https://www.iths.se/courses/");

        ClickButtonDropDown();
        ChooseDropDown2();
    }

}
