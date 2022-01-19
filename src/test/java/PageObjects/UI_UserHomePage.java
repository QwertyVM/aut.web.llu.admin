package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UI_UserHomePage extends PageObject {

    public void loginVerified(String modExpected){

        waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@tabindex='0']")));

        Assert.assertEquals(modExpected,$(By.xpath("//p[@styles='title']")).getText());

    }

    public void ingresarModCreate() {
        //waitForElement().until(ExpectedConditions.visibilityOfElementLocated($(By.xpath("//p[contains(text(),'+')]"))));
        $(By.id("new-page-user")).click();
    }

    public void searchenterdocnumber(String docNumber){
        $(By.name("search")).type(docNumber);
    }

    public void cliconSearch() {
        $(By.xpath("//button[contains(text(),'Buscar')]")).click();
    }

    public void revisar_usuarioenlistado(String docNumber) {

         Assert.assertEquals(docNumber, $(By.xpath("//td[contains(text(),'"+docNumber+"')]")).getText());
    }

    public void revisar_listadoVacio(String msjError) {
        Assert.assertEquals(msjError, $(By.xpath("//p[contains(text(),'"+msjError+"')]")).getText());
    }
}
