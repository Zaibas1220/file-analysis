package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {

    private File file;

    public Analysis (File file){
        this.file = file;
    }

    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int count = 0;
        while (reader.hasNextLine()){
            count++;
            reader.nextLine();
        }
        reader.close();
        return count;
    }

    public int characters() throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        int count = 0;
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            count += line.length()+1;
        }
        reader.close();
        return count;
    }
}
