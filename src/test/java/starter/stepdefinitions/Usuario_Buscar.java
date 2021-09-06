package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.UserHomePage;

public class Usuario_Buscar {

    @Steps
    UserHomePage usrHomePage;

    @When("^Victor ingresa el numero de documento (.*) del usuario a buscar$")
    public void busqueda_de_usuario(String docNumber){
        usrHomePage.search_enterDocNumer(docNumber);
    }

    @And("^el hace click en  en el boton Buscar$")
    public void clic_en_boton_buscar(){
        usrHomePage.clicOnSearch();
    }


    @Then("^el deberia ver los usuarios que tengan el numero de documento (.*)$")
    public void resultado_de_la_busqueda(String docNumber) {
        usrHomePage.verificar_usuariosEnlistados(docNumber);
    }


    @Then("^el deberia visualizar el siguiente mensajde de error: (.*)$")
    public void resultado_vacio_de_la_busqueda(String msjError) {
        usrHomePage.verificar_mensaje_listadoVacio(msjError);
    }
}
