/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corte1;

/**
 *
 * @author Jamex
 */

public class Categoria {
private String codigo;
private String nombre;
private double ganancia;

    public Categoria() {
    }

    public Categoria(String codigo, String nombre, double ganancia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ganancia = ganancia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public void showInfo(){
        System.out.println(this.getCodigo());
        System.out.println(this.getNombre());
        System.out.println(this.getGanancia());
    }
}

