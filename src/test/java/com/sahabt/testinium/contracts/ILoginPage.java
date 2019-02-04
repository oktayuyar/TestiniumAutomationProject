package com.sahabt.testinium.contracts;

import com.sahabt.testinium.page.HomePage;
import com.sahabt.testinium.page.LoginPage;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public interface ILoginPage {

    ILoginPage login(String email, String password);

    IHomePage clickSignInButton();

    ILoginPage checkUnsuccessfulLogin();
}
