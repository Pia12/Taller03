package pages;

import controls.Button;
import org.openqa.selenium.By;

public class MenuSite {
    public Button   logoutButtonPrincipal;
    public Button logoutButton;

    public MenuSite(){
        logoutButtonPrincipal = new Button(By.xpath("//*[@class='gear_normal']"));
        //logoutButton= new Button(By.xpath("//*[contains(text(),'Cerrar sesion')]"));
        logoutButton= new Button(By.xpath("//*[@id='setting_menu']/div[11]/div[2]]"));
    }

}
