package Ui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UiController implements Initializable{
    @FXML private AnchorPane root;
    @FXML private TextField textField_uName;
    @FXML private TextField textField_uPass;
    @FXML private javafx.scene.control.Button loginButton;
    @FXML private TextArea uiTextArea;
    @FXML private TextField userName_Tfield;
    @FXML private TextField userAge_Tfield;
    @FXML private TextField userProba_Tfield;
    @FXML private Label desen;
    @FXML private Label poezie;
    @FXML private Label comori;
    @FXML private TextField category_Tfield;
    @FXML private TextField proba_Tfield;



    @FXML
    public void showNames(ActionEvent event){
        this.uiTextArea.setText("work-in-progress");
    }

    public void setLabels(){

        String desenT="Nr. de concurenti la desen";
        String poezieT="Nr. de concurenti la poezie";
        String comoriT="Nr. de concurenti la comori";
        this.desen.setText(desenT);
        this.poezie.setText(poezieT);
        this.comori.setText(comoriT);
    }

    @FXML
    public void addContestant(ActionEvent event){
       // service.addNewConcurent(this.userName_Tfield.getText(),this.userProba_Tfield.getText(),Integer.parseInt(this.userAge_Tfield.getText()));
        this.userName_Tfield.setPromptText("Nume");
        this.userAge_Tfield.setPromptText("Varsta");

        this.uiTextArea.setText("work-in-progress");
        this.userProba_Tfield.setPromptText("Proba");

        this.setLabels();
    }

    @FXML
    public void searchByCategory(ActionEvent event){
        this.uiTextArea.setText("work-in-progress");
    }

    @FXML
    public void searchByProba(ActionEvent event){
        this.uiTextArea.setText("work-in-progress");
    }

    @FXML
    public void login(ActionEvent event)throws IOException{

//        if(aRepo.check(this.textField_uPass.getText(),this.textField_uName.getText())){
//            Parent root = FXMLLoader.load(getClass().getResource("/MainView.fxml"));
//
//            Scene secondScene = new Scene(root,600,400);
//            Stage primaryStage = (Stage)this.textField_uName.getScene().getWindow();
//        primaryStage.setScene(secondScene);
//        }
//        else
//            System.out.print("Fail");

    }

    @FXML
    public void showAllConcurenti(ActionEvent event){
        this.uiTextArea.setText("");
        this.uiTextArea.setText("work-in-progress");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }

    public TextField getCategory_Tfield() {
        return category_Tfield;
    }

    public TextArea getUiTextArea() {
        return uiTextArea;
    }
}
