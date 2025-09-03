package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.TypeBudget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeBudgetRepository extends JpaRepository<TypeBudget, Integer> {
}

