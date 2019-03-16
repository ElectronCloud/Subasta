/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.*;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Gloria
 */
public class Modelo {
    private Gestor gestor;
    private SimpleStringProperty nombreProyecto;
    private SimpleStringProperty duennoProyecto;
    private SimpleDoubleProperty precioInicial;
    private SimpleStringProperty aportanteFinal;
    private SimpleDoubleProperty tasaInteresAportanteFinal;

    public Modelo(Gestor gestor) {
        this.gestor = gestor;
        for(int i=0; i<gestor.getProyectos().size(); i++){
        this.nombreProyecto = new SimpleStringProperty(gestor.getProyectos().get(i).getNombre());
        this.duennoProyecto = new SimpleStringProperty(gestor.getProyectos().get(i).getPromotor().getID());
        this.aportanteFinal = new SimpleStringProperty(gestor.getProyectos().get(i).getAportanteFinal().getID());
        this.precioInicial = new SimpleDoubleProperty(gestor.getProyectos().get(i).getPrecioInicial());
        this.tasaInteresAportanteFinal = new SimpleDoubleProperty(gestor.getProyectos().get(i).getAportanteFinal().getTasaInteres());
        }
        }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    
    
    
}