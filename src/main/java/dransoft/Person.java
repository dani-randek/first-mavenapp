package dransoft;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Person implements INameable{
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

    @Override
    public String returnFullName() {
        return lastName + " " + firstName;
    }
}
