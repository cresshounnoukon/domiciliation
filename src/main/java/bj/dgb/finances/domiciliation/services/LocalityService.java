package bj.dgb.finances.domiciliation.services;

import bj.dgb.finances.domiciliation.convertors.LocalityConvertor;
import bj.dgb.finances.domiciliation.models.agent.Locality;
import bj.dgb.finances.domiciliation.payloads.requests.LocalityRequest;
import bj.dgb.finances.domiciliation.payloads.responses.LocalityResponse;
import bj.dgb.finances.domiciliation.repositories.LocalityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class LocalityService {

    private final LocalityRepository localityRepository;
    private final LocalityConvertor localityConvertor;

    public List<Locality> readAll() {
        log.info("Récupération a partir du service");
        return localityRepository.findAll();
    }

    public Locality readById(Long id) {
        return null;
    }

    public LocalityResponse create(LocalityRequest localityRequest) {
        Locality locality = localityRepository.save(localityConvertor.convert(localityRequest));
        return localityConvertor.convert(locality);
    }

    public Locality update(Long id, Locality locality) {
        return null;
    }

    public void delete(Long id) {
        System.out.println("Suppression");
    }
}
