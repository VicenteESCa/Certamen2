/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class Pucv extends libro{
    private String institucion;

    public Pucv(String institucion, String titulo, String autor, int codigo, int precio) {
        super(titulo, autor, codigo, precio);
        this.institucion = institucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    
    @Override
    public String consultarTipo() {
        return "Tipo: libro de la PUCV";
    }
    
    public void CrearDato(){
        new Pucv("Ing Informatica","POO","yo",777,2500);
    }
}
