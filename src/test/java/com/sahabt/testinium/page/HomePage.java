package com.sahabt.testinium.page;

import com.sahabt.testinium.contracts.IHomePage;
import com.sahabt.testinium.contracts.ILoginPage;
import com.sahabt.testinium.util.BasePageUtil;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 2018-12-26
 */
public class HomePage extends BasePageUtil implements IHomePage {

    public final By buttonLogin = By.linkText("LOGIN");

    @Override
    public ILoginPage callLoginPage() {
        clickElement(buttonLogin);
        return new LoginPage();
    }
}
