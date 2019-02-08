package com.sahabt.testinium.tests;

import com.sahabt.testinium.contracts.IHomePage;
import com.sahabt.testinium.contracts.ILoginPage;
import com.sahabt.testinium.page.HomePage;
import com.sahabt.testinium.page.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public class LoginTest {

    public ILoginPage loginPage = new LoginPage();
    public IHomePage homePage = new HomePage();

    @Given("^Testinium web sitesinde login butonuna tıklanır$")
    public void testiniumWebSitesindeLoginButounaTıklanır() {
        homePage.callLoginPage();
    }

    @When("^Testinium web sitesine başarısız giriş için ([^\"]*) ve ([^\"]*) yazılır$")
    public void testiniumWebSitesineBaşarısızGirişIçinEmailVePasswordYazılır(String email, String password) throws Throwable {
        loginPage.login(email, password);
    }

    @When("^Testinium web sitesine başarısız giriş için \"([^\"]*)\" ve \"([^\"]*)\" yazılır$")
    public void testiniumWebSitesineBaşarısızGirişIçinVeYazılır(String email, String password) throws Throwable {
        loginPage.login(email, password);
    }

    @And("^Testinium web sitesinde sign-in butonuna tıklanır$")
    public void testiniumWebSitesindeSignInButonunaTıklanır() {
        loginPage.clickSignInButton();
    }

    @Then("^Testinium web sitesine giriş yapılamadığı kontrol edilir$")
    public void testiniumWebSitesineGirişYapılamadığıKontrolEdilir() throws Throwable {
        loginPage.checkUnsuccessfulLogin();
    }


}
