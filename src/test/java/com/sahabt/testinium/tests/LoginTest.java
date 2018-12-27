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

    @And("^Uygulamanın alt menüsünden hesap seçeneğine tıklanır$")
    public void uygulamanınAltMenüsündenHesapSeçeneğineTıklanır() throws Throwable {
        homePage.callLoginPage();
    }

    @And("^Uygulamaya başarılı giriş için ([^\"]*) ve ([^\"]*) yazılır$")
    public void uygulamayaBaşarılıGirişIçinEmailVePasswordYazılır(String email, String password) throws Throwable {
        loginPage.login(email, password);
    }

    @And("^Uygulamaya başarısız giriş için \"([^\"]*)\" ve \"([^\"]*)\" yazılır$")
    public void uygulamayaBaşarısızGirişIçinVeYazılır(String email, String password) throws Throwable {
        loginPage.login(email, password);
    }

    @And("^Başarılı şekilde uygulamaya giriş yapıldığı kontrol edilir$")
    public void başarılıŞekildeUygulmaayaGirişYapıldığıKontrolEdilir() throws Throwable {
        loginPage.checkSuccessfulLogin();
    }

    @And("^Uygulamaya giriş yapılamadığı kontrol edilir$")
    public void uygulmaayaGirişYapılamadığıKontrolEdilir() throws Throwable {
        loginPage.checkUnsuccessfulLogin();
    }

}
