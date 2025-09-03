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

    public Long getIdExercice() {
        return idExercice;
    }

    public void setIdExercice(Long idExercice) {
        this.idExercice = idExercice;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Ministere getMinistere() {
        return ministere;
    }

    public void setMinistere(Ministere ministere) {
        this.ministere = ministere;
    }

    public UniteAdministrative getUniteAdministrative() {
        return uniteAdministrative;
    }

    public void setUniteAdministrative(UniteAdministrative uniteAdministrative) {
        this.uniteAdministrative = uniteAdministrative;
    }

    public TypeBudget getTypeBudget() {
        return typeBudget;
    }

    public void setTypeBudget(TypeBudget typeBudget) {
        this.typeBudget = typeBudget;
    }

    public NatureDepense getNatureDepense() {
        return natureDepense;
    }

    public void setNatureDepense(NatureDepense natureDepense) {
        this.natureDepense = natureDepense;
    }

    public NatureEconomique getNatureEconomique() {
        return natureEconomique;
    }

    public void setNatureEconomique(NatureEconomique natureEconomique) {
        this.natureEconomique = natureEconomique;
    }

    public ADP getAdp() {
        return adp;
    }

    public void setAdp(ADP adp) {
        this.adp = adp;
    }

    public SourceFinancement getSourceFinancement() {
        return sourceFinancement;
    }

    public void setSourceFinancement(SourceFinancement sourceFinancement) {
        this.sourceFinancement = sourceFinancement;
    }

    public Bailleur getBailleur() {
        return bailleur;
    }

    public void setBailleur(Bailleur bailleur) {
        this.bailleur = bailleur;
    }

    public CategorieDepense getCategorieDepense() {
        return categorieDepense;
    }

    public void setCategorieDepense(CategorieDepense categorieDepense) {
        this.categorieDepense = categorieDepense;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public BigDecimal getMtInitialAE() {
        return mtInitialAE;
    }

    public void setMtInitialAE(BigDecimal mtInitialAE) {
        this.mtInitialAE = mtInitialAE;
    }

    public BigDecimal getMtInitialCP() {
        return mtInitialCP;
    }

    public void setMtInitialCP(BigDecimal mtInitialCP) {
        this.mtInitialCP = mtInitialCP;
    }

    public BigDecimal getMtMVTVireAE() {
        return mtMVTVireAE;
    }

    public void setMtMVTVireAE(BigDecimal mtMVTVireAE) {
        this.mtMVTVireAE = mtMVTVireAE;
    }

    public BigDecimal getMtMVTVireCP() {
        return mtMVTVireCP;
    }

    public void setMtMVTVireCP(BigDecimal mtMVTVireCP) {
        this.mtMVTVireCP = mtMVTVireCP;
    }

    public BigDecimal getMtMVTTransAE() {
        return mtMVTTransAE;
    }

    public void setMtMVTTransAE(BigDecimal mtMVTTransAE) {
        this.mtMVTTransAE = mtMVTTransAE;
    }

    public BigDecimal getMtMVTTransCP() {
        return mtMVTTransCP;
    }

    public void setMtMVTTransCP(BigDecimal mtMVTTransCP) {
        this.mtMVTTransCP = mtMVTTransCP;
    }

    public BigDecimal getMtMVTFondConAE() {
        return mtMVTFondConAE;
    }

    public void setMtMVTFondConAE(BigDecimal mtMVTFondConAE) {
        this.mtMVTFondConAE = mtMVTFondConAE;
    }

    public BigDecimal getMtMVTFondConCP() {
        return mtMVTFondConCP;
    }

    public void setMtMVTFondConCP(BigDecimal mtMVTFondConCP) {
        this.mtMVTFondConCP = mtMVTFondConCP;
    }

    public BigDecimal getMtMVTDepaAE() {
        return mtMVTDepaAE;
    }

    public void setMtMVTDepaAE(BigDecimal mtMVTDepaAE) {
        this.mtMVTDepaAE = mtMVTDepaAE;
    }

    public BigDecimal getMtMVTDepaCP() {
        return mtMVTDepaCP;
    }

    public void setMtMVTDepaCP(BigDecimal mtMVTDepaCP) {
        this.mtMVTDepaCP = mtMVTDepaCP;
    }

    public BigDecimal getMtMVTReportCrediAE() {
        return mtMVTReportCrediAE;
    }

    public void setMtMVTReportCrediAE(BigDecimal mtMVTReportCrediAE) {
        this.mtMVTReportCrediAE = mtMVTReportCrediAE;
    }

    public BigDecimal getMtMVTReportCrediCP() {
        return mtMVTReportCrediCP;
    }

    public void setMtMVTReportCrediCP(BigDecimal mtMVTReportCrediCP) {
        this.mtMVTReportCrediCP = mtMVTReportCrediCP;
    }

    public BigDecimal getMtFinalAE() {
        return mtFinalAE;
    }

    public void setMtFinalAE(BigDecimal mtFinalAE) {
        this.mtFinalAE = mtFinalAE;
    }

    public BigDecimal getMtFinalCP() {
        return mtFinalCP;
    }

    public void setMtFinalCP(BigDecimal mtFinalCP) {
        this.mtFinalCP = mtFinalCP;
    }

    public BigDecimal getMtTotalMVTAE() {
        return mtTotalMVTAE;
    }

    public void setMtTotalMVTAE(BigDecimal mtTotalMVTAE) {
        this.mtTotalMVTAE = mtTotalMVTAE;
    }

    public BigDecimal getMtTotalMVTCP() {
        return mtTotalMVTCP;
    }

    public void setMtTotalMVTCP(BigDecimal mtTotalMVTCP) {
        this.mtTotalMVTCP = mtTotalMVTCP;
    }

    public BigDecimal getMtEngAE() {
        return mtEngAE;
    }

    public void setMtEngAE(BigDecimal mtEngAE) {
        this.mtEngAE = mtEngAE;
    }

    public BigDecimal getMtEngCP() {
        return mtEngCP;
    }

    public void setMtEngCP(BigDecimal mtEngCP) {
        this.mtEngCP = mtEngCP;
    }

    public BigDecimal getMtMandatORD() {
        return mtMandatORD;
    }

    public void setMtMandatORD(BigDecimal mtMandatORD) {
        this.mtMandatORD = mtMandatORD;
    }

    public BigDecimal getMtOPnonRegul() {
        return mtOPnonRegul;
    }

    public void setMtOPnonRegul(BigDecimal mtOPnonRegul) {
        this.mtOPnonRegul = mtOPnonRegul;
    }

    public BigDecimal getMtPaye() {
        return mtPaye;
    }

    public void setMtPaye(BigDecimal mtPaye) {
        this.mtPaye = mtPaye;
    }

    public BigDecimal getNbreMandat() {
        return nbreMandat;
    }

    public void setNbreMandat(BigDecimal nbreMandat) {
        this.nbreMandat = nbreMandat;
    }

    public BigDecimal getMtLiquide() {
        return mtLiquide;
    }

    public void setMtLiquide(BigDecimal mtLiquide) {
        this.mtLiquide = mtLiquide;
    }


    public String getImputation() {
        return imputation;
    }

    public void setImputation(String imputation) {
        this.imputation = imputation;
    }
}














