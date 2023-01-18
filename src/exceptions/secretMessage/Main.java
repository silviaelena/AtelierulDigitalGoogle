package exceptions.secretMessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        String line;
        String secretMessage = "";

        try {
            reader = new BufferedReader(new FileReader("/Users/silvianistor/IdeaProjects/AtelierulDigitalGoogle/src/exceptions/secretMessage/secret_message.txt"));
            line = reader.readLine();

            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isUpperCase(line.charAt(i))) {
                        secretMessage += line.charAt(i);
                    }
                }
                line = reader.readLine();
            }
        } catch(IOException e) {
            System.out.println("An error occurred while processing the file");
        }

        try {
            secretMessage = secretMessage.replace('X', ' ');
        } catch (NullPointerException e) {
            System.out.println(secretMessage);
        }

        System.out.println("Secret Message: " + secretMessage);
    }
}
