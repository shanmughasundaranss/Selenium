package Config;

import Testcase.S2_Login;
import java.io.IOException;
import static Testcase.Create_New_Service_From_Shots.Create_New_Shot_From_Manage_Work_Shot_Screen;

public class Action_Keywords {

    public static void TestSuite1()  {
        try {
            S2_Login.Login_With_Valid_Credentials();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void TestSuite2() {

        try {
            Create_New_Shot_From_Manage_Work_Shot_Screen();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
