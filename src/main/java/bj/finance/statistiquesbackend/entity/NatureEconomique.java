package bj.finance.statistiquesbackend.entity;

// NatureEconomique.java

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "nature_economique")
public class NatureEconomique {
    @Id
    private Integer codeNatEco;

    @Column(nullable = false, length = 100)
    private String libNatEco;

    @ManyToOne
    @JoinColumn(name = "codeNatEcoParent")
    private NatureEconomique parent;

    @OneToMany(mappedBy = "parent")
    @JsonIgnore
    private List<NatureEconomique> enfants;

    public Integer getCodeNatEco() {
        return codeNatEco;
    }

    public void setCodeNatEco(Integer codeNatEco) {
        this.codeNatEco = codeNatEco;
    }

    public String getLibNatEco() {
        return libNatEco;
    }

    public void setLibNatEco(String libNatEco) {
        this.libNatEco = libNatEco;
    }

    public NatureEconomique getParent() {
        return parent;
    }

    public void setParent(NatureEconomique parent) {
        this.parent = parent;
    }

    public List<NatureEconomique> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<NatureEconomique> enfants) {
        this.enfants = enfants;
    }
}

