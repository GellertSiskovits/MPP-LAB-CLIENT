package server;

import Ui.UiController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ServerClientTest extends Application {
    Parent root;
    Scene scene;
    UiController uiController = new UiController();

    public  void start(Stage stage) {

        //  Menu.run();
        try {
            root = FXMLLoader.load(getClass().getResource("/UiFX.fxml"));

            scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            ServerClient myServer = new ServerClient("127.0.0.1", uiController);

            stage.show();
            myServer.startRunning();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
