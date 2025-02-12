package Config;

import Testcase.S2_Login;
import java.io.IOException;
import static Browser_Factory.Browser_Drivers.Initailize_Driver;
import static Testcase.Create_New_Service_From_Shots.Create_New_Shot_From_Manage_Work_Shot_Screen;

public class Action_Keywords {

    public static void TestSuite1()  {
        try {
            S2_Login.Login_With_Valid_Credentials();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Login Testcase");


    }

    public static void TestSuite2() {

        try {
            Create_New_Shot_From_Manage_Work_Shot_Screen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Next Testcase yet to be Updated");

    }
}
