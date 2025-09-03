package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.NatureDepense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NatureDepenseRepository extends JpaRepository<NatureDepense, Integer> {
}
