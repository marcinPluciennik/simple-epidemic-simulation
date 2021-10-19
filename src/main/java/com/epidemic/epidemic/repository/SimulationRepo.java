package com.epidemic.epidemic.repository;

import com.epidemic.epidemic.model.Simulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulationRepo extends JpaRepository<Simulation, Long> {
}
