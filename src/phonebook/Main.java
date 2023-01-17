package phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void findUser() {
        BufferedReader reader;
        boolean foundUsers = false;

        try {
            reader = new BufferedReader(new FileReader("/Users/silvianistor/IdeaProjects/AtelierulDigitalGoogle/src/phonebook/phonebook.txt"));
            String line = reader.readLine();
            while (line != null && !foundUsers) {
                String[] tokens = line.split(" ");
                if (tokens[0].equals("Abbey"))
                    System.out.print(tokens[1] + ", ");
                if (tokens[0].equals("Abdul")) {
                    foundUsers = true;
                    System.out.print(tokens[1]);
                }
                line = reader.readLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        findUser();
    }
}
