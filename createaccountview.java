import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class createaccountview extends Application {

    private static final String CREATE_ACCOUNT_FXML = "AATBanksCreateAccount.fxml";

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(CREATE_ACCOUNT_FXML));
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("AAT BANKS - Create Account");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error loading " + CREATE_ACCOUNT_FXML);
        }
    }
}