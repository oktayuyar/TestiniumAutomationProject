package com.sahabt.testinium.page;

import com.sahabt.testinium.contracts.ILoginPage;
import com.sahabt.testinium.util.BasePageUtil;
import org.openqa.selenium.WebDriver;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public class LoginPage extends BasePageUtil implements ILoginPage {

    @Override
    public LoginPage login(String email, String password) {
        return new LoginPage();
    }

    @Override
    public HomePage checkSuccessfulLogin() {
        return new HomePage();
    }

    @Override
    public LoginPage checkUnsuccessfulLogin() {
        return new LoginPage();
    }
}
