package Config;

import Testcase.S2_Login;

import java.io.IOException;
import static Testcase.Create_New_Service_From_Shots.Create_New_Shot_From_Manage_Work_Shot_Screen;

public class Action_Keywords {

    public static void TestSuite1() throws IOException {

       S2_Login.Login_With_Valid_Credentials();
       System.out.println("Login Testcase");


    }

    public static void TestSuite2() throws IOException {

        Create_New_Shot_From_Manage_Work_Shot_Screen();
        System.out.println("Next Testcase yet to be Updated");

    }
}
