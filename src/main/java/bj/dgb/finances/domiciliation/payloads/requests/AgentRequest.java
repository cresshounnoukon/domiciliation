package bj.dgb.finances.domiciliation.payloads.requests;

import bj.dgb.finances.domiciliation.models.Agent.Address;
import bj.dgb.finances.domiciliation.models.Agent.ContactInfo;
import bj.dgb.finances.domiciliation.models.Agent.Gender;

import java.time.LocalDate;

public class AgentRequest {
    private String matricule;
    private String lastname;
    private String firstname;
    private String gender;
    private LocalDate birthdate;
    private ContactInfo contactInfo;
    private AddressRequest address;
}
