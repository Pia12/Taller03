package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sesionManager.SesionManager;

public class Control {
    protected WebElement webElement;
    protected By locator;

    public Control(By locator){
        this.locator = locator;
    }

    protected void find(){
        webElement= SesionManager.getInstance().getDriver().findElement(this.locator);
    }

    public void click(){
        this.find();
        webElement.click();
    }

    public void set(String dato){
        this.find();
        webElement.sendKeys(dato);
    }

    public boolean isDisplayed(){
        try{
            this.find();
            return this.webElement.isDisplayed();
        } catch (Exception e){
            return false;
        }

    }

}