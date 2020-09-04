package dransoft;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        String personsCSV = "/Users/dradnek/maven/first-mavenapp/src/main/resources/persons.txt";
        File personFile = new File(personsCSV);
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(personFile);
        String splitBy = ",";
        String line;

        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            String[] personData = line.split(splitBy);
            Person person = new Person(personData[0], personData[1], Integer.parseInt(personData[2]));
            people.add(person);

        }
        scanner.close();

        for (Person p : people) {
            System.out.println(p.getFullName());
        }
    }
}
