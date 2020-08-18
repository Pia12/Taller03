package pages;

import controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    //Login
    public Button loginButton;
    public Button loginButton1;

    public MainPage(){ loginButton= new Button(By.linkText("Login"));
    loginButton1=new Button(By.xpath("//*[contains(text(),'Te damos la bienvenida ')]"));
    }
}