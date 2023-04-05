package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RexvenPage {

    public RexvenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
