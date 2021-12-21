package ru.kpfu.itis.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientApp extends Application {

    private static final String FXML_FILE_NAME = "/fxml/main.fxml";

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Мессенджер");
        Parent root = FXMLLoader.load(getClass().getResource(FXML_FILE_NAME));

        stage.setScene(new Scene(root));

        stage.setWidth(728);
        stage.setHeight(500);
        stage.setFullScreen(false);
        stage.setResizable(false);

        stage.show();
    }
}
