package StepPages;

import net.thucydides.core.annotations.Step;
import PageObjects.UI_CreateUserPage;

public class CreateUserPage {

    UI_CreateUserPage createUser;

    @Step
    public void enterName(String name){
        createUser.enterName(name);
    }

    @Step
    public void enterLastName(String lname){
        createUser.enterLastName(lname);
    }

    @Step
    public void selectDocType(String typeDoc){
        createUser.selectTypeDoc(typeDoc);
    }

    @Step
    public void enterDocumentNumber(String docNumber){
        createUser.enterDocNumber(docNumber);
    }

    @Step
    public void enterEmail(String email){
        createUser.enterEmail(email);
    }

    @Step
    public void enterPhone(String phone){
        createUser.enterPhone(phone);
    }

    @Step
    public void selectProfile(String profile){
        createUser.selectProfile(profile);
    }

    @Step
    public void enterPassword(String password){
        createUser.enterPass(password);
    }

    @Step
    public void enterRePassword(String rePass){
        createUser.enterRePass(rePass);
    }

    @Step
    public void clickCreateUser(){
        createUser.clikcCrearUser();
    }

    @Step
    public void verificar_creacion_exitosa(String msjExito) {
        createUser.verificar_mensaje_exito(msjExito);
    }
}
