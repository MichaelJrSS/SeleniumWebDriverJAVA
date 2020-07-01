import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;
import org.openqa.selenium.WebElement;
	
public class EncontrarElementos {

       private WebDriver driver;
		
	@Before // Acessa o site antes do teste em @test
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\TesteSelenium\\exe\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://calculadora-digital.com.br");
		
	}
	@Test //busca dos botoes
	public void clicarbotoes() throws InterruptedException {
										
			WebElement botao9 = driver.findElement(By.xpath("//input[@value='9']"));
			           botao9.click();
			           Thread.sleep(400);
			
			WebElement vezes = driver.findElement(By.xpath("//input[@value='x']"));
			           vezes.click();  
			           Thread.sleep(400);
			WebElement botao8 = driver.findElement(By.xpath("//input[@value='8']"));
			           botao8.click(); 
			           Thread.sleep(400);
			WebElement igual = driver.findElement(By.xpath("//input[@value='=']"));
			           igual.click();	            
	}          

	//@Test  //atualizacao da pagina
	//public void atualizarpagina() {
	//	driver.navigate().refresh();
	//}
	//@After // fechar a pagina
	//public void FecharPagina() {
	//	driver.quit();
	//}
}
