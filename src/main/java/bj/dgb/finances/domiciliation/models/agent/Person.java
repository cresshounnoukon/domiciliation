package bj.dgb.finances.domiciliation.models.agent;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {

    protected String lastname;
    protected String firstname;
    protected Gender gender;
    protected LocalDate birthdate;
    protected ContactInfo contactInfo;
    protected Address address;
}
