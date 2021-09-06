package pages.locators;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LluAdmin_CreateUserPage extends PageObject {

    public void enterName(String name){
        $(By.name("name")).type(name);
    }

    public void enterLastName(String lname){
        $(By.name("lastName")).type(lname);
    }

    public void selectTypeDoc(String typeDoc){

        if(typeDoc.equalsIgnoreCase("CE")){
            $(By.xpath("//div[@class=' css-1uccc91-singleValue']")).click();
            $(By.id("react-select-4-option-1")).click();
        }

    }

    public void enterDocNumber(String docNumber){
        $(By.name("document")).type(docNumber);
    }

    public void enterEmail(String email){
        $(By.name("email")).type(email);
    }
    public void enterPhone(String phone){
        $(By.name("phone")).type(phone);
    }

    public void selectProfile(String profile){

        $(By.xpath("//div[contains(text(),'Selecciona perfil')]")).click();

        if(profile.equalsIgnoreCase("Administrador")){
            $(By.xpath("//div[@id='react-select-3-option-0']")).click();

        }else if(profile.equalsIgnoreCase("Picker")) {
            $(By.id("react-select-3-option-1")).click();

        }else{
            $(By.id("react-select-3-option-2")).click();
        }

    }

    public void enterPass(String pass){
        $(By.name("password")).type(pass);
    }

    public void enterRePass(String rePass){
        $(By.name("repeatPassword")).type(rePass);
    }

    public void clikcCrearUser(){
        $(By.id("submit-user")).click();
    }

    public void verificar_mensaje_exito(String msjExito) {
        Assert.assertEquals(msjExito, $(By.xpath("//p[contains(text(),'"+msjExito+"')]")).getText());
    }
}
