package org.javarush.bigtask;

import org.javarush.bigtask.model.Model;

/**
 * Created by Alexey on 17.02.2016.
 */
public class Controller {

    private Model model;

    public Controller(Model model) {
        if (model == null) throw new IllegalArgumentException();

        this.model = model;
    }

    public void onCitySelect(String cityName) {
        model.selectCity(cityName);
    }
}
