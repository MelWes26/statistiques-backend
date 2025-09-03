package bj.finance.statistiquesbackend.entity;

// Bailleur.java
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "bailleur")
public class Bailleur {
    @Id
    private Integer codeBailleur;

    @Column(nullable = false, length = 100)
    private String libBailleur;

    public Integer getCodeBailleur() {
        return codeBailleur;
    }

    public void setCodeBailleur(Integer codeBailleur) {
        this.codeBailleur = codeBailleur;
    }

    public String getLibBailleur() {
        return libBailleur;
    }

    public void setLibBailleur(String libBailleur) {
        this.libBailleur = libBailleur;
    }
}

