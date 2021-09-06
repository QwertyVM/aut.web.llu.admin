package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import pages.LoginPage;

public class BackgroundSteps {
    @Steps
    LoginPage loginPage;

    @Given("Victor se encuentra logeado en la web")
    public void usuarioLogeado(){
       loginPage.openApplication();
       loginPage.enterUsername("fcortez@solera.pe");
       loginPage.enterPassword("admin");
       loginPage.clicOnLoginButton();
    }
}
