package bj.dgb.finances.domiciliation.payloads.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocalityResponse {
    private UUID uuid;
    private String code;

    private String name;
}
