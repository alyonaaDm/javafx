package ru.kpfu.itis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello world Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);

        InputStream iconStream = getClass().getResourceAsStream("/img.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        //Label helloWorldLabel = new Label("Hello world!");
       // helloWorldLabel.setAlignment(Pos.CENTER);
        //Scene primaryScene = new Scene(helloWorldLabel);
        //primaryStage.setScene(primaryScene);

        //primaryStage.show();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/main.fxml"));
        MainSceneController controller = loader.getController();

        primaryStage.show();
    }


}
