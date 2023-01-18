package exceptions.anagram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static boolean isAnagram(String word, String myWord) {
        return true;
        // TODO
    }

    public static void main(String[] args) throws IOException {
        FileWriter outputFile = null;
        Scanner wordListFile = null;
        String myWord = "listen";

        try {
            outputFile = new FileWriter("/Users/silvianistor/IdeaProjects/AtelierulDigitalGoogle/src/exceptions/anagram/output");
            wordListFile = new Scanner(new File("/Users/silvianistor/IdeaProjects/AtelierulDigitalGoogle/src/exceptions/anagram/wordlist.txt"));

            while (wordListFile.hasNext()) {
                String word = wordListFile.next();
                if (isAnagram(word, myWord)) {
                    outputFile.write(word);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File was not found!");
        } finally {
            outputFile.close();
            wordListFile.close();
        }
    }
}
