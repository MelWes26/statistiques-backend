package bj.finance.statistiquesbackend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "ministere")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ministere {

    @Id
    private Integer codeMini;

    @Column(nullable = false, length = 50)
    private String libCourtMini;

    @Column(length = 255)
    private String libLongMini;

    private LocalDate dateDebutMini;
    private LocalDate dateFinMini;
}
