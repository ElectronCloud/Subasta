/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import data.*;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author Juan
 */
public class Ventana {
    private StackPane layout;
    private TableView<Proyecto> tabla;
    private Scene scene;
    private TableColumn<Proyecto, String> nombreProyecto;
    private TableColumn<Proyecto, String> duennosProyectos;
    private TableColumn<Proyecto, String> aportanteFinal;
    private TableColumn<Proyecto, String> precio;
    private TableColumn<Proyecto, String> intereses;
    
    public Ventana() {
        this.tabla = new TableView();
        this.nombreProyecto = new TableColumn<>("Proyecto");
        this.duennosProyectos = new TableColumn<>("Promotor");
        this.aportanteFinal = new TableColumn<>("Aportante Final");
        this.precio = new TableColumn<>("Precio");
        this.intereses = new TableColumn<>("Intereses");
        this.tabla.getColumns().add(nombreProyecto);
        this.tabla.getColumns().add(duennosProyectos);
        this.tabla.getColumns().add(aportanteFinal);
        this.tabla.getColumns().add(precio);
        this.tabla.getColumns().add(intereses);
        this.layout = new StackPane();
        this.layout.getChildren().add(tabla);
        this.scene = new Scene(layout, 600, 400);
        
        nombreProyecto.prefWidthProperty().bind(tabla.widthProperty().multiply(0.2));
        duennosProyectos.prefWidthProperty().bind(tabla.widthProperty().multiply(0.2));
        aportanteFinal.prefWidthProperty().bind(tabla.widthProperty().multiply(0.2));
        precio.prefWidthProperty().bind(tabla.widthProperty().multiply(0.2));
        intereses.prefWidthProperty().bind(tabla.widthProperty().multiply(0.2));
        
        
        this.nombreProyecto.setCellValueFactory(
                new PropertyValueFactory<>("nombreProyecto")
        );
                
        this.duennosProyectos.setCellValueFactory(
                new PropertyValueFactory<>("duennoProyecto")
        );
        
        this.aportanteFinal.setCellValueFactory(
                new PropertyValueFactory<>("aportanteFinal")
        );
        
        /*this.precio.setCellFactory(
                new PropertyValueFactory<>("precioInicial")
        );
                
        this.intereses.setCellFactory(
                new PropertyValueFactory<>("tasaInteresAportanteFinal")
        );*/
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

    public TableColumn<Proyecto, String> getNombreProyecto() {
        return nombreProyecto;
    }

    public TableColumn<Proyecto, String> getDuennosProyectos() {
        return duennosProyectos;
    }

    public TableColumn<Proyecto, String> getAportanteFinal() {
        return aportanteFinal;
    }

    public TableColumn<Proyecto, String> getPrecio() {
        return precio;
    }

    public TableColumn<Proyecto, String> getIntereses() {
        return intereses;
    }
    
    
    
}
