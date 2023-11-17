/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

/**
 *
 * @author Estudiante
 */
public class novela extends libro {
    private String tipoNovela;
    private ArrayList<novela> librosNovela = new ArrayList<novela>();
    
    librosNovela[0] = novela("asd", "asff", 435, 645);
    
    public novela(String tipoNovela, String titulo, String autor, int codigo, int precio) {
        super(titulo, autor, codigo, precio);
        this.tipoNovela = tipoNovela;
    }

    public String getTipoNovela() {
        return tipoNovela;
    }

    public void setTipoNovela(String tipoNovela) {
        this.tipoNovela = tipoNovela;
    }
    
    
    @Override
    public String consultarTipo() {
        return "Tipo: novela";
    }
    public void CrearDatos(){
        this.tipoNovela="Historica";
        new novela("Historica","Don quijote","Miguel de cervantes",1231,123214);
        
    }
    

}
