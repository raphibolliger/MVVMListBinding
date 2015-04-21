package sample;

import com.sun.javafx.css.SimpleSelector;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by raphi on 20.04.15.
 */
public class ViewModel {

    private PersonController personController;

    public ViewModel() {
        personController = new PersonController();
        list.addAll(personController.getPersonList());
    }

    private ObservableList<PersonModel> list = FXCollections.observableList(new ArrayList<PersonModel>());

    protected SimpleStringProperty text = new SimpleStringProperty();

    protected SimpleListProperty<PersonModel> bla = new SimpleListProperty<PersonModel>(list);

    protected SimpleStringProperty btnText = new SimpleStringProperty();

    protected BooleanProperty btnState = new SimpleBooleanProperty();

    protected void btnSetInput()
    {
        for (int i = 0; i < 1000; i++) {
            list.add(new PersonModel(text.getValue(), Integer.toString(i)));
        }
    }

    protected void removeListElement(Object o) {
        list.remove(o);
    }

}
