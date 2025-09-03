package bj.finance.statistiquesbackend.repository;

import bj.finance.statistiquesbackend.entity.Ministere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinistereRepository extends JpaRepository<Ministere, Integer> {
}