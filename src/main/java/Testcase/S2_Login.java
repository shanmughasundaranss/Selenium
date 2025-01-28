package Testcase;

import ReUsable_Codes.Login;

import static Browser_Factory.Browser_Drivers.driver;

public class S2_Login {

public static void Login_With_Valid_Credentials(){
    driver.manage().window().maximize();
    Login.Login_With_Valid_User_Name_And_Password();
}
}
