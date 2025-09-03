package bj.finance.statistiquesbackend.entity;

// NatureDepense.java
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "nature_depense")
public class NatureDepense {
    @Id
    private Integer codeNatDep;

    @Column(nullable = false, length = 100)
    private String libNatDep;
}

