package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Long> {

    // Recherche un budget par année
    Optional<Budget> findByAnnee(Integer annee);

    // Recherche tous les budgets pour une année donnée
    List<Budget> findAllByAnnee(Integer annee);

//    // Recherche les budgets d'un ministère spécifique pour une année
//    List<Budget> findByMinistere_CodeMiniAndAnnee(String codeMini, Integer annee);
//
//    // Vous pouvez ajouter d'autres méthodes de recherche par des combinaisons d'attributs
//    List<Budget> findByMinistere_CodeMiniAndAnneeAndTypeBudget_CodeTypeBudget(String codeMini, Integer annee, String codeTypeBudget);

}
