import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();

        while (line != null) {
            boolean tagStart = true;
            String markdown;
            String tag;
            
            while (line.contains("_") || line.contains("*")) {
                if (line.contains("_")) {
                    markdown = "_";
                    tag = tagStart == true ? "<i>" : "</i>";
                } else {
                    markdown = "\\*";
                    tag = tagStart == true ? "<b>" : "</b>";
                }
                
                tagStart = !tagStart;
                line = line.replaceFirst(markdown, tag);
            }
            
            System.out.println(line);
            line = br.readLine();
        }
        
        br.close();
      }
}
