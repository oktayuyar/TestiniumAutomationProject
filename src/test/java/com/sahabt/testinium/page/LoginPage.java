package com.sahabt.testinium.page;

import com.sahabt.testinium.contracts.IHomePage;
import com.sahabt.testinium.contracts.ILoginPage;
import com.sahabt.testinium.util.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public class LoginPage extends BasePageUtil implements ILoginPage {

    public final By txtUserName= By.id("username");
    public final By txtPassword= By.id("password");
    public final By buttonSignIn= By.cssSelector(".login-page__submit-btn");
    public final By txtErrorMessage= By.cssSelector(".alert-danger");

    @Override
    public ILoginPage login(String email, String password) {
        setText(txtUserName,email);
        setText(txtPassword,password);
        return new LoginPage();
    }

    @Override
    public IHomePage clickSignInButton() {
        clickElement(buttonSignIn);
        return new HomePage();
    }

    @Override
    public ILoginPage checkUnsuccessfulLogin() {
        Assert.assertTrue(isElementDisplayed(txtErrorMessage));
        return new LoginPage();
    }
}
