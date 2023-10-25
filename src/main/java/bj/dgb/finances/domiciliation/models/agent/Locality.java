package bj.dgb.finances.domiciliation.models.agent;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Locality {

    @Id
    @GeneratedValue
    private UUID id;
    @Column(nullable = false, unique = true)
    private String code;
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Locality parent;

    @OneToMany(fetch =FetchType.LAZY,mappedBy = "parent")
    private List<Locality> children;

}
