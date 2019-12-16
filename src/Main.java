import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        TextField tekstiväli = new TextField();
        Button btn = new Button();
        btn.setText("Prindi haha");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println(tekstiväli.getText());
            }
        });



        HBox mainLayout = new HBox();
        StackPane root = new StackPane();
        mainLayout.getChildren().add(btn);
        mainLayout.getChildren().add(tekstiväli);
        root.getChildren().add(mainLayout);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}