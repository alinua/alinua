package auto_framework;
/**
 * La classe CT1 represente les test des cas d'utilisation 
 * de l'espace de travail 
 * 1.1	creation d'un projet
 * 1.2	modification d'un projet
 * 
 * @author DBunel
 * @version 1.0
 * */

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CT1_1_0 {
  private static final int PAGE_TO_LOAD_TIMEOUT = 250;
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  /**
   * Initialise le Test de la classe CT00
   * 
   * @throws Exception
   */
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://alinua.fr/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  /**
   * Lance le Test de la classe CT00
   * 
   * @throws Exception
   */
  @Test
  public void testCT1_1_0() throws Exception {
    driver.get(baseUrl + "espace_de_travail/"); 
    //debut du test création de projet 1.1
    //debut du test  bouton close
    //chercher le bouton permettant de créer un projet cliquer dessus
    driver.findElement(By.xpath("//div[@id='Project']//contains[text(),'CreateProject']")).click();
    //ferme la boite modal
    driver.findElement(By.xpath("//div[@id='modal_header']//contains[text(),'close']")).click();
    
    
    //debut du test bouton annulé
    //chercher le bouton permettant de créer un projet cliquer dessus
    driver.findElement(By.xpath("//div[@id='Project']//contains[text(),'CreateProject']")).click();
    
    //cherche le bouton cancel
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'cancel']")).click();
    //le champ de nom du nouveau projet dans la boite modale doit etre vide
    String tmp = driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'name']")).getAttribute("value");
    if(tmp.compareTo("")!=0){
    	System.out.println("this attribute should be empty\n");
    } 
    //le champ des topiques doit être vide
    tmp=driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'topic']")).getAttribute("value");
    if(tmp.compareTo("")!=0){
    	System.out.println("this attribute should be empty\n");
    } 
    
    //le champ du lien doit être vide 
    tmp = driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'githubUrl']")).getAttribute("value");
    if(tmp.compareTo("")!=0){
    	System.out.println("this attribute should be empty\n");
    } 
    
    // fin du test bouton annulé
    
    //debut test bouton validé
    // la popin de creation de projet est ouverte
    //remplire le champ de nom du nouveau projet dans la boite modale
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'name']")).sendKeys("project_test");
     
    //remplire le champ correspondant au differents topique décrivent le projet
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'topic']")).sendKeys("topic0, topic1");
    
    //donner le lien vers le github du projet
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'githubUrl']")).sendKeys("https://github.com");
    
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'member']")).sendKeys("usertest");
    //ajouter un membre le champ member est reset
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'addMember']")).click();
    
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'member']")).sendKeys("usertest2");
    // deuxième membre ajouté
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'addMember']")).click();
    
    //valide le projet en cliquant sur le bouton validé
    driver.findElement(By.xpath("//div[@id='Popin_Create_Project']//contains[text(),'validProject']")).click();
    
    //fin test bouton validé
    
    //fin test création de projet 
    
    //aller dans l'espace de travail
    driver.get(baseUrl + "/espace_de_travail");
    
    //attendre le chargement
    driver.wait(PAGE_TO_LOAD_TIMEOUT);
    
    
    //debut test modification d'un projet
    //debut test bouton mise à jour
    //verifie que le projet a bien été créé, clique sur le nom affin de l'editer 1.1/1.2
    driver.findElement(By.xpath("//div[@id='User_Projects']//contains[text(),'project_test']")).click();
    
    // clique sur le bouton pour éditer le projet
    driver.findElement(By.xpath("//div[@id='Popin_Project']//contains[text(),'update']")).click();
    
    // vide le champ nom
    driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'name']")).clear();
    
    // rempli le champ nom avec un nouveau  nom
    driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'name']")).sendKeys("project_test_udated");
    
    // vide le champ des topiques
    driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'topics']")).clear();
    
    // rempli le champ des topique
    driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'name']")).sendKeys("topic3, topic4");
    
    // enleve un membre du groupe
    driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'usertest']")).click();
    
    // le profil est mis à jour
    driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'update_project']")).click();
    
    //fin test bouton mise à jour
    
    //debut test bouton annuler
    //clique sur le projet
    //chercher le bouton permettant de créer un projet cliquer dessus
    driver.findElement(By.xpath("//div[@id='Projects']//contains[text(),'project_test_updated']")).click();
    //
    String name = driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'name']")).getAttribute("value");
    
    //
    String topics=driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'topics']")).getAttribute("value");
    
    
    //
    String git = driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'githubUrl']")).getAttribute("value");
    
    //cliquer bouton cancel
    driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'cancel']")).click();
    //
    tmp = driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'name']")).getAttribute("value");
    if(tmp.compareTo(name)!=0){
    	System.out.println("Error the value should be equal to the initial one/n");
    }
    //
    tmp =driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'topics']")).getAttribute("value");
    if(tmp.compareTo(topics)!=0){
    	System.out.println("Error the value should be equal to the initial one/n");
    }
    
    //
    tmp = driver.findElement(By.xpath("//div[@id='Popin_Update_Project']//contains[text(),'githubUrl']")).getAttribute("value");
    if(tmp.compareTo(git)!=0){
    	System.out.println("Error the value should be equal to the initial one/n");
    }
    //fin test bouton annuler
    
    //fin test modificaction d'un projet 1.2
    
  }
  /**
   * Termine le Test de la classe CT01
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
