import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "quickbrownfoxjumpsoverlazydog";
        System.out.println(CheckSentence(sentence));
    }
    static boolean CheckSentence(String sentence){
        HashSet<Character> set = new HashSet<>();
        for(char c : sentence.toCharArray()){
            set.add(c);
        }
        if(set.size() == 26){
            return true;
        }
        return false;
    }
}
