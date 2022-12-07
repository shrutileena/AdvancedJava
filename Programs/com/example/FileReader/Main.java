package Programs.com.example.FileReader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("F:\\Projects\\AdvancedJava\\Notes\\Basics.txt");

        digitsOnlyFileReader.readFile();
        digitsOnlyFileReader.getPath();
    }
}
