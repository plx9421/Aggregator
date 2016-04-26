package org.javarush.bigtask.model;

import org.javarush.bigtask.vo.Vacancy;

import java.util.List;

/**
 * Created by Alexey on 17.02.2016.
 */
public interface Strategy {
    List<Vacancy> getVacancies(String searchString);
}
