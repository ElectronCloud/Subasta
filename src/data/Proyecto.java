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
public class Proyecto {
    private String nombre;
    private Promotor promotor;
    private ArrayList<Aportante> aportantesProyecto;
    private double precioInicial;
    private double precioActual = 0;
    private double precioReserva;
    private double tasaDecrecimiento;
    private Aportante aportanteFinal;

    public Proyecto(String nombre, Promotor promotor, double precioInicial, double precioReserva, double tasaDecrecimiento) {
        this.nombre = nombre;
        this.promotor = promotor;
        this.aportantesProyecto = new ArrayList<>();
        this.precioInicial = precioInicial;
        this.precioActual = precioInicial;
        this.precioReserva = precioReserva;
        this.tasaDecrecimiento = tasaDecrecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Aportante> getAportantesProyecto() {
        return aportantesProyecto;
    }

    public void setAportantesProyecto(ArrayList<Aportante> aportantes) {
        this.aportantesProyecto = aportantes;
    }

    public double getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(double precioInicial) {
        this.precioInicial = precioInicial;
    }

    public double getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(double precioReserva) {
        this.precioReserva = precioReserva;
    }

    public Promotor getPromotor() {
        return promotor;
    }

    public void setPromotor(Promotor promotor) {
        this.promotor = promotor;
    } 
    
    public boolean annadirAportante(Aportante aportante){
        aportantesProyecto.add(aportante);
        return true;
    }

    public Aportante getAportanteFinal() {
        return aportanteFinal;
    }

    public void setAportanteFinal(Aportante aportanteFinal) {
        this.aportanteFinal = aportanteFinal;
    }

    public double getTasaDecrecimiento() {
        return tasaDecrecimiento;
    }

    public void setTasaDecrecimiento(double tasaDecrecimiento) {
        this.tasaDecrecimiento = tasaDecrecimiento;
    }
    
    
    public boolean fijarPrestamista(){
        while(aportanteFinal == null){
            for(Aportante aportante : this.aportantesProyecto){
                if(aportante.getPrecioAceptable() == this.precioActual || aportante.getPrecioAceptable() == this.precioReserva){
                    this.aportanteFinal = aportante;
                } else if(this.precioActual >= this.precioReserva) {
                    this.precioActual -= this.tasaDecrecimiento;
                }
            }
        }
        return true;
    }
    
}
