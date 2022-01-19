package StepPages;

import net.thucydides.core.annotations.Step;
import PageObjects.UI_LoginPage;

public class LoginPage {

    UI_LoginPage loginPage;

    @Step
    public void openApplication(){
        loginPage.open();
    }

    @Step
    public void enterUsername(String uName){
        loginPage.enterUname(uName);
    }

    @Step
    public void enterPassword(String uPass){
        loginPage.enterUpass(uPass);
    }

    @Step
    public void clicOnLoginButton(){
        loginPage.clikcLogin();
    }

}
