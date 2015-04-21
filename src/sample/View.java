package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class View extends ViewModel {


    @FXML
    private TextField textInput;

    @FXML
    private Button submitButton;

    @FXML
    private ListView textList;

    @FXML
    private Button removeButton;

    @FXML
    private void initialize() {
        textInput.textProperty().bindBidirectional(super.text);
        //submitButton.textProperty().bindBidirectional(super.btnText);
        submitButton.disableProperty().bindBidirectional(super.btnState);
        textList.itemsProperty().bindBidirectional(super.bla);
    }

    @FXML
    private void btnClicked() {
        super.btnSetInput();
    }

    @FXML
    private void btnRemoveClicked() {
        Object o = textList.getSelectionModel().getSelectedItem();
        super.removeListElement(o);
    }

    @FXML
    private void keyPressedRemove() {
        Object o = textList.getSelectionModel().getSelectedItem();
        super.removeListElement(o);
    }

}
