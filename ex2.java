import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static String a;
    static String b;

    public static void main(String[] args) throws IOException {
        String line = in.readLine();
      
        while (line != null) {
            a = line;
            b = in.readLine();
            
            int longestCommonSubstringCount = lcs(a.toCharArray(), b.toCharArray(), a.length(), b.length());
            System.out.println(longestCommonSubstringCount);
            
            line = in.readLine();
        }
        
        in.close();
        out.close();
    }
    
    public static int lcs(char[] s, char[] t, int n, int m)
    {
        int[][] dpTable = new int[2][m + 1];
        int count = 0;
     
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
              
                if (s[i - 1] == t[j - 1]) {
                    dpTable[i % 2][j] = dpTable[(i - 1) % 2][j - 1] + 1;
                    
                    if (dpTable[i % 2][j] > count) {
                        count = dpTable[i % 2][j];
                    }
                }
                else { 
                    dpTable[i % 2][j] = 0;
                }
            }
        }
        
        return count;
    }
}
