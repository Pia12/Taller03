package pages;

import controls.Button;
import controls.CheckBox;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    //public TextBox fullNameTextBox;
    public TextBox emailTextBox;
    public TextBox passwordTextBox;
    public CheckBox readAndAgreeCheckBox;
    public Button loginButton;

    public LoginPage(){
        emailTextBox = new TextBox(By.xpath("//*[@id='email']"));
        passwordTextBox = new TextBox(By.xpath("//*[@id='password']"));
        loginButton= new Button(By.xpath("//*[@class='submit_btn ist_button ist_button_red sel_login']"));

    }

}