package com.epidemic.epidemic.repository;

import com.epidemic.epidemic.model.Population;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopulationRepo extends JpaRepository<Population, Long> {
}
