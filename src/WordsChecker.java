import java.util.*;

public class WordsChecker {
    private String text;
    private Set<String> set;

    public WordsChecker(String text) {
        this.text = text;
        set = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }
    public boolean hasWord(String say) {
        return set.contains(say);
    }
}
