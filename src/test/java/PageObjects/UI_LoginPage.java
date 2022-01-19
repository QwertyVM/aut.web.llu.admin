package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class UI_LoginPage extends PageObject {

    public void enterUname(String uname){
        $(By.name("user")).type(uname);
    }

    public void enterUpass(String upass){
        $(By.name("pass")).type(upass);
    }

    public void clikcLogin(){
        $(By.xpath("//button[contains(text(),'Ingresa aqu')]")).click();
    }
}
