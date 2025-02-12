package Execution_Engine;

import Browser_Factory.Browser_Drivers;
import Config.Action_Keywords;
import ReUsable_Codes.Reusable_Library;
import Utilities.Excel_Utilities;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static Browser_Factory.Browser_Drivers.Initailize_Driver;
import static Browser_Factory.Browser_Drivers.driver;
import static ReUsable_Codes.Reusable_Library.Get_Value_From_Property_File;

public class Driver_Script extends Excel_Utilities {

    public static List<String> Return_value_of_Test_case_Name;
    public static String Return_Value_of_Test_case_Execution_Type;
    public static List<String> aList;
    public static String Replaced_Value;
    public static String value;



@BeforeSuite
public static void BeforeSuite() throws IOException {
    Initailize_Driver();


}
@BeforeTest
public static void BeforeTest() throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    Excel_Testcases();
    Testcase_Validator();



    }
@BeforeClass
public static void BeforeClass(){



    }

@BeforeMethod
public static void BeforeMethod(){



    }
@Test
public static void Initalization() {
    Reporter.log("Browser Initailized", true);

}


@AfterMethod
public static void AfterMethod(){



    }

@AfterClass
public static void AfterClass(){



    }
@AfterTest
public static void AfterTest(){

    }

@AfterSuite
public static void AfterSuite(){

    }
    public static void Call_TestCase_From_Action_keywords () throws IOException {


    }
public static void Launch_Browser () throws IOException {

}
}
