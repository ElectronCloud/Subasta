/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe;
import data.*;
import gui.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Gloria
 */
public class Main extends Application{
    public static void main(String[] args) {
       
        
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
         Gestor plataforma = new Gestor();
        Promotor productor1 = new Promotor("51663");
        Aportante aportante = plataforma.crearAportante("Juan", 28, 4, 1400);
        Aportante aportante2 = plataforma.crearAportante("Pedro", 4, 1, 1900);
        Proyecto proyecto1 = plataforma.crearProyecto("VR", productor1, 2000, 1200, 100);
        proyecto1.annadirAportante(aportante);
        proyecto1.annadirAportante(aportante2);
        proyecto1.fijarPrestamista();
        
        Modelo modelo = new Modelo(plataforma);
        ControladorVentana ventana = new ControladorVentana(modelo);
        ventana.getVentana().mostrar(primaryStage);
        //ventana.mostrar(primaryStage);
        
    }
}