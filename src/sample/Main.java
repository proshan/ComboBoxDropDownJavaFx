package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window = primaryStage;
        window.setTitle("ComboBox");

        //Combobox is also a list of drop down options
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
            "Pingpong",
            "Chocolate",
            "Tiktok"
        );
        comboBox.setPromptText("Your favourite thing to do?");

        //comboBox already has event listener, so, it's simple to use the comboBox compared to choiceBox.
        comboBox.setOnAction(e -> {
            showSelected(comboBox);
        });




        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().add(comboBox);

        Scene scene = new Scene(layout, 250, 250);

        window.setScene(scene);
        window.show();
    }

    private void showSelected(ComboBox<String> c){
        System.out.println("You selected " + c.getValue());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
