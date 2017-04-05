package auto_framework;

/**
 * CT03est la classe de Test du cas d'utilisation CT03 Profil
 * 
 *  
 * @author pomainfroid
 * @version 1.0
 */
import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class CT3 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Connection cn=null;
  private Statement st=null;
  private ResultSet rs = null;
  /**
   * Initialise le Test de la classe CT03
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
    String url = "jdbc:mysql://localhost/test";
    String login = "root";
    String password = "";
    cn=null;
    st=null;
    rs = null;
    try {
    		//Chargement du driver
    		Class.forName("com.mysql.jdbc.Driver");
    		//Récupération de la connexion
    		cn = (Connection) DriverManager.getConnection(url,login,password);
    		//Création d'un statement
    		st = (Statement) cn.createStatement();
    } catch (ClassNotFoundException e) {
    	e.printStackTrace();
    }
  }

  /**
   * Lance le Test de la classe CT03
   * 
   * Test UserCase 3.0, 3.1, 3.2
   * @throws Exception
   */
  @Test
  public void testCT3() throws Exception {
    driver.get(baseUrl + "profil#!/");
    
    //Accès à la création d'une annonce
    driver.findElement(By.xpath("//div[@id='Annonces']//contains[text(),'bouton_plus_annonce']")).click();
    //Remplir les champs :
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'title']")).sendKeys("Annonce_test");
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'location']")).sendKeys("Location_test");
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'industry']")).sendKeys("Industry_test");
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'description']")).sendKeys("Ceci est une annonce Test");
    //clique sur le bouton valider
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'Valider']")).click();
    //Verification en cours de validation
    driver.findElement(By.xpath("//div[@id='Annonces']//contains[text(),'en cours de validation']"));
    // Problème attente de validation d'admin
  //verification BDD Verification email='blou@blou.fr' idLinkedIn='blou' role='alumni'
    String requete = "SELECT title,location,industry,description  from JOBADVERT where title='Annonce_test'";
    rs = (ResultSet) st.executeQuery(requete);
    while (rs.next()){
    	String result = rs.getString("title");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Annonce_test"));
    	}
    	result = rs.getString("location");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Location_test"));
    	}
    	result = rs.getString("industry");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Industry_test"));
    	}
    	result = rs.getString("description");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Ceci est une annonce Test"));
    	}
    }
    //MODIFICATION 3.1
  //Accès à la création d'une annonce
    driver.findElement(By.xpath("//div[@id='Annonces']//contains[text(),'bouton_modif_annonce']")).click();
    //Remplir les champs :
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'title']")).sendKeys("Annonce_test_Modif");
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'location']")).sendKeys("Location_test_Modif");
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'industry']")).sendKeys("Industry_test_Modif");
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'description']")).sendKeys("Ceci est une annonce Test_Modif");
    //clique sur le bouton valider
    driver.findElement(By.xpath("//div[@id='Popin_Create_Advert']//contains[text(),'Valider']")).click();
    //Verification en cours de validation
    driver.findElement(By.xpath("//div[@id='Annonces']//contains[text(),'en cours de validation']"));
 // Problème attente de validation d'admin
  //verification BDD Verification email='blou@blou.fr' idLinkedIn='blou' role='alumni'
    requete = "SELECT title,location,industry,description  from JOBADVERT where title='Annonce_test'";
    rs = (ResultSet) st.executeQuery(requete);
    while (rs.next()){
    	String result = rs.getString("title");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Annonce_test_Modif"));
    	}
    	result = rs.getString("location");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Location_test_Modif"));
    	}
    	result = rs.getString("industry");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Industry_test_Modif"));
    	}
    	result = rs.getString("description");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Ceci est une annonce Test_Modif"));
    	}
    }
    //CONSULTATION 3.2
    
    // Attente de description de la consultation car aucune information sur ce qui est afficher
  }
  /**
   * Termine le Test de la classe CT03
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
