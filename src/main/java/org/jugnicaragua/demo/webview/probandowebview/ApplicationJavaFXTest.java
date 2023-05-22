package org.jugnicaragua.demo.webview.probandowebview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationJavaFXTest extends Application {
    @Override
    public void start(Stage stage) throws IOException {
/*        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        FXMLLoader loader = new FXMLLoader(ApplicationJavaFXTest.class.getResource("Scene.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root);

        //stage.getIcons().add(new Image("icon.png"));
        //stage.setTitle("Bro web browser");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}