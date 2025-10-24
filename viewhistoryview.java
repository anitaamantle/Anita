import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewHistoryView extends Application {

    private static final String FXML_FILE = "ViewHistory.fxml";

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(FXML_FILE));
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("AAT BANKS - Transaction History");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error loading " + FXML_FILE);
        }
    }
}