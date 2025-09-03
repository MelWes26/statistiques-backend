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

    public Integer getCodeMini() {
        return codeMini;
    }

    public void setCodeMini(Integer codeMini) {
        this.codeMini = codeMini;
    }

    public String getLibCourtMini() {
        return libCourtMini;
    }

    public void setLibCourtMini(String libCourtMini) {
        this.libCourtMini = libCourtMini;
    }

    public String getLibLongMini() {
        return libLongMini;
    }

    public void setLibLongMini(String libLongMini) {
        this.libLongMini = libLongMini;
    }

    public LocalDate getDateDebutMini() {
        return dateDebutMini;
    }

    public void setDateDebutMini(LocalDate dateDebutMini) {
        this.dateDebutMini = dateDebutMini;
    }

    public LocalDate getDateFinMini() {
        return dateFinMini;
    }

    public void setDateFinMini(LocalDate dateFinMini) {
        this.dateFinMini = dateFinMini;
    }
}
