package bj.dgb.finances.domiciliation.convertors;

import bj.dgb.finances.domiciliation.models.agent.Locality;
import bj.dgb.finances.domiciliation.payloads.requests.LocalityRequest;
import bj.dgb.finances.domiciliation.payloads.responses.LocalityResponse;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class LocalityConvertor {


    public Locality convert(LocalityRequest localityRequest) {
        return Locality
                .builder()
                .code(localityRequest.getCode())
                .name(localityRequest.getName())
                .build();
    }

    public LocalityResponse convert(Locality locality) {
        return LocalityResponse.builder()
                .code(locality.getCode())
                .name(locality.getName())
                .uuid(locality.getId())
                .build();
    }

    public List<LocalityResponse> convert(List<Locality> localities) {

        return localities.stream().map(this::convert).toList();
    }
}
