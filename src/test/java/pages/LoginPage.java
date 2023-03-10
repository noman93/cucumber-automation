package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class LoginPage {

    @FindBy(className = "header-search-input")
    WebElement fieldSearch;

    @FindBy(className = "Link--secondary")
    List<WebElement> btnAbout;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void doSearch(){

        fieldSearch.sendKeys("create-react-app", Keys.ENTER);



    }



    public void clickAbout(){

        btnAbout.get(45).click();



    }


}
