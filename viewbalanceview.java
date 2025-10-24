import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewBalanceView extends Application {

    private static final String FXML_FILE = "ViewBalance.fxml";

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(FXML_FILE));
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("AAT BANKS - Account Overview");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error loading " + FXML_FILE);
        }
    }
}