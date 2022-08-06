
package easy.mart;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Tafhim
 */
public class EasyMart extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("loginPage.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
       

        primaryStage.setTitle("Easy Mart");
        primaryStage.setScene(scene);
        primaryStage.show();
        
         primaryStage.setOnCloseRequest(event -> {
            event.consume();
            
            exitAction(primaryStage);
                }); 
    }

      private void exitAction(Stage primaryStage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to exit!");
        alert.setContentText("Do you want to leave ?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            primaryStage.close();
        }

    }
   
      
      
    public static void main(String[] args) {
        launch(args);
    }
    
}
