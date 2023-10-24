package bj.dgb.finances.domiciliation.services;

import bj.dgb.finances.domiciliation.models.Agent.Locality;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class LocalityService {

    public List<Locality> readAll() {
        log.info("Getting localities");
        return new ArrayList<>();
    }

    public Locality readById(Long id) {
        return null;
    }

    public Locality create(Locality locality) {
        return null;
    }

    public Locality update(Long id, Locality locality) {
        return null;
    }

    public void delete(Long id) {
        System.out.println("Suppression");
    }
}
