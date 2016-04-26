package org.javarush.bigtask;


import org.javarush.bigtask.model.HHStrategy;
import org.javarush.bigtask.model.Model;
import org.javarush.bigtask.model.MoikrugStrategy;
import org.javarush.bigtask.model.Provider;
import org.javarush.bigtask.view.HtmlView;

/**
 * Created by Alexey on 17.02.2016.
 */
public class Aggregator {
    public static void main(String[] args) {
        HtmlView view = new HtmlView();

        view.setController(new Controller(
                new Model(view,
                        new Provider[]{new Provider(new HHStrategy()), new Provider(new MoikrugStrategy())})));

        view.userCitySelectEmulationMethod();
    }
}
