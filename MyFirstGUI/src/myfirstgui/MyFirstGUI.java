/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author gerashabanets
 */
public class MyFirstGUI extends Application {
    int count = 0;
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Hello"); //creates a button object
        btn.setText("Say 'Hello World'"); // resets the value
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 300); //dimensions of the window
        //width x height
        
        primaryStage.setTitle("Title"); //what is says on top if the window
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //when the button is clicked - print that
                count++;
                System.out.println(count + ". Hello World!");
                
                primaryStage.setTitle("" + count);
                  
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
