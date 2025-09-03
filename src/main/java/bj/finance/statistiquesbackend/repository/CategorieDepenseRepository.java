package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.CategorieDepense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDepenseRepository extends JpaRepository<CategorieDepense, Integer> {
}
