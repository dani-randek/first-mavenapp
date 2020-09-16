package dransoft;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Maven projekt main osztály
 *
 */
public class App
{

    /**
     * Main metódus
     * Beolvassa a persons.txt-ből a tárolt adatokat, majd eltárolha
     * óket egy Person arraylistben, végül pedig meghívja a Person
     * getFullName metódusát az összesre és kiírja az így visszakapott
     * sztringet.
     */
    public static void main( String[] args ) throws FileNotFoundException {
        Logger logger = LoggerFactory.getLogger(App.class);
        /*File personFile = new File(args[0]);
        List<INameable> people = new ArrayList<>();
        Scanner scanner = new Scanner(personFile);
        String splitBy = ",";
        String line;

        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            String[] personData = line.split(splitBy);
            Person person = new Person(personData[0], personData[1], Integer.parseInt(personData[2]), 0);
            people.add(person);

        }
        scanner.close();*/

        ScannerClass sc = new ScannerClass();
        String splitBy = ",";

        List<String> lines = sc.scannerMethod(args[0]);
        List<INameable> people = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++){
            String[] personData = lines.get(i).split(splitBy);
            Person person = new Person(personData[0], personData[1], Integer.parseInt(personData[2]));
            people.add(person);
        }

        for (INameable p : people) {
            logger.info( p.returnFullName());
        }

        lines = sc.scannerMethod(args[1]);
        List<INameable> dogs = new ArrayList<>();
        for(int i = 0; i < lines.size(); i++){
            String[] dogData = lines.get(i).split(splitBy);
            Dog dog = new Dog(dogData[0], Integer.parseInt(dogData[1]));
            dogs.add(dog);
        }

        for (INameable d : dogs) {
            logger.info( d.returnFullName());
        }

        Quadrilateral square = new Square(2,4);
        logger.info(square.getInfo());

        Quadrilateral rectangle = new Rectangle(5,4,2);
        logger.info(rectangle.getInfo());
    }
}
