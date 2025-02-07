package Testcase;

import ReUsable_Codes.Login;
import org.testng.Reporter;

import static Browser_Factory.Browser_Drivers.driver;

public class S2_Login {

public static void Login_With_Valid_Credentials(){
    Reporter.log("Maximizing the browser window", true);
    driver.manage().window().maximize();
    Reporter.log("Logging in with valid user credentials", true);

    //Reporter.log("Logging in with valid user credentials", true);
    Login.Login_With_Valid_User_Name_And_Password();

    Reporter.log("Quitting the browser", true);
    driver.quit();
}
}

