import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class WebShopTest {

    @Test
    public void webTestKart() {
        WebShop webShop = open(URL.urlWebShop, WebShop.class);
        webShop.testFullPriceKart();
    }
    @Test
    public void webTestLaptop() {
        WebShop webShop = open(URL.urlWebShop, WebShop.class);
        webShop.testFullPriceLaptop();
    }
    @Test
    public void webTestCheapComputer() {
        WebShop webShop = open(URL.urlWebShop, WebShop.class);
        webShop.testFullPriceCheapComputer();
    }

    @Test
    public void webTestOwnComputer() {
        WebShop webShop = open(URL.urlWebShop, WebShop.class);
        webShop.testFullPriceOwnComputer();
    }
    @Test
    public void webTestSimpleComputer() {
        WebShop webShop = open(URL.urlWebShop, WebShop.class);
        webShop.testFullPriceSimpleComputer();
    }


}