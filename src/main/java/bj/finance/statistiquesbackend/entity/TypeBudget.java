package bj.finance.statistiquesbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "type_budget")
public class TypeBudget {
    @Id
    private Integer codeTypeBudget;

    @Column(nullable = false, length = 100)
    private String libTypeBudget;

    public Integer getCodeTypeBudget() {
        return codeTypeBudget;
    }

    public void setCodeTypeBudget(Integer codeTypeBudget) {
        this.codeTypeBudget = codeTypeBudget;
    }

    public String getLibTypeBudget() {
        return libTypeBudget;
    }

    public void setLibTypeBudget(String libTypeBudget) {
        this.libTypeBudget = libTypeBudget;
    }
}
