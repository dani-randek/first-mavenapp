package dransoft;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class Person {

    /**
     *Az adott ember keresztneve
     */
    @Getter private String firstName;
    /**
     *Az adott ember vezetékneve
     */
    @Getter private String lastName;
    /**
     *Az adott ember születési éve
     */
    @Getter private int yob;

    public Person(String last, String first, int year){
        lastName = last;
        firstName = first;
        yob = year;
    }

    /**
     *Visszaadja az adott ember vezetéknevét és keresztnevét, egy szóközzel elválasztva
     * @return String
     */
    public String getFullName(){
        return lastName + " " + firstName;
    }
}
