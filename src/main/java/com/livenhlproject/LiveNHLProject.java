package com.livenhlproject;

import com.livenhlproject.Controllers.HomeController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LiveNHLProject extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LiveNHLProject.class.getResource("home.fxml"));
        HomeController homeController = new HomeController();
        fxmlLoader.setController(homeController);
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        stage.show();
        homeController.print();
    }

    public static void main(String[] args) {
        launch();
    }
}