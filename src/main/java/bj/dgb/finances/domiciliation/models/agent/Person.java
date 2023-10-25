package bj.dgb.finances.domiciliation.models.agent;

import bj.dgb.finances.domiciliation.models.embeddable.Address;
import bj.dgb.finances.domiciliation.models.embeddable.ContactInfo;
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
