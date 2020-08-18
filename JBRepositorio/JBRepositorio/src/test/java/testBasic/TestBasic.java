package testBasic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBasic {

    private ChromeDriver driver;

    @Before
    public void openBrowser(){
        String rutaDriver="D:\\Taller02\\JBRepositorio\\JBRepositorio\\src\\test\\java\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",rutaDriver);

        //Inicializar el navegador
        driver = new ChromeDriver();

        //Tiempo de espera
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS);
    }

    @Test
    public void testSeleniumLogin() throws InterruptedException{
        driver.get("http://todo.ly/");
        Thread.sleep(5000);

        //Cick Sing Up Free
        driver.findElement(By.xpath("//img[@src='/Images/design/pagesignup.png']")).click();

        // acción --- donde se realiza la acciones (control) --- donde está el control

        //- controles (herencia)
        //- sessiones (singleton)
        //- drivers browser (factory)
        //- pages (POM) ---> automatización

        // click on [login] button on modal login

        // Llenar textbox
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName")).sendKeys("owasp");
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail")).sendKeys("owasp@owas6.com");
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword")).sendKeys("owas123");

        // click checkbox
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms")).click();

        // click login
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_ButtonSignup")).click();

        // Verificación

    }

    @After
    public void closeBrowser(){
        driver.close();
    }

}
