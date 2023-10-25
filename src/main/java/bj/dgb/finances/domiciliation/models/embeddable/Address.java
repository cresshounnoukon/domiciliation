package bj.dgb.finances.domiciliation.models.embeddable;

import bj.dgb.finances.domiciliation.models.agent.Locality;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private String description;

    private Locality locality;

}
