package Screen;

import java.util.Scanner;

public class LoginScreen {
    private static String username, password;
    private static boolean LoginDAO(String username, String password){
        if(username.equals("admin") &&
        password.equals("123")){
            return true;
        }
        return false;
    }
    public static void Login(Scanner sc){
        username = sc.nextLine();
        password = sc.nextLine();
        while(!LoginDAO(username, password)){
            //Message dialog appear when login invalid username and password
            System.out.println("Invalid user name or password!!!");
            username = sc.nextLine();
            password = sc.nextLine();
        }
    }
}
