package SchoolProject.Pages;
import SchoolProject.ExcutingCase.WebUI;
import org.openqa.selenium.By;

public class LoginPage {
    By idName = By.xpath("//input[@id='UserAccount']");
    By password = By.xpath("//input[@id='Password']");
    By LoginButton = By.xpath("//button[@id='Login']");




    public SelectField ChoosePage(String id , String pass)
    {
        WebUI.OpenURL("https://aais5.nkust.edu.tw/selcrs_std/AddSelect/AddSelectPage");
        WebUI.WaitForElementClickable(idName, 10);
        WebUI.SendKeys(idName , id);

        WebUI.SendKeys(password, pass);
        WebUI.ClickElementBy(LoginButton);
        WebUI.Sleep(1);
        WebUI.OpenURL("https://aais5.nkust.edu.tw/selcrs_std/AddSelect/AddSelectPage");
        WebUI.Sleep(1);
        return new SelectField();
    }

}
