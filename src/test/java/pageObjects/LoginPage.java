package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
//Locating Web Elements
	//Login Email ID
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	WebElement email;
	
	//Password
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement password;
	
	//Next Button
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d']")
	@CacheLookup
	WebElement next;
	
	//Next Button
	@FindBy(xpath="//span[@class='VfPpkd-vQzf8d']")
	@CacheLookup
	WebElement nextt;
	
	//Compose Button
	@FindBy(xpath="//div[@class='Yh akV']")
	@CacheLookup
	WebElement compose;
	
	//To Email ID
	@FindBy(xpath="//textarea[@name='to']")
	@CacheLookup
	WebElement to;
	
	//CC Tag Locator
	@FindBy(xpath="//span[@class='aB gQ pE']")
	@CacheLookup
	WebElement cc;
	
	//CC Email ID
	@FindBy(xpath="//textarea[@name='cc']")
	@CacheLookup
	WebElement ccm;
	
	//BCC Tag Locator
	@FindBy(xpath="//span[@class='aB  gQ pB']")
	@CacheLookup
	WebElement bcc;
	
	//BCC Email ID
	@FindBy(xpath="//textarea[@name='bcc']")
	@CacheLookup
	WebElement bccm;
	
	//Subject Box
	@FindBy(xpath="//input[@name='subjectbox']")
	@CacheLookup
	WebElement subject;
	
	//Body Box
	@FindBy(xpath="//div[@class='Am Al editable LW-avf tS-tW']")
	@CacheLookup
	WebElement body;
	
	//Minimize Compose Box
	@FindBy(xpath="//img[@class='Hl']")
	@CacheLookup
	WebElement minimize;
	
	//Full Screen Compose Box
	@FindBy(xpath="//img[@class='Hq aUG']")
	@CacheLookup
	WebElement maximize;
	
	//Close Compose Box
	@FindBy(xpath="//img[@class='Ha']")
	@CacheLookup
	WebElement close;
	
	//Undo Step
	@FindBy(xpath="//div[@class='te  aaA aaB']")
	@CacheLookup
	WebElement undo;
	
	//Redo Step
	@FindBy(xpath="//div[@class='sV  aaA aaB']")
	@CacheLookup
	WebElement redo;
	
	//Recipeint of Compose Box
	@FindBy(xpath="//div[@class='aoD hl']")
	@CacheLookup
	WebElement recipient;
	
	//Bold Function
	@FindBy(xpath="//div[@class='eN  aaA aaB']")
	@CacheLookup
	WebElement bold;
	
	//Italic Function
	@FindBy(xpath="//div[@class='e3  aaA aaB']")
	@CacheLookup
	WebElement italic;
	
	//Underline Function
	@FindBy(xpath="//div[@class='fu  aaA aaB']")
	@CacheLookup
	WebElement underline;
	
	//Send Button
	@FindBy(xpath="//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	@CacheLookup
	WebElement send;
	
	//Hyperlink Function
	@FindBy(xpath="//div[@class='e5 aaA aMZ']")
	@CacheLookup
	WebElement hyperlink;
	
	//Hyperlink Display Text
	@FindBy(xpath="//input[@id='linkdialog-text']")
	@CacheLookup
	WebElement hyperdisplaytxt;
	
	//Hyperlink Web URL
	@FindBy(xpath="//input[@id='linkdialog-onweb-tab-input']")
	@CacheLookup
	WebElement hyperweblink;
	
	//Hyperlink OK
	@FindBy(xpath="//button[@class='J-at1-auR']")
	@CacheLookup
	WebElement hyperok;
	
	//Emoji Function
	@FindBy(xpath="//div[@class='QT aaA aMZ']")
	@CacheLookup
	WebElement emoji;
	
	//Emoji Options
	@FindBy(xpath="//button[@class='a8v a8t']")
	@CacheLookup
	WebElement emojiop;
	
	//Select Emoji
	@FindBy(xpath="//button[@class='a8m']")
	@CacheLookup
	WebElement emojiselect;
	
	//Close Emoji Box
	@FindBy(xpath="//button[@class='a8o']")
	@CacheLookup
	WebElement emojiclose;
	
	//Discard Function
	@FindBy(xpath="//div[@class='og T-I-J3']")
	@CacheLookup
	WebElement discard;

	
//Setter Functions
	public void setUsername(String uname) {
		email.clear();
		email.sendKeys(uname);
	}
	
	public void setPassword(String pswd) {
		password.clear();
		password.sendKeys(pswd);
	}
	
	public void clickNext() {
		next.click();
	}
	
	public void clickNextt() {
		nextt.click();
	}
	
	public void clickCompose() {
		compose.click();
	}
	
	public void setTo(String too) {
		to.clear();
		to.sendKeys(too);
	}
	
	public void setCc(String ccc) {
		cc.click();
		ccm.clear();
		ccm.sendKeys(ccc);
	}
	
	public void setBcc(String bccc) {
		bcc.click();
		bccm.clear();
		bccm.sendKeys(bccc);
	}
	
	public void setSubject(String subjectt) {
		subject.clear();
		subject.sendKeys(subjectt);
	}
	
	public void setBody(String bodyy) {
		body.clear();
		body.sendKeys(bodyy);
	}
	
	public void setRecipient(String recipientt) {
		recipient.clear();
		recipient.sendKeys(recipientt);
	}
	
	public void setMinimize() {
		minimize.click();
	}
	
	public void setMaximize() {
		maximize.click();
	}
	
	public void setClose() {
		close.click();
	}
	
	public void setUndo() {
		undo.click();
	}
	
	public void setRedo() {
		redo.click();
	}
	
	public void setBold() {
		bold.click();
	}
	
	public void setItalic() {
		italic.click();
	}
	
	public void setUnderline() {
		underline.click();
	}
	
	public void setHyperlink() {
		hyperlink.click();
	}
	
	public void setHyperlinkText(String hypertext) {
		hyperdisplaytxt.click();
		hyperdisplaytxt.sendKeys(hypertext);
	}
	
	public void setWebAddress(String webadd) {
		hyperweblink.click();
		hyperweblink.sendKeys(webadd);
	}
	
	public void setOK() {
		hyperok.click();
	}
	
	public void setEmoji() {
		emoji.click();
		emojiop.click();
		emojiselect.click();
		emojiclose.click();
	}
	
	public void setDiscard() {
		discard.click();
	}
	
	public void clickSend() {
		send.click();
	}

}
