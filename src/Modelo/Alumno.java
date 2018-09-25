/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author PEDRO
 */
public class Alumno {
    
    private String nombre;
    private String localidad;
    private ArrayList <Modulo> modulos;

    public Alumno(String nombre, String localidad) {
        this.nombre = nombre;
        this.localidad = localidad;
        modulos = new ArrayList ();
    }

    public Alumno(String nombre, String localidad, ArrayList<Modulo> modulos) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.modulos = modulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public void añadirModulo (Modulo a){
        
        modulos.add(a);
        
    }
    
    public String [] getNombreModulos(){
        
        String aux [] = new String [this.modulos.size()];
        int contador = 0;
        
        for (Modulo m : modulos) {
            
            aux[contador] = m.getNombre();
            contador++;
        }
        
        return aux;
        
    }
    
    public double getNumerosHoras (){
        
        double total = 0;
        
        for (Modulo m : modulos) {
            
            total += m.getHoras();
            
        }
        
        return total;
        
    }
    
    
}
