import File.Analysis;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test/testfile.txt");

        Analysis analysis = new Analysis(file);
        System.out.println(analysis.lines());
        System.out.println(analysis.characters());

    }
}
