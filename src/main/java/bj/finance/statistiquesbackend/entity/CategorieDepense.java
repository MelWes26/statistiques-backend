package bj.finance.statistiquesbackend.entity;

// CategorieDepense.java
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "categorie_depense")
public class CategorieDepense {
    @Id
    private Integer codeCatDep;

    @Column(nullable = false, length = 100)
    private String libCatDep;
}

