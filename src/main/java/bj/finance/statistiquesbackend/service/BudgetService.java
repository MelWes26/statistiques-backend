package bj.finance.statistiquesbackend.service;

import bj.finance.statistiquesbackend.dto.DashboardDataDTO;
import bj.finance.statistiquesbackend.entity.Budget;
import bj.finance.statistiquesbackend.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BudgetService {
    private final BudgetRepository repository;

    public List<Budget> findAll() { return repository.findAll(); }
    public Optional<Budget> findById(Long id) { return repository.findById(id); }
    public Budget save(Budget e) { return repository.save(e); }
    public void deleteById(Long id) { repository.deleteById(id); }

    public Optional<Budget> findByYear(Integer year) {
        return repository.findByAnnee(year);
    }

    // Ajout des nouvelles méthodes de service
    public List<Budget> findAllByYear(Integer year) {
        return repository.findAllByAnnee(year);
    }




    public DashboardDataDTO getDashboardDataByYear(Integer year) {
        // 1. Récupérer tous les budgets pour l'année sélectionnée
        List<Budget> budgets = repository.findAllByAnnee(year);

        // 2. Calculer les totaux
        BigDecimal totalEngageAE = budgets.stream()
                .map(Budget::getMtEngAE)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalOrdonnace = budgets.stream()
                .map(Budget::getMtMandatORD)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal totalOP = budgets.stream()
                .map(Budget::getMtOPnonRegul)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        // 3. Calculer les taux
        BigDecimal totalBudgetInitial = budgets.stream()
                .map(Budget::getMtInitialAE)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        // Évite la division par zéro
        BigDecimal tauxEngage = BigDecimal.ZERO;
        if (totalBudgetInitial.compareTo(BigDecimal.ZERO) > 0) {
            tauxEngage = totalEngageAE.divide(totalBudgetInitial, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
        }

        BigDecimal tauxOrdonnance = BigDecimal.ZERO;
        if (totalBudgetInitial.compareTo(BigDecimal.ZERO) > 0) {
            tauxOrdonnance = totalOrdonnace.divide(totalBudgetInitial, 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
        }

        // 4. Construire et retourner le DTO
        return new DashboardDataDTO(
                totalEngageAE,
                totalOrdonnace,
                totalOP,
                tauxEngage,
                tauxOrdonnance,
                budgets
        );
    }







//
//
//
//    public List<Budget> findByMinistereAndYear(String codeMini, Integer year) {
//        return repository.findByMinistere_CodeMiniAndAnnee(codeMini, year);
//    }
//
//    // Vous pouvez également ajouter des méthodes avec une logique métier plus complexe
//    public BigDecimal calculerBudgetTotalPourAnnee(Integer year) {
//        List<Budget> budgets = repository.findAllByAnnee(year);
//        // Utilisation de Streams pour faire la somme des montants finaux
//        return budgets.stream()
//                .map(Budget::getMtFinalAE) // On prend le montant "AE"
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//    }
}