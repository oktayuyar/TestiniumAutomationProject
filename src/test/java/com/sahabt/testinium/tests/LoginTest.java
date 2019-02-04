package com.sahabt.testinium.tests;

import com.sahabt.testinium.page.HomePage;
import com.sahabt.testinium.page.LoginPage;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public class LoginTest {

    public LoginPage loginPage = new LoginPage();
    public HomePage homePage = new HomePage();

    @And("^Testinium web sitesinde login butonuna tıklanır$")
    public void testiniumWebSitesindeLoginButounaTıklanır() {
        homePage.callLoginPage();
    }

    @And("^Testinium web sitesine başarısız giriş için ([^\"]*) ve ([^\"]*) yazılır$")
    public void testiniumWebSitesineBaşarısızGirişIçinEmailVePasswordYazılır(String email, String password) throws Throwable {
        loginPage.login(email, password);
    }

    @And("^Testinium web sitesine başarısız giriş için \"([^\"]*)\" ve \"([^\"]*)\" yazılır$")
    public void testiniumWebSitesineBaşarısızGirişIçinVeYazılır(String email, String password) throws Throwable {
        loginPage.login(email, password);
    }

    @And("^Testinium web sitesinde sign-in butonuna tıklanır$")
    public void testiniumWebSitesindeSignInButonunaTıklanır() {
        loginPage.clickSignInButton();

    }

    @And("^Testinium web sitesine giriş yapılamadığı kontrol edilir$")
    public void testiniumWebSitesineGirişYapılamadığıKontrolEdilir() throws Throwable {
        loginPage.checkUnsuccessfulLogin();
    }


}
