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
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableColumn<Proyecto, String> nombresProyectos;
    private TableColumn<Proyecto, String> duennosProyectos;

    public Ventana() {
        this.tabla = new TableView();
        this.nombresProyectos = new TableColumn<>("Proyectos existentes");
        this.duennosProyectos = new TableColumn<>("Promotor del proyecto");
        this.tabla.getColumns().add(nombresProyectos);
        this.tabla.getColumns().add(duennosProyectos);
        this.layout = new StackPane();
        this.layout.getChildren().add(tabla);
        this.scene = new Scene(layout, 600, 400);
        
        this.nombresProyectos.setCellValueFactory(
                new PropertyValueFactory<>("nombreProyecto")
        );
        
        this.duennosProyectos.setCellValueFactory(
                new PropertyValueFactory<>("duennoProyecto")
        );
        
    }
    
    public void mostrar(Stage stage) {
        stage.setTitle("Tabla");
        stage.setScene(scene);
        stage.show();
    }

    public StackPane getLayout() {
        return layout;
    }

    public void setLayout(StackPane layout) {
        this.layout = layout;
    }

    public TableView<Proyecto> getTabla() {
        return tabla;
    }

    public void setTabla(TableView<Proyecto> tabla) {
        this.tabla = tabla;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    
    
}
