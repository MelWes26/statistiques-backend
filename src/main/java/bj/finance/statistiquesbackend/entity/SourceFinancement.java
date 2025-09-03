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

    public Integer getCodeSouFinan() {
        return codeSouFinan;
    }

    public void setCodeSouFinan(Integer codeSouFinan) {
        this.codeSouFinan = codeSouFinan;
    }

    public String getLibSouFinan() {
        return libSouFinan;
    }

    public void setLibSouFinan(String libSouFinan) {
        this.libSouFinan = libSouFinan;
    }
}

