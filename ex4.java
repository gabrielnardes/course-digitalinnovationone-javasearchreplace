import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        Map< String, String> map = new HashMap<>();

        map.put( "tesoura" , "lagarto papel"  );
        map.put( "pedra"   , "lagarto tesoura");
        map.put( "lagarto" , "spock papel"    );
        map.put( "papel"   , "spock pedra"    );
        map.put( "spock"   , "pedra tesoura"  );

        for (int i = 0; i < testCases; i++) {
            String[] input = br.readLine().split(" ");
            String fernanda = input[0];
            String marcia = input[1];

            String winConditionFernanda = map.get(fernanda);
            String winConditionMarcia = map.get(marcia);

            if (winConditionFernanda.contains(marcia)) {
                System.out.println("fernanda");
            } else if (winConditionMarcia.contains(fernanda)) {
                System.out.println("marcia");
            } else if (marcia.equals(fernanda)) {
                System.out.println("empate");
            }
        }
        
        br.close();
    }
}
