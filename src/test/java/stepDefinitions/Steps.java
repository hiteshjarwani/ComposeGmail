package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage  lp;
	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL (String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
	}

	@When("User enter Email as {string}")
	public void user_enter_Email_as(String email) throws InterruptedException {
	    lp.setUsername(email);
	    Thread.sleep(500);
	}

	@When("Click on Next")
	public void click_on_Next() throws InterruptedException {
	    lp.clickNext();
	    Thread.sleep(2000);
	}

	@When("User enter Password as {string}")
	public void user_enter_Password_as(String password) throws InterruptedException {
	    lp.setPassword(password);
	    Thread.sleep(500);
	}
	
	@When("Click on Nextt")
	public void click_on_Nextt() throws InterruptedException {
	    lp.clickNextt();
	    Thread.sleep(2500);
	}

	@Then("User Click on Compose Button")
	public void user_Click_on_Compose_Button() throws InterruptedException {
	    lp.clickCompose();
	    Thread.sleep(1000);
	}

	@Then("User enter To as {string}")
	public void user_enter_To_as(String to) throws InterruptedException {
	    lp.setTo(to);
	    Thread.sleep(500);
	}
	
	@Then("User enter Recipient as {string}")
	public void user_enter_Recipient_as(String recipient) {
	    lp.setRecipient(recipient);
	}

	@Then("User enter cc as {string}")
	public void user_enter_cc_as(String cc) throws InterruptedException {
	   lp.setCc(cc);
	   Thread.sleep(500);
	}

	@Then("User enter bcc as {string}")
	public void user_enter_bcc_as(String bcc) {
	   lp.setBcc(bcc);
	}
	
	@Then("User enter subject as {string}")
	public void user_enter_subject_as(String subject) {
	    lp.setSubject(subject);
	}

	@Then("User enter body as {string}")
	public void user_enter_body_as(String body) {
	    lp.setBody(body);
	}

	@Then("User Click on Send Button")
	public void user_Click_on_Send_Button() throws InterruptedException {
	    lp.clickSend();
	    Thread.sleep(1000);
	}
	
	@Then("Minimize the Compose Box")
	public void minimize_the_Compose_Box() throws InterruptedException {
	    lp.setMinimize();
	    Thread.sleep(500);
	}

	@Then("Maximize the Compose Box")
	public void maximize_the_Compose_Box() throws InterruptedException {
	    lp.setMaximize();
	    Thread.sleep(500);
	}

	@Then("Close the Compose Box")
	public void close_the_Compose_Box() throws InterruptedException {
	    lp.setClose();
	    Thread.sleep(500);
	}

	@Then("Undo the Task")
	public void undo_the_Task() throws InterruptedException {
	    lp.setUndo();
	    Thread.sleep(500);
	}
	
	@Then("Redo the Task")
	public void redo_the_Task() throws InterruptedException {
	    lp.setRedo();
	    Thread.sleep(500);
	}

	@Then("Add Bold Function")
	public void add_Bold_Function() throws InterruptedException {
	    lp.setBold();
	    Thread.sleep(500);
	}

	@Then("Add Underline Function")
	public void add_Underline_Function() throws InterruptedException {
	    lp.setUnderline();
	    Thread.sleep(500);
	}

	@Then("Add Italic Function")
	public void add_Italic_Function() {
	    lp.setItalic();
	}

	@Then("Add Hyperlink as text as {string} and url as {string}")
	public void add_Hyperlink_as_text(String txt, String url) {
	    lp.setHyperlink();
	    lp.setHyperlinkText(txt);
	    lp.setWebAddress(url);
	    lp.setOK();
	}

	@Then("Add Emoji")
	public void add_Emoji() {
	    lp.setEmoji();
	}

	@Then("Clicking on Discard Draft")
	public void clicking_on_Discard_Draft() {
	    lp.setDiscard();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}
}	
