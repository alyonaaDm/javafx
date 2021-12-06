package ru.kpfu.itis.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import ru.kpfu.itis.Card;
import ru.kpfu.itis.controller.MainSceneController;

import java.io.InputStream;
import java.util.ArrayList;

public class Main extends Application {

    private static final String FXML_FILE_NAME = "/fxml/Main.fxml";
    private static final int NUM_OF_CARDS = 24;
    private static final int NUM_OF_PAIRS = NUM_OF_CARDS/2;

    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> openCards = new ArrayList<Card>();

    private Card secondCardOpened;
    int NUM_CLICKS = 2;


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResourceAsStream(FXML_FILE_NAME));
        Scene scene = new Scene(root);

        primaryStage.setTitle("Memory Game");
        primaryStage.setScene(scene);
        primaryStage.setWidth(1200);
        primaryStage.setHeight(800);

//        MainSceneController mainSceneController = fxmlLoader.getController();
//        scene.setOnKeyPressed(mainSceneController.);

        InputStream iconStream = getClass().getResourceAsStream("/icon.jpg");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        primaryStage.show();

    }


}
