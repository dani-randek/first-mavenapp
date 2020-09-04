package dransoft;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String personsCSV = "/Users/dradnek/maven/first-mavenapp/src/main/resources/persons.txt";
        String line = "";
        String splitBy = ",";
        List<Person> people = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(personsCSV))) {

            while ((line = br.readLine()) != null) {

                String[] personData = line.split(splitBy);
                Person person = new Person(personData[0], personData[1], Integer.parseInt(personData[2]));
                people.add(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Person p : people) {
            System.out.println(p.getFullName());
        }
    }
}
