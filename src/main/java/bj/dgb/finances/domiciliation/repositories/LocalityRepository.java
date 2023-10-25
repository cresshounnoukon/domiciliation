package bj.dgb.finances.domiciliation.repositories;

import bj.dgb.finances.domiciliation.models.agent.Locality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface LocalityRepository extends JpaRepository<Locality, UUID> {
    Optional<Locality> findByCode(String code);

    boolean existsByCode(String code);

}
