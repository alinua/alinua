package auto_framework;

/**
 * CT0 est la classe de Test du cas d'utilisation CT00 Inscription et authentification
 * 
 *  
 * @author pomainfroid
 * @version 1.0
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;


public class CT0 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Connection cn=null;
  private Statement st=null;
  private ResultSet rs = null;
  /**
   * Initialise le Test de la classe CT00
   * 
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
	  WebDriver driver =new FirefoxDriver();
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
   * Lance le Test de la classe CT00
   * 
   * @throws Exception
   */
  @Test
  public void testCT0() throws Exception {
    driver.get(baseUrl + "index.html#!/");
    //Acces à la popin d'inscription
    driver.findElement(By.xpath("//div[@id='Inscription']//contains[text(),InscriptionUtilisateur]")).click();
    driver.findElement(By.xpath("//div[@id='Popin-Inscription']//contains[text(),Login]")).click();
    //Attente des login/mdp
    driver.wait(10000);
    //Popin inscription, insertion de la promotion
    driver.findElement(By.xpath("//div[@id='Popin-Inscription']//contains[text(),Promotion]")).sendKeys("2012");
    //Validation de l'inscription
    driver.findElement(By.xpath("//div[@id='Popin-Inscription']//contains[text(),Valider]")).click();
    //verification BDD Verification email='blou@blou.fr' idLinkedIn='blou' role='alumni'
    String requete = "SELECT email,idLinked,role,a.year  from USER INNER JOIN ALUMNI a on idLinkedIn=a.user where idLinkedIn=a.user and idLinkedIn='Blou'";
    rs = (ResultSet) st.executeQuery(requete);
    while (rs.next()){
    	String result = rs.getString("email");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("Blou@blou.fr"));
    	}
    	result = rs.getString("idLinkedIn");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("blou"));
    	}
    	result = rs.getString("role");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("alumni"));
    	}
    	result = rs.getString("year");
    	System.out.println(result);
    	if(!result.equals("")){
    	assertTrue(result.equals("2012"));
    	}
    }
  }
  /**
   * Termine le Test de la classe CT00
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
    try { //libérer les ressources de la mémoire
    	cn.close();
    	st.close();
    } catch (SQLException e) {
    	e.printStackTrace();
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
