package bj.finance.statistiquesbackend.entity;

// Bailleur.java
import jakarta.persistence.*;
import lombok.*;

@Getter 
@Setter
@NoArgsConstructor 
@AllArgsConstructor
@Entity 
@Table(name = "departement")
public class Departement {
    @Id
    private Integer codeDepa;

    @Column(nullable = false, length = 100)
    private String libDepa;



}
