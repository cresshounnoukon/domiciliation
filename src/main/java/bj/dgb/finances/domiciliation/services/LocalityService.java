package bj.dgb.finances.domiciliation.services;

import bj.dgb.finances.domiciliation.convertors.LocalityConvertor;
import bj.dgb.finances.domiciliation.exceptions.ResourceNotFoundExeption;
import bj.dgb.finances.domiciliation.models.agent.Locality;
import bj.dgb.finances.domiciliation.payloads.requests.LocalityRequest;
import bj.dgb.finances.domiciliation.payloads.responses.LocalityResponse;
import bj.dgb.finances.domiciliation.repositories.LocalityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class LocalityService {

    private final LocalityRepository localityRepository;
    private final LocalityConvertor localityConvertor;

    public List<LocalityResponse> readAll() {
        log.info("Récupération a partir du service");

        return localityConvertor.convert(localityRepository.findAll());
    }

    public Locality readById(UUID uuid) {
        return localityRepository.findById(uuid).orElseThrow(() -> new RuntimeException("Cette localité n'existe pas" + uuid));

    }

    public Locality readByCode(String code) {
        return localityRepository.findByCode(code).orElseThrow(() -> new RuntimeException("Cette localité n'existe pas" + code));
    }

    private boolean checkCode(String code) {
        return localityRepository.existsByCode(code);
    }

    public LocalityResponse create(LocalityRequest localityRequest) {
        if (checkCode(localityRequest.getCode())) {
            throw new ResourceNotFoundExeption("Cette localité existe déjà");
        }
        Locality parent = retrieveParent(localityRequest.getParent());
        Locality locality = localityConvertor.convert(localityRequest);
        locality.setParent(parent);
        localityRepository.save(locality);
        return localityConvertor.convert(locality);
    }

    private Locality retrieveParent(UUID parent) {

        if (parent != null) {
            return readById(parent);
        }
    }

    public LocalityResponse update(UUID id, LocalityRequest localityRequest) {

        Locality locality = readByCode(localityRequest.getCode());
        locality.setName(localityRequest.getName());
        locality.setParent(retrieveParent(localityRequest.getParent()));
        return localityConvertor.convert(localityRepository.save(locality));
    }

    public void delete(UUID id) {

        localityRepository.delete(readById(id));
    }
}
