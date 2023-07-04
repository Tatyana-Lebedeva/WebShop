import com.codeborne.selenide.SelenideElement;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebShop {
    @Description("Строка названия товара: подарочной карты")
    @FindBy(how = How.XPATH,using = "(//a[@href='/25-virtual-gift-card'])[4]")
    private SelenideElement fullName;

    @Description("Строка цены подарочной карты")
    @FindBy(how = How.XPATH,using = "(//span[@class='price actual-price'])[1]")
    private SelenideElement fullPrice;
    public void testFullPriceKart(){
        fullPrice.scrollTo();
        Assertions.assertEquals("25.00",actualResult(fullPrice));}
    public String actualResult(SelenideElement element){
        return element.getText();
    }


    @Description("Добавить в корзину подарочную карту")
    @FindBy(how = How.XPATH,using = "(//a[@href='/25-virtual-gift-card'])[4]")
    private SelenideElement fullAddToBasket;


    @Description("Строка названия товара: Ноутбук")
    @FindBy(how = How.XPATH,using = "(//a[@href='/25-virtual-gift-card'])[4]")
    private SelenideElement fullNameLaptop;

    @Description("Строка цены ноутбука")
    @FindBy(how = How.XPATH,using = "//span[text()='1590.00']")
    private SelenideElement fullPriceLaptop;
    public void testFullPriceLaptop(){
        fullPrice.scrollTo();
        Assertions.assertEquals("1590.00",actualResult(fullPriceLaptop));}
    public String actualResultLaptop(SelenideElement element){
        return element.getText();}

    @Description("Добавить в корзину ноутбук")
    @FindBy (how = How.XPATH,using = "(//input[@type='button'])[4]")
    private SelenideElement fullAddToLaptop;

    @Description("Строка названия товара: Дешевый компьютер")
    @FindBy(how = How.XPATH,using = "(//a[@href='/build-your-cheap-own-computer'])[2]")
    private SelenideElement fullNameCheapComputer;

    @Description("Строка цены Дешевого компьютера")
    @FindBy(how = How.XPATH,using = "(//span[text()='800.00'])[1]")
    private SelenideElement fullPriceCheapComputer;
   public void testFullPriceCheapComputer(){
        fullPrice.scrollTo();
        Assertions.assertEquals("800.00",actualResult(fullPriceCheapComputer));}
    public String actualResultCheapComputer(SelenideElement element){
        return element.getText();}


    @Description("Добавить в корзину Дешевый компюьтер")
    @FindBy (how = How.XPATH,using = "(//input[@type='button'])[5]")
    private SelenideElement fullAddToCheapComputer;

    @Description("Строка названия товара: Собственный компьютер")
    @FindBy(how = How.XPATH,using = "(//a[@href='/build-your-own-computer'])[2]")
    private SelenideElement fullNameOwnComputer;

    @Description("Строка цены Собственного компьютера")
    @FindBy(how = How.XPATH,using = "//span[text()='1200.00']")
    private SelenideElement fullPriceOwnComputer;
    public void testFullPriceOwnComputer(){
        fullPrice.scrollTo();
        Assertions.assertEquals("1200.00",actualResult(fullPriceOwnComputer));}
    public String actualResultOwnComputer(SelenideElement element){
        return element.getText();}


    @Description("Добавить в корзину собственный компьютер")
    @FindBy (how = How.XPATH,using = "(//input[@value='Add to cart'])[4]")
    private SelenideElement fullAddToOwnComputer;


    @Description("Строка названия товара: Дорогой компьютер")
    @FindBy(how = How.XPATH,using = "(//a[@href='/build-your-own-expensive-computer-2'])[2]")
    private SelenideElement fullNameExpensiveComputer;

    @Description("Строка цены Дорогого компьютера")
    @FindBy(how = How.XPATH,using = "//span[text()='1800.00']")
    private SelenideElement fullPriceExpensiveComputer;
    public void testFullPriceExpensiveComputer(){
        fullPrice.scrollTo();
        Assertions.assertEquals("1800.00",actualResult(fullNameExpensiveComputer));}
    public String actualResultExpensiveComputer(SelenideElement element){
        return element.getText();}


    @Description("Добавить в корзину собственный компьютер")
    @FindBy (how = How.XPATH,using = "(//input[@value='Add to cart'])[5]")
    private SelenideElement fullAddToExpensiveComputer;


    @Description("Строка названия товара: Простой компьютер")
    @FindBy(how = How.XPATH,using = "(//a[@href='/simple-computer'])[2]")
    private SelenideElement fullNameSimpleComputer;

    @Description("Строка цены Простого компьютера")
    @FindBy(how = How.XPATH,using = "(//span[text()='800.00'])[2]")
    private SelenideElement fullPriceSimpleComputer;
    public void testFullPriceSimpleComputer(){
        fullPrice.scrollTo();
        Assertions.assertEquals("800.00",actualResult(fullPriceSimpleComputer));}
    public String actualResultSimpleComputer(SelenideElement element){
        return element.getText();}


    @Description("Добавить в корзину собственный компьютер")
    @FindBy (how = How.XPATH,using = "(//span[text()='800.00'])[2]/following::input")
    private SelenideElement fullAddToSimpleComputer;










}
