package SchoolProject.Pages;
import SchoolProject.ExcutingCase.WebUI;
import org.openqa.selenium.By;

import static utils.driver.DriverManager.quit;

public class SelectField {


    By Select = By.xpath("//select[@id='unt_id']");
    By SearchButton = By.xpath("//button[@id='courseSearch']");
    By CourseNumber = By.xpath("//input[@type='search']");
    By AddButton = By.xpath("(//button[normalize-space()='Add'])[1]");
    By Pass = By.xpath("//div[@class='toast-message']");

    By Physical = By.xpath("//option[@value='XP00']");
    By Liberal = By.xpath("//option[@value='XB02']");
    By Csie = By.xpath("//option[@value='UE15']");

    By Grade =By.xpath("//select[@id='cls_year']");
    By AllGrade = By.xpath("//option[@value='ALL']");


    public void addPhysical(String CourseNo) {

        while(true) {
            WebUI.WaitForElementClickable(Select, 10);
            WebUI.ClickElementBy(Select);
            WebUI.WaitForElementClickable(Physical, 10);
            WebUI.ClickElementBy(Physical);

            WebUI.WaitForElementClickable(Grade, 10);
            WebUI.ClickElementBy(Grade);
            WebUI.WaitForElementClickable(AllGrade, 10);
            WebUI.ClickElementBy(AllGrade);

            WebUI.SendKeys(CourseNumber, CourseNo);

            WebUI.ClickElementBy(SearchButton);

            WebUI.Sleep(1);

            WebUI.WaitForElementClickable(AddButton, 10);
            WebUI.ClickElementBy(AddButton);


            WebUI.WaitForElementVisible(Pass,10);
            String passed = WebUI.GetText(Pass);
            WebUI.HAssert("限修人數已額滿!\n" +
                    "No vacancy for the restricted courses",passed);
            WebUI.Sleep(4);
            WebUI.OpenURL("https://aais5.nkust.edu.tw/selcrs_std/AddSelect/AddSelectPage");
            WebUI.Sleep(2);

        }
    }

    public void addLiberal(String CourseNo) {
        while(true) {
            WebUI.WaitForElementClickable(Select, 10);
            WebUI.ClickElementBy(Select);
            WebUI.WaitForElementClickable(Physical, 10);
            WebUI.ClickElementBy(Liberal);

            WebUI.WaitForElementClickable(Grade, 10);
            WebUI.ClickElementBy(Grade);
            WebUI.WaitForElementClickable(AllGrade, 10);
            WebUI.ClickElementBy(AllGrade);

            WebUI.SendKeys(CourseNumber, CourseNo);

            WebUI.ClickElementBy(SearchButton);

            WebUI.Sleep(1);

            WebUI.WaitForElementClickable(AddButton, 10);
            WebUI.ClickElementBy(AddButton);

            WebUI.WaitForElementVisible(Pass,10);
            String passed = WebUI.GetText(Pass);
            System.out.println("--------------------------------");
            System.out.println(passed);
            System.out.println("--------------------------------");
            WebUI.HAssert("限修人數已額滿!\n" +
                    "No vacancy for the restricted courses",passed);
            WebUI.Sleep(4);
            WebUI.OpenURL("https://aais5.nkust.edu.tw/selcrs_std/AddSelect/AddSelectPage");
            WebUI.Sleep(2);

        }
    }


    public void addCSIE(String CourseNo) {

        while(true) {
            WebUI.WaitForElementClickable(Grade, 10);
            WebUI.ClickElementBy(Grade);
            WebUI.WaitForElementClickable(AllGrade, 10);
            WebUI.ClickElementBy(AllGrade);

            WebUI.SendKeys(CourseNumber, CourseNo);

            WebUI.ClickElementBy(SearchButton);

            WebUI.Sleep(1);

            WebUI.WaitForElementClickable(AddButton, 10);
            WebUI.ClickElementBy(AddButton);

            String passed = WebUI.GetText(Pass);
            System.out.println("--------------------------------");
            System.out.println(passed);
            System.out.println("--------------------------------");
            WebUI.HAssert("限修人數已額滿!\n" +
                    "No vacancy for the restricted courses",passed);

            WebUI.Sleep(4);
            WebUI.OpenURL("https://aais5.nkust.edu.tw/selcrs_std/AddSelect/AddSelectPage");
            WebUI.Sleep(2);

        }
    }
}
