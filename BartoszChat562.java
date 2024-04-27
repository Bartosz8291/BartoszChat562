import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BartoszChat562 extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextArea chatLog = new TextArea();
        TextField messageInput = new TextField();
        messageInput.setPromptText("Type your message here...");
        messageInput.setOnAction(event -> {
            String message = messageInput.getText();
            if (!message.trim().isEmpty()) {
                chatLog.appendText(message + "\n");
                messageInput.clear();
            }
        });

        VBox root = new VBox(chatLog, messageInput);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BartoszChat562");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
