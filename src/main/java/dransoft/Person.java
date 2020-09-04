package dransoft;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class Person {

    @Getter private String firstName;
    @Getter private String lastName;
    @Getter private int yob;

    public String getFullName(){
        return lastName + " " + firstName;
    }
}
