package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {
    @FindBy(tagName = "h3")
    List<WebElement> txtSearchResult;
    @FindBy(className = "v-align-middle")
    List<WebElement> txtFirstSearchResult;



    public SearchPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void assertSearchResult(){
        String txtSearch = txtSearchResult.get(2).getText();
        Assert.assertTrue(txtSearch.contains("repository results"));
    }

    public void checkFirstSearchResult(){
        String firstResult_actual = txtFirstSearchResult.get(8).getText();
        String firstResult_expected = "facebook/create-react-app";
        Assert.assertTrue(firstResult_actual.contains(firstResult_expected));
    }

}
