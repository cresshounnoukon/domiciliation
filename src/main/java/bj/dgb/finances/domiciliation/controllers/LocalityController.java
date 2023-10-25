package bj.dgb.finances.domiciliation.controllers;

import bj.dgb.finances.domiciliation.models.agent.Locality;
import bj.dgb.finances.domiciliation.payloads.requests.LocalityRequest;
import bj.dgb.finances.domiciliation.payloads.responses.LocalityResponse;
import bj.dgb.finances.domiciliation.services.LocalityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("locality")
@RequiredArgsConstructor
@Slf4j
public class LocalityController {

    private final LocalityService localityService;

    @GetMapping()
    public List<LocalityResponse> readAll() {
        log.info("Obtention des localities");

        return localityService.readAll();
    }

    @GetMapping("/{id}")
    public Locality readById(Long id) {
        return null;
    }

    @PostMapping()
    public LocalityResponse create(@RequestBody LocalityRequest localityRequest) {
        return localityService.create(localityRequest);
    }

    @PutMapping("/update/{uuid}")
    public LocalityResponse update(@PathVariable("uuid") UUID uuid, @RequestBody LocalityRequest localityRequest) {
        return localityService.update(uuid, localityRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        System.out.println("Suppression");
    }
}
