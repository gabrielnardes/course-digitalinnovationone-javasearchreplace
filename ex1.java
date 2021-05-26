import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = Integer.parseInt(sc.nextLine());
        
        for (int t = 0; t < testCases; t++) {
            String input = sc.nextLine();
            String[] inputArray = input.split(" ");

            List<Word> words = new ArrayList<>();
            
            for (int i = 0; i < inputArray.length; i++) {
                words.add(new Word(inputArray[i]));
            }
            
            Comparator <Word> cp = Comparator.comparing(Word::getSize).reversed()
                                             .thenComparing(Word::getWord);
                                             
            words.stream().sorted(cp).forEach(Word::print);
            
            System.out.println();
        }
        
    }
}

class Word {
    private String word;
    private int size;
    
    public Word(String word) {
        this.word = word;
        this.size = word.length();
    }
    
    public String getWord() {
        return word;
    }
        
    public int getSize() {
        return size;
    }
    
    public void print() {
        System.out.printf("%s ", word);
    }
}
