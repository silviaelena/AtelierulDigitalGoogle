package functional.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void buildInitialsString(List<String> words) {
        String result = words.stream()
                .map(word -> word.charAt(0))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(result);
    }

    public static void removeOddWords(List<String> oddWords) {
        // had to make a copy, otherwise immutable collection error when removeIf
        List<String> tmp = new ArrayList<>(oddWords);
        tmp.removeIf(word -> word.length() % 2 != 0);
        System.out.println(tmp);
    }

    public static void replaceWords(List<String> allWords) {
        List<String> tmp = new ArrayList<>(allWords);
        tmp.replaceAll(String::toUpperCase);
        System.out.println(tmp);
    }

    public static void main(String[] args) {
        List<String> words = List.of("ana", "are", "mere", "rosii");
        buildInitialsString(words);

        List<String> oddWords = List.of("hello", "world", "java", "functional");
        removeOddWords(oddWords);

        List<String> allWords = List.of("aiuheAdUYEdjoj", "ANA", "uehAAFHIUFE");
        replaceWords(allWords);
    }
}
