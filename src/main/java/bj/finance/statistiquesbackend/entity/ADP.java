package bj.finance.statistiquesbackend.entity;

// ADP.java
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "adp")
public class ADP {
    @Id
    private Integer codeADP;

    @Column(nullable = false, length = 100)
    private String libADP;

    @ManyToOne
    @JoinColumn(name = "codeADPParent")
    private ADP parent;

    @OneToMany(mappedBy = "parent")
    @JsonIgnore
    private List<ADP> enfants;

    public Integer getCodeADP() {
        return codeADP;
    }

    public void setCodeADP(Integer codeADP) {
        this.codeADP = codeADP;
    }

    public String getLibADP() {
        return libADP;
    }

    public void setLibADP(String libADP) {
        this.libADP = libADP;
    }

    public ADP getParent() {
        return parent;
    }

    public void setParent(ADP parent) {
        this.parent = parent;
    }

    public List<ADP> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<ADP> enfants) {
        this.enfants = enfants;
    }
}

