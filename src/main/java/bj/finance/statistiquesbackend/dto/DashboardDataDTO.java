// Dans un nouveau package 'bj.finance.statistiquesbackend.dto' par exemple
package bj.finance.statistiquesbackend.dto;

import bj.finance.statistiquesbackend.entity.Budget;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class DashboardDataDTO {
    private BigDecimal totalEngageAE;
    private BigDecimal totalOrdonnace;
    private BigDecimal totalOP;
    private BigDecimal tauxEngage;
    private BigDecimal tauxOrdonnance;
    private List<Budget> budgets;
}