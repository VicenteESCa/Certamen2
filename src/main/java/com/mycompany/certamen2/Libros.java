/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class libros {
    
    public final ArrayList<novela> librosNovela = new ArrayList<>();
    public final ArrayList<academico> librosAcademico = new ArrayList<>();
    public final ArrayList<Pucv> librosPUCV = new ArrayList<>();

    public ArrayList<novela> getLibrosNovela() {
        return librosNovela;
    }

    public ArrayList<academico> getLibrosAcademico() {
        return librosAcademico;
    }

    public ArrayList<Pucv> getLibrosPUCV() {
        return librosPUCV;
    }

    public void CrearLibros(){
     librosNovela[0]= new novela.CrearDatos;
    }
    
    
}
