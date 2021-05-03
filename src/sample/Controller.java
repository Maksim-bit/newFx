package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.awt.*;

public class Controller {
    @FXML
    public Button btnAdd;
    @FXML
    public TextArea textArea;
    private int task=0;
    private String currentTopic;

    public void clickBtnAdd(ActionEvent actionEvent) {
        currentTopic = "Кнопка";
        task++;
        textArea.clear();
        textArea.appendText(Integer.toString(task));
        textArea.appendText("\n\n");
    }
}
