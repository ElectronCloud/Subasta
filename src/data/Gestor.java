/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Gloria
 */
public class Gestor {
    private double fondosTotales;
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Promotor> promotoresTotales;
    private ArrayList<Aportante> aportantesTotales;
    
    public Gestor(){
        this.fondosTotales = 0;
        this.proyectos = new ArrayList<>();
        this.promotoresTotales = new ArrayList<>();
        this.aportantesTotales = new ArrayList<>();
    }

    public double getFondosTotales() {
        return fondosTotales;
    }

    public void setFondosTotales(double fondosTotales) {
        this.fondosTotales = fondosTotales;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<Promotor> getPromotoresTotales() {
        return promotoresTotales;
    }

    public void setPromotoresTotales(ArrayList<Promotor> promotoresTotales) {
        this.promotoresTotales = promotoresTotales;
    }

    public ArrayList<Aportante> getAportantesTotales() {
        return aportantesTotales;
    }

    public void setAportantesTotales(ArrayList<Aportante> aportantesTotales) {
        this.aportantesTotales = aportantesTotales;
    }
    
    
    
    public Proyecto crearProyecto(String nombre, Promotor promotor, double precioInicial, double precioReserva, double tasaDecrecimiento){
        Proyecto proyecto = new Proyecto(nombre, promotor, precioInicial, precioReserva, tasaDecrecimiento);
        this.proyectos.add(proyecto);
        return proyecto;
    }
    
    public Promotor crearPromotor(String ID){
        Promotor promotor = new Promotor(ID);
        this.promotoresTotales.add(promotor);
        return promotor;
    }
    
    public Aportante crearAportante(String ID, double tasaInteres, int plazo, double precioAceptable){
        Aportante aportante = new Aportante(ID, tasaInteres, plazo, precioAceptable);
        this.aportantesTotales.add(aportante);
        return aportante;
    }
    
    
}
