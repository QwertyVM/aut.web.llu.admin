package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import starter.Objeto.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.CreateUserPage;
import pages.UserHomePage;
import java.util.List;
import java.util.Map;


public class Usuario_Crear {

    @Steps
    UserHomePage userHomePage;

    @Steps
    CreateUserPage createUserPage;

    @DataTableType
    public User userEntry(Map<String, String> entry) {
        return new User(
                entry.get("name"),
                entry.get("lastname"),
                entry.get("doctype"),
                entry.get("docNumber"),
                entry.get("email"),
                entry.get("cellphone"),
                entry.get("profile"),
                entry.get("password"),
                entry.get("reppwd"));

    }

    @When("^Victor ingresa al modulo de creacion$")
    public void victorIngresaAlModuloDeCreacion() {
        userHomePage.ingresarCreateUser();
    }

    @And("^El ingresa el detalle del formulario$")
    public void elIngresaElDetalleDelFormulario(List<User> users) {
        createUserPage.enterName(users.get(0).getName());
        createUserPage.enterLastName(users.get(0).getLname());
        createUserPage.selectDocType(users.get(0).getDocType());
        createUserPage.enterDocumentNumber(users.get(0).getDocNumber());
        createUserPage.enterEmail(users.get(0).getEmail());
        createUserPage.enterPhone(users.get(0).getPhone());
        createUserPage.selectProfile(users.get(0).getProfile());
        createUserPage.enterPassword(users.get(0).getPassword());
        createUserPage.enterRePassword(users.get(0).getRepassword());

    }

    @And("^click en el boton Crear Cuenta$")
    public void clickEnElBotonCrearCuenta() {
        createUserPage.clickCreateUser();
    }


    @Then("^Victor deberia visualizar el mensaje de exito: (.*)$")
    public void verificar_Creacion_Exitosa(String msjExito) {
        createUserPage.verificar_creacion_exitosa(msjExito);

    }
}
