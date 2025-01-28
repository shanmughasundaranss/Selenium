package ReUsable_Codes;


public class Login extends Reusable_Library {
public static void Login_With_Valid_User_Name_And_Password(){

    SendKeys(Json_Extractor_Elements("Login_Elements", "Login_Page_Web_Elements", "User_Name"),Json_Extractor_Data("Login","Login_Page_Data","User_Name"));
    SendKeys(Json_Extractor_Elements("Login_Elements", "Login_Page_Web_Elements", "Password"),Json_Extractor_Data("Login","Login_Page_Data","Password"));
    Click_Element(Json_Extractor_Elements("Login_Elements", "Login_Page_Web_Elements", "Login_Button"));
}
}








