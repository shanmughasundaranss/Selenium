package Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import Config.Action_Keywords;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ReUsable_Codes.Reusable_Library;

public class Excel_Utilities {
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    public static String Sheet_Name = "Test_case";
    public static List<String> Column_Values1 = new ArrayList<String>();
    public static List<String> aList = new ArrayList<String>();


    public static void setExcelFile(String path) throws IOException {

        FileInputStream fs = new FileInputStream(path);
        workbook = new XSSFWorkbook(fs);

    }

    public static void get_Column_Values() throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String Get_Driver_File_Path = Reusable_Library.Get_Value_From_Property_File("Exection_Sheet_Location");
        Excel_Utilities.setExcelFile(Get_Driver_File_Path);
        sheet = workbook.getSheet(Sheet_Name);
        int row = sheet.getLastRowNum();
        System.out.println("Step 2 :Total Count Of the Values in the ACTION KEYWORD Row : " + row);
        Column_Values1.clear();
        Excel_Utilities one = new Excel_Utilities();
        one.Get_Methods();
        for (int a = 1; a <= row; a++) {
            String Row_Cell = sheet.getRow(a).getCell(8) != null
                    ? sheet.getRow(a).getCell(8).toString()
                    : "Empty";
            System.out.println("Excel Data Before added to list: " + Row_Cell);

            Column_Values1.add(Row_Cell);
        }
    }
        public static void Get_Methods () {
            try {
                Class<?> clazz = Action_Keywords.class;
                Method[] methods = clazz.getDeclaredMethods();
                if (aList == null) {
                    aList = new ArrayList<String>();
                }

                for (int i = 0; i < methods.length; i++) {
                    String Listofmethods = methods[i].toString();
                    String Trim_Class_Name = Listofmethods.replace("public static void Config.Action_Keywords.", "").trim();
                    System.out.println("Method Name Before Stored: "+ Trim_Class_Name);
                    aList.add(Trim_Class_Name);
                }
            } catch (Throwable e) {
                System.err.println(e);
            }
        }

public static  void Validator () {

    if (Column_Values1 != null && !Column_Values1.isEmpty()) {
        for (String value : Column_Values1) {
            if (value != null) {
                int length = value.length();
                System.out.println("Excel Data  Count After Stored: " + value + " | Length: " + length);
                for (int i = 0; i < value.length(); i++) {
                    //System.out.println("check :" + value.charAt(i));
                }
            } else {
                                     System.out.println("Methods Count: null | Length: 0");
            }
        }
    } else {
        System.out.println("aList is empty or null.");
    }
///
    if (aList != null && !aList.isEmpty()) {
        for (String value : aList) {
            if (value != null) {
                int length = value.length();
                System.out.println("Method Name  Count After Stored: " + value + " | Length: " + length);
                for (int i = 0; i < value.length(); i++) {
                    //System.out.println("check :" + value.charAt(i));
                }
            } else {
                System.out.println("Methods Name: null | Length: 0");
            }
        }
    } else {
        System.out.println("aList is empty or null.");
    }
///

    for (String item : Column_Values1) {
        if (item.equals(aList)) {
            // logic here
            System.out.println("pass");

        } else {
            System.out.println("Fail");

        }

    }
}
        }
