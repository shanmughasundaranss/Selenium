package Execution_Engine;

import Browser_Factory.Browser_Drivers;
import Config.Action_Keywords;
import ReUsable_Codes.Reusable_Library;
import Utilities.Excel_Utilities;
import org.testng.annotations.Test;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import static Browser_Factory.Browser_Drivers.driver;

public class Driver_Script extends Excel_Utilities {

    public static List<String> Return_value_of_Test_case_Name;
    public static String Return_Value_of_Test_case_Execution_Type;
    public static List<String> aList;
    public static String Replaced_Value;
    public static String value;

    @Test
    public static void Initalization() {

        try {

            Driver_Script Executer = new Driver_Script();
            get_Column_Values();
            Validator();
            //Executer.Method_And_Data_Validation();
            Reusable_Library.Get_Value_Froperty_File("URL");

            Launch_Browser();
            Call_TestCase_From_Action_keywords();

        } catch (IOException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            e.printStackTrace();
        }
    }

//public void Method_And_Data_Validation() {
//            if (aList != null && !aList.isEmpty()) {
//                for(String check: Column_Values1){
//                    System.out.println("Validated method values : " +Column_Values1);
//                }
//                for (String columnValue : aList) {
//                    System.out.println(" Validated Excel value: " + columnValue);
//                }
//                for (String columnValue : aList) {
//                    System.out.println("Excel : " +columnValue);
//                    if (Column_Values1.equals(columnValue)) {
//                        System.out.println("Pass: " + columnValue + " is present in aList.");
//                    } else {
//                        System.out.println("Fail: " + columnValue + " is not present in aList.");
//                    }
//                }
//            } else {
//                System.out.println("Column_Values1 is empty or null.");
//            }
//        }


    public static void Call_TestCase_From_Action_keywords () throws IOException {
        Action_Keywords.TestSuite1();

    }
    public static void Launch_Browser () throws IOException {
        Browser_Drivers.Choose_Browser(Reusable_Library.Get_Value_From_Property_File("Browser"));
        driver.get(Reusable_Library.Get_Value_From_Property_File("URL"));





    }
}
