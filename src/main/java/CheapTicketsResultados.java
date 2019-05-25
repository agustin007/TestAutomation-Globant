import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheapTicketsResultados {

    private static WebDriver driver;

    @FindBy(how = How.ID, using = "inpHotelNameMirror")
    private WebElement resultados;

    @FindBy(how = How.ID, using = "hotelNameGoBtn")
    private WebElement buscarResultados;

    @FindBy(how = How.ID, using = "modalCloseButton")
    private WebElement popup;

    @FindBy(how = How.CLASS_NAME, using = "showing-results")
    private WebElement numeroResultados;

    @FindBy(how = How.CLASS_NAME, using = "showing-results")
    private static WebElement titulo;

    public CheapTicketsResultados(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getResultados() {
        return resultados;
    }

    public WebElement getBuscarResultados() {
        return buscarResultados;
    }

    public WebElement getPopup() {
        return popup;
    }

    public WebElement getNumeroResultados() {
        return numeroResultados;
    }

    public static boolean chekearCantidad() {
        String[] resultados = titulo.getText().split(" ");
        int q = Integer.valueOf(resultados[2]);

        if (q > 0) {
            return true;
        }

        return false;
    }

    public static boolean chekearUbicacion() {
        List<WebElement> resultados = driver.findElements(By.id("resultsContainer"));

        for (WebElement resultado : resultados) {

            String ciudad = resultado.findElement(By.className("neighborhood")).getText();
            if (!ciudad.contains("Beach") && !ciudad.contains("Miami")) {
                continue;
            }
            System.out.println("Encontro Miami");
            return true;
        }
        return false;
    }

    public static boolean chekearFaena(){
        int resultados = driver.findElement(By.id("resultsContainer")).findElements(By.tagName("aticle")).size();

        return 0 < resultados;
    }
}