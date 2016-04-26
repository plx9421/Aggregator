package org.javarush.bigtask.model;

import org.javarush.bigtask.vo.Vacancy;

import java.util.List;

/**
 * Created by Alexey on 17.02.2016.
 */
public class Provider {
    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString) {
        return strategy.getVacancies(searchString);
    }
}
