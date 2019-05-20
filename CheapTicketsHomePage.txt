import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheapTicketsHomePage {

    private WebDriver driver;

    @FindBy(how = How.ID,using = "tab-hotel-tab-hp")
    private WebElement hoteles;

    @FindBy(how = How.ID, using = "hotel-destination-hp-hotel")
    private WebElement goingTo;

    @FindBy(how = How.ID, using = "hotel-checkin-hp-hotel")
    private WebElement calendarioIda;

    @FindBy(how = How.ID,using = "hotel-checkout-hp-hotel")
    private WebElement calendarioVuelta;

    @FindBy(how = How.ID,using = "hotel-1-adults-hp-hotel")
    private WebElement adultos;

    @FindBy(how = How.ID, using = "hotel-1-children-hp-hotel")
    private WebElement ninos;

    @FindBy(how = How.ID, using = "hotel-1-age-select-1-hp-hotel")
    private WebElement edad;

    @FindBy(how = How.CSS,using = "#section-hotel-tab-hp .gcw-submit")
    private WebElement buscar;

    public CheapTicketsHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getHoteles(){
        return hoteles;
    }

    public WebElement getGoingTo(){
        return goingTo;
    }

    public WebElement getCalendarioIda(){
        return calendarioIda;
    }
    public WebElement getCalendarioVuelta(){
        return calendarioVuelta;
    }
    /*public List<WebElement> getCalendarioIda(){
        WebElement diaDeViaje = calendarioIda.get(0);
        diaDeViaje.findElement(By.cssSelector("button[data-day='19']"));
        return (List<WebElement>) diaDeViaje;

    }
     */

    public WebElement getAdultos(){return adultos;}

    public WebElement getNinos(){return ninos;}

    public WebElement getEdad(){return edad;}

    public WebElement getBuscar(){return buscar;}
}