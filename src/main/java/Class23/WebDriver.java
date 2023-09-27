package Class23;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("opens browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closes the browser");
    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {

    }

    @Override
    public void closeBrowser() {

    }

    @Override
    public void maximizeWindow() {

    }

    @Override
    public void findElement() {

    }
}
