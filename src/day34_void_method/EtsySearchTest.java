package day34_void_method;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Etsy Search Smoke Test---");
        openBrowser();
        navigateToEtsy();
        searchForWoodenSpoon();
        v();
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome Browser");
    }
    public static void navigateToEtsy(){
        System.out.println("Open https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'Wooden spoon' in search field");
    }
    public static void v(){
        System.out.println("Search is done");
    }
}
