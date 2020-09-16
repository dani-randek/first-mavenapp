package dransoft;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Dog implements INameable {

    @Getter
    private String name;

    @Getter
    private int chipCode;

    @Override
    public String returnFullName() {
        return name+", "+ chipCode;
    }
}
