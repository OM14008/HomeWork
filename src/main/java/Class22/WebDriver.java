package Class22;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void loadUrl(String Url);
    abstract void preformTesting();
    abstract void closeBrowse();

}
class ChromeDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening google chrome");
    }

    @Override
    void loadUrl(String Url) {
        System.out.println("loading website with google chrome");
    }

    @Override
    void preformTesting() {
        System.out.println("Testing the webpage on google chrome");
    }

    @Override
    void closeBrowse() {
        System.out.println("closing website with google chrome");
    }
}

