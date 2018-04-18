/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
//import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.input.MouseButton;
//import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Mario
 */
public class JavaFXApplication2 extends Application {
    
    // To add click-drag functionality, declare variables
    // that will hold mouseX, mouseY, nodeX, nodeY.
    private Group m_Pants;
    
    @Override
    public void start(Stage stage) throws Exception {
        m_Pants = new Group();
        
        String vb_border = "-fx-border-color: black;\n" +
                           "-fx-border-insets: 5;\n" +
                           "-fx-border-width: 3;\n" +
                           "-fx-border-style: solid;\n";
        
        VBox vbox = new VBox();
        vbox.setStyle(vb_border);
        vbox.getChildren().addAll(new Button("Add Statement"), new Button("New Branch"), new Button("Terminate"));
        
        m_Pants.getChildren().add(vbox);
        Group root = new Group();
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        root.getChildren().add(m_Pants);
        Scene scene = new Scene(root, 400, 400);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   
    
}
