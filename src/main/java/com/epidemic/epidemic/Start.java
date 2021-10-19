package com.epidemic.epidemic;

import com.epidemic.epidemic.model.Population;
import com.epidemic.epidemic.model.Simulation;
import com.epidemic.epidemic.repository.PopulationRepo;
import com.epidemic.epidemic.repository.SimulationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private SimulationRepo simulationRepo;
    private PopulationRepo populationRepo;

    @Autowired
    public Start(SimulationRepo simulationRepo, PopulationRepo populationRepo) {
        this.simulationRepo = simulationRepo;
        this.populationRepo = populationRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init(){
        Simulation simulation = new Simulation("Covid-19", 1000000000L, 1000000L, 1.1,
                0.0225, 14, 130, 100);

        Long Pi = simulation.getI();
        Long Pm = Double.valueOf(Pi * simulation.getM()).longValue();
        Long Pr = Pi  - Pm;
        Long Pv = simulation.getP() - Pi - Pm - Pr;

        System.out.println("Epidemia: " + simulation.getN());
        System.out.println("Liczba populacji: " + simulation.getP());
        System.out.println("--------------------------------------");
        System.out.println("Liczba osób zarazonych: " + Pi);
        System.out.println("Liczba osób zdrowych: " + Pv);
        System.out.println("Liczba osób zmarlych: " + Pm);
        System.out.println("Liczba osób ktore wyzdrowialy: " + Pr);
        System.out.println("--------------------------------------");
        System.out.println("Suma: " + (Pi + Pv + Pm + Pr));

        Population initialPopulation = new Population(Pi, Pv, Pm, Pr);

        simulationRepo.save(simulation);
    }
}
