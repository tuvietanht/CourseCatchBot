package SchoolProject.ExcutingCase;
import SchoolProject.Pages.LoginPage;
import SchoolProject.Pages.SelectField;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase extends Login {
    private LoginPage loginPage;
    private SelectField selectField;

    @BeforeMethod
    public void setupTest() {
        loginPage = new LoginPage();
    }


    @Test(priority = 1)
    public void Add1() throws Exception {
            selectField = loginPage.ChoosePage("C110151176", "Binpro123");
            selectField.addPhysical("5444");

    }

    @Test(priority = 0)
    public void Add2() throws Exception {
            selectField = loginPage.ChoosePage("C110151176", "Binpro123");
            selectField.addLiberal("4441");
    }

    @Test(priority = 2)
    public void Add3() throws Exception {
        selectField = loginPage.ChoosePage("C110151176", "Binpro123");
        selectField.addCSIE("0405");
    }
}
