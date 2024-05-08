package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
    public Pane alerte;

    public Button submit;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        alerte.setVisible(false);
    }
    
    public void valider(ActionEvent actionEvent) throws IOException {
      
            FXMLLoader pageQuiz= new FXMLLoader(LoginController.class.getResource("LogGUI.fxml"));
            Scene quizpage= new Scene(pageQuiz.load(), 534, 500);
            Stage stage =(Stage) submit.getScene().getWindow();
            stage.setScene(quizpage);
            stage.setResizable(false);
            stage.setTitle("PAGE DE QUIZZ");
            stage.show();

        }

    


}
