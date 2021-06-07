import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String password = br.readLine();
          
        Pattern specialChars = Pattern.compile("[^a-zA-Z0-9]");
        Pattern atLeastOne = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])");
         
        while (password != null) {
            
            if (password.length() < 6 || password.length() > 32 ||
                specialChars.matcher(password).find() ||
                !atLeastOne.matcher(password).find() ) {
                
                System.out.println("Senha invalida.");
            } else {
              System.out.println("Senha valida.");
            }
            
              password = br.readLine();
        }
        
        br.close();
      }
}
