package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class TestController {

    @FXML
    private TextField titleField;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private DatePicker endDatePicker;
    @FXML
    private TextField timeField;
    @FXML
    private CheckBox selfCorrectingCheckBox;
    @FXML
    private CheckBox showResultCheckBox;

    public void cancelAction() {
        Stage stage = (Stage) titleField.getScene().getWindow();
        stage.close();
    }

    public void nextAction() {
        String title = titleField.getText();
        LocalDate startDate = startDatePicker.getValue();
        LocalDate endDate = endDatePicker.getValue();
        int time = Integer.parseInt(timeField.getText());
        boolean selfCorrecting = selfCorrectingCheckBox.isSelected();
        boolean showResult = showResultCheckBox.isSelected();
    }

    public void saveAction() {
    }
}
