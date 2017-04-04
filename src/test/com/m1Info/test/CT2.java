package auto_framework;

/**
 * CT02 est la classe de Test du cas d'utilisation CT02 Profil
 * 
 *  
 * @author pomainfroid
 * @version 1.0
 */
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CT2 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  /**
   * Initialise le Test de la classe CT02
   * Driver FirefoxDriver (GeckoDriver)
   * BaseURL à changer en fonction de l'url du site (Serveur)
   * 
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "file:///home/etudiant/T%C3%A9l%C3%A9chargements/Alinua/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  /**
   * Lance le Test de la classe CT02
   * 
   * @throws Exception
   */
  @Test
  public void testCT2() throws Exception {
    driver.get(baseUrl + "profil#!/");
    
    //Verification Nom via Linkedin
    String tmp = driver.findElement(By.xpath("//div[@id='Profil']//contains[text(),'nom']")).getAttribute("value");
    if(tmp.compareTo("Ben")!=0){
    	System.out.println("this attribute should be 'Ben'\n");
    } 
  //Verification Prénom via Linkedin
    tmp = driver.findElement(By.xpath("//div[@id='Profil']//contains[text(),'prenom']")).getAttribute("value");
    if(tmp.compareTo("Ben")!=0){
    	System.out.println("this attribute should be 'Eficiaire'\n");
    }
  //Verification Age via Linkedin
    tmp = driver.findElement(By.xpath("//div[@id='Profil']//contains[text(),'age']")).getAttribute("value");
    if(tmp.compareTo("Ben")!=0){
    	System.out.println("this attribute should be '22'\n");
    }
    //Test exporter le CV en LaTeX
    driver.findElement(By.xpath("//contains[text(),\"Exporter le CV\"]")).click();
    
    driver.findElement(By.xpath("//div[@id='Popin-Exportation']//contains[text(),LaTeX]")).click();
    driver.navigate().refresh();
  }
  /**
   * Termine le Test de la classe CT02
   * Quitte de navigateur
   * 
   * @throws Exception
   */
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
  /**
   * Classe Autogénéré par Selenium IDE
   * @see https://seleniumhq.github.io/selenium/docs/api/java/
   * @throws Exception
   */
  @SuppressWarnings("unused")
private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
  /**
   * Classe Autogénéré par Selenium IDE
   * @see https://seleniumhq.github.io/selenium/docs/api/java/
   * @throws Exception
   */
  @SuppressWarnings("unused")
private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
  /**
   * Classe Autogénéré par Selenium IDE
   * @see https://seleniumhq.github.io/selenium/docs/api/java/
   * @throws Exception
   */
  @SuppressWarnings("unused")
private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
