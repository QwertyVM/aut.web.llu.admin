package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.LoginPage;
import pages.UserHomePage;

public class Login_Ingresar {

    @Steps
    LoginPage loginPage;

    @Steps
    UserHomePage usrmodPage;

    @Given("^Victor ingresa a la web$")
    public void usuarioIngresaALaWeb() {
        loginPage.openApplication();
    }

    @When("^Victor ingresa el usuario: (.*) y el password: (.*)$")
    public void usuarioIngresaUsuarioYPassword(String uname, String upass) {
        loginPage.enterUsername(uname);
        loginPage.enterPassword(upass);
    }

    @And("^click en el boton Acceder$")
    public void clickEnElBotonAcceder() {
        loginPage.clicOnLoginButton();
    }

    @Then("^Victor deberia ingresar a la web y ver el Modulo (.*)$")
    public void usuarioDeberiaIngresarALaWeb(String modExpected) {
        usrmodPage.verifyAdminLogin(modExpected);
    }

}
