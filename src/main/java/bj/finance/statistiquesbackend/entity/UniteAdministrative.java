package bj.finance.statistiquesbackend.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
 @Setter @NoArgsConstructor
   @AllArgsConstructor
@Entity
 @Table(name = "unite_administrative")
public class UniteAdministrative {
    @Id
    private Integer codeUniAdmi;

    @Column(nullable = false, length = 100)
    private String libUniAdmi;

    public Integer getCodeUniAdmi() {
        return codeUniAdmi;
    }

    public void setCodeUniAdmi(Integer codeUniAdmi) {
        this.codeUniAdmi = codeUniAdmi;
    }

    public String getLibUniAdmi() {
        return libUniAdmi;
    }

    public void setLibUniAdmi(String libUniAdmi) {
        this.libUniAdmi = libUniAdmi;
    }
}
