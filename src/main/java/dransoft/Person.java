package dransoft;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
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

    /**
     *Visszaadja az adott ember vezetéknevét és keresztnevét, egy szóközzel elválasztva
     * @return String
     */
    public String getFullName(){
        return lastName + " " + firstName;
    }
}
