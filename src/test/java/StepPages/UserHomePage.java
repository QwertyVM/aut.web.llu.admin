package StepPages;

import net.thucydides.core.annotations.Step;
import PageObjects.UI_UserHomePage;

public class UserHomePage {

    UI_UserHomePage userHomePage;

    @Step
    public void verifyAdminLogin(String modExpected){
        userHomePage.loginVerified(modExpected);
    }

    @Step
    public void ingresarCreateUser(){
        userHomePage.ingresarModCreate();
    }

    @Step
    public void search_enterDocNumer(String docnumber){
        userHomePage.searchenterdocnumber(docnumber);
    }

    @Step
    public void clicOnSearch() {
        userHomePage.cliconSearch();
    }

    @Step
    public void verificar_usuariosEnlistados(String docNumber) {
        userHomePage.revisar_usuarioenlistado(docNumber);
    }
    @Step
    public void verificar_mensaje_listadoVacio(String msjError) {
        userHomePage.revisar_listadoVacio(msjError);
    }
}
