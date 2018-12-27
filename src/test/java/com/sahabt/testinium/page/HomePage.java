package com.sahabt.testinium.page;

import com.sahabt.testinium.contracts.IHomePage;
import com.sahabt.testinium.util.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public class HomePage extends BasePageUtil implements IHomePage {

    public By buttonSignUp = By.xpath("//div[@id='navbarCollapse']/ul/li[8]/a[@href='https://account.testinium.com/uaa/register']");

    @Override
    public LoginPage callLoginPage() {
        clickElement(buttonSignUp);
        return new LoginPage();
    }
}
