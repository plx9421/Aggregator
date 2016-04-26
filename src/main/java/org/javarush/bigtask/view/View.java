package org.javarush.bigtask.view;

import org.javarush.bigtask.Controller;
import org.javarush.bigtask.vo.Vacancy;

import java.util.List;

/**
 * Created by Alexey on 20.02.2016.
 */
public interface View {
    void update(List<Vacancy> vacancies);

    void setController(Controller controller);
}
