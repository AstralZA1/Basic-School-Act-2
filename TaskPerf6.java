import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.*;
public class TaskPerf6{
    private static Scanner input;

    public static void main(String[]args){
        input = new Scanner(System.in);
        Path file = Paths.get("D:\\AstralFiles\\Programming 3\\records.txt");
        String recordsuser = "";
        String recordspass = "";
        String username = "";
        String password = "";
        String quit = "Q";
        String action = "";
        String pass = "Password: ";
        String user = "Username: ";
        try{
        OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, APPEND));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        while(action!=quit){
        System.out.print("Press R to Register, Press L to Login or Q to Quit: ");  
        action = input.nextLine();
        if(action.equalsIgnoreCase("R")){
        System.out.print("Enter username: ");
        username = input.nextLine();
        System.out.print("Enter password: ");
        password = input.nextLine();
        recordsuser = username;
        writer.write(user, 0, user.length());
        writer.write(recordsuser, 0, recordsuser.length());
        writer.newLine();
        writer.write(pass, 0, pass.length());
        recordspass = password;
        writer.write(recordspass, 0, recordspass.length());
        writer.newLine();
    }else if(action.equalsIgnoreCase("L")){
        System.out.print("Enter your username: ");
        String username1 = input.nextLine();
        System.out.print("Enter your password: ");
        String password1 = input.nextLine();
        if(username1.equals(username)||password1.equals(password)){
            System.out.println("Successfully logged in");
        }else{
            System.out.println("Incorrect username or password");
        }
    }else if(action.equalsIgnoreCase("Q")){
        writer.close();
        System.exit(0);
    }
}
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
