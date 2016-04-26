package org.javarush.bigtask.model;

import org.javarush.bigtask.view.View;
import org.javarush.bigtask.vo.Vacancy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 20.02.2016.
 */
public class Model {
    private View view;
    private Provider[] providers;

    public Model(View view, Provider[] providers) {
        if (view == null) throw new IllegalArgumentException();
        if (providers == null) throw new IllegalArgumentException();
        if (providers.length == 0) throw new IllegalArgumentException();

        this.view = view;
        this.providers = providers;
    }

    public void selectCity(String city) {
        List<Vacancy> vacancies = new ArrayList<>();
        for (Provider p : providers) {
            vacancies.addAll(p.getJavaVacancies(city));
        }
        view.update(vacancies);
    }
}
