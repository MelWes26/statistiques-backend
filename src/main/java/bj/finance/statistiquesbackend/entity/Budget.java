package bj.finance.statistiquesbackend.entity;

// Budget.java
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter 
@NoArgsConstructor
@AllArgsConstructor
@Entity @Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExercice;

    private Integer annee; // CHECK(>=2000) géré côté DB

    @ManyToOne @JoinColumn(name = "codeMini")
    private Ministere ministere;

    @ManyToOne @JoinColumn(name = "codeUniAdmi")
    private UniteAdministrative uniteAdministrative;

    @ManyToOne @JoinColumn(name = "codeTypeBudget")
    private TypeBudget typeBudget;

    @ManyToOne @JoinColumn(name = "codeNatDep")
    private NatureDepense natureDepense;

    @ManyToOne @JoinColumn(name = "codeNatEco")
    private NatureEconomique natureEconomique;

    @ManyToOne @JoinColumn(name = "codeADP")
    private ADP adp;

    @ManyToOne @JoinColumn(name = "codeSouFinan")
    private SourceFinancement sourceFinancement;

    @ManyToOne @JoinColumn(name = "codeBailleur")
    private Bailleur bailleur;

    @ManyToOne @JoinColumn(name = "codeCatDep")
    private CategorieDepense categorieDepense;

    @ManyToOne @JoinColumn(name = "codeDepa")
    private Departement departement;


    @Column(precision = 18, scale = 2) private BigDecimal mtInitialAE = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtInitialCP = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTVireAE   = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTVireCP   = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTTransAE    = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTTransCP    = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTFondConAE = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTFondConCP      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTDepaAE     = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTDepaCP      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTReportCrediAE      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMVTReportCrediCP    = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtFinalAE      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtFinalCP     = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtTotalMVTAE      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtTotalMVTCP     = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtEngAE      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtEngCP  = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtMandatORD     = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtOPnonRegul     = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtPaye      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal nbreMandat      = BigDecimal.ZERO;
    @Column(precision = 18, scale = 2) private BigDecimal mtLiquide      = BigDecimal.ZERO;
    

    private String imputation;
}














