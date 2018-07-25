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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gerashabanets
 */
public class Circle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
        String s = "12 1 2 3 4 5 6 7 8 91011";
        double dim = (s.length() * 30)/Math.PI * 4/3;
        double radius = (s.length() * 30)/2/Math.PI;
        Pane root = new Pane();

        
        double angle = 0;
        for(int i = 0; i < s.length(); i += 2){
           
            String small = s.substring(i, i+2);
            
            Text txt1 = new Text(small);
            
            double add = (360 / s.length());
            txt1.setX(radius * Math.cos(angle * Math.PI / 180 - Math.PI/2) + dim/2);
            txt1.setY(radius * Math.sin(angle * Math.PI / 180 - Math.PI/2) + dim/2);
            
            angle += 30;
            
            root.getChildren().add(txt1);
        }
        
        Scene scene = new Scene(root, dim, dim);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
