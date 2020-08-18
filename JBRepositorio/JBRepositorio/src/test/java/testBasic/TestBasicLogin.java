package testBasic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;
import pages.MenuSite;
import pages.LoginPage;
import sesionManager.SesionManager;

public class TestBasicLogin {

    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private MenuSite menuSite = new MenuSite();

    @Before
    public void before(){
        SesionManager.getInstance().getDriver().get("https://todoist.com/");
    }

    @After
    public void after(){
        SesionManager.getInstance().close();
    }

    @Test
    public void verifyloginfunctionality() throws InterruptedException {
        // accion --- donde se realiza la acciones (control) --- donde esta el control
        mainPage.loginButton.click();
        loginPage.emailTextBox.set("felipaalache_9@hotmail.com");
        loginPage.passwordTextBox.set("123456789");
        loginPage.loginButton.click();
        // verificacion del Login
        Thread.sleep(5000);
        Assert.assertTrue("Error no se logueo correctamente", mainPage.loginButton1.isDisplayed());


     }


}
