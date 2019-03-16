/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import data.*;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Juan
 */
public class ControladorVentana {
    private Ventana ventana;
    private Modelo modelo;
    private ArrayList<Proyecto> proyectos;

    public ControladorVentana(Modelo modelo) {
        this.ventana = new Ventana();
        this.proyectos = modelo.getGestor().getProyectos();
        
        ObservableList<Proyecto> oProyecto = FXCollections.observableArrayList(modelo.getGestor().getProyectos());
        
        this.ventana.getTabla().setItems(oProyecto);
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
    
    
    
}
    