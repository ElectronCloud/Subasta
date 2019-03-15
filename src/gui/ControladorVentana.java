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

/**
 *
 * @author Gloria
 */
public class ControladorVentana {
    private Ventana ventana;
    private Modelo modelo;
    private ArrayList<Proyecto> proyectos;

    public ControladorVentana(Modelo modelo) {
        this.ventana = new Ventana();
        this.proyectos = modelo.getGestor().getProyectos();
        ObservableList<Proyecto> oProyecto = FXCollections.observableArrayList(proyectos);
        
        this.ventana.getTabla().setItems(oProyecto);
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
    
    
    
}
