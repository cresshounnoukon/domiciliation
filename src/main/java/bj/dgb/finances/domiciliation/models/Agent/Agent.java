package bj.dgb.finances.domiciliation.models.Agent;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agent extends Person{
    //Agent (matricule, nom, prénoms, sexe, dateNaissance, email, téléphone, localite, adresse)

    private String matricule;

}
