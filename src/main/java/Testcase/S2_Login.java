package Testcase;

import ReUsable_Codes.Login;
import org.testng.Reporter;

import static Browser_Factory.Browser_Drivers.driver;

public class S2_Login {

public static void Login_With_Valid_Credentials(){
    Login.Login_With_Valid_User_Name_And_Password();
}
}

