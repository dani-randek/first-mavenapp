package dransoft;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ScannerClass {

    public List<String> scannerMethod(String filename) throws FileNotFoundException {
        File personFile = new File(filename);
        java.util.Scanner scanner = new java.util.Scanner(personFile);
        List<String> lines = new ArrayList<>();
        String line;
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            lines.add(line);
        }
        scanner.close();
        return lines;
    }
}
