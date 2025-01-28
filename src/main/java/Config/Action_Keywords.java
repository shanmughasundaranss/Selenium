package Config;

import Testcase.S2_Login;

public class Action_Keywords {

    public static void TestSuite1() {
        S2_Login.Login_With_Valid_Credentials();
        System.out.println("123");

    }

    public static void TestSuite2() {
        System.out.println("456");
    }
}