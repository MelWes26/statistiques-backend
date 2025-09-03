package bj.finance.statistiquesbackend.entity;

// SourceFinancement.java
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "source_financement")
public class SourceFinancement {
    @Id
    private Integer codeSouFinan;

    @Column(nullable = false, length = 100)
    private String libSouFinan;
}

