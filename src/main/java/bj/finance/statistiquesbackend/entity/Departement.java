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

    public Integer getCodeDepa() {
        return codeDepa;
    }

    public void setCodeDepa(Integer codeDepa) {
        this.codeDepa = codeDepa;
    }

    public String getLibDepa() {
        return libDepa;
    }

    public void setLibDepa(String libDepa) {
        this.libDepa = libDepa;
    }
}
