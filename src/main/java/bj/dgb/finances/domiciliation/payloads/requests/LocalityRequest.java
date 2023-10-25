package bj.dgb.finances.domiciliation.payloads.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalityRequest {
    private String code;

    private String name;
}
