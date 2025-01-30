package Execution_Engine;

import Browser_Factory.Browser_Drivers;
import Config.Action_Keywords;
import ReUsable_Codes.Reusable_Library;
import Utilities.Excel_Utilities;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
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

    Browser_Drivers.Choose_Browser(Get_Value_From_Property_File("Browser"));
    driver.get(Get_Value_From_Property_File("URL"));
   //String one =  Get_Value_From_Property_File("Headless_Mode");
    System.out.println("Headless_value: "+ Get_Value_From_Property_File("Browser1") );



}
@BeforeTest
public static void BeforeTest() throws IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
   // get_Column_Values();
   // Validator();



    }
@BeforeClass
public static void BeforeClass(){



    }

@BeforeMethod
public static void BeforeMethod(){



    }
@Test
public static void Initalization() {

    //Driver_Script Executer = new Driver_Script();

    //Executer.Method_And_Data_Validation();
    //Get_Value_From_Property_File("URL");
//            Launch_Browser();
    Action_Keywords.TestSuite1();

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
