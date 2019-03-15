/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import data.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author Gloria
 */
public class Ventana {
    private StackPane layout;
    private TableView<Proyecto> tabla;
    private Scene scene;
    private TableColumn<Proyecto, String> proyectos;

    public Ventana() {
        this.tabla = new TableView();
        this.proyectos = new TableColumn<>("Proyectos existentes");
        this.tabla.getColumns().add(proyectos);
        this.layout = new StackPane();
        this.layout.getChildren().add(tabla);
        this.scene = new Scene(layout, 600, 400);
    }
    
    public void mostrar(Stage stage) {
        stage.setTitle("Tabla");
        stage.setScene(scene);
        stage.show();
    }
    
}
