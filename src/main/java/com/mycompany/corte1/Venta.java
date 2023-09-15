/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corte1;


public class Venta {
    private String codigo;
    private String codigoArticulo;
    private String nombre;
    private double cantidad;
    private double precio;
    private double subtotal;

    public Venta() {
    }

    public Venta(String codigo, String codigoArticulo, double cantidad) {
        this.codigo = codigo;
        this.codigoArticulo = codigoArticulo;
        this.nombre=nombre;
        this.cantidad = cantidad;
        this.precio=0.0;
        this.subtotal=0.0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
    

    public void showInfo(){
        System.out.println("Codigo "+this.getCodigo());
        System.out.println("Categoria articulo:  "+this.getCodigoArticulo());
        System.out.println("Nombre: "+ this.getNombre());
        System.out.println("Cantidad "+this.getCantidad());
        System.out.println("Precio unidad:  "+ this.getPrecio());
        System.out.println("Subtotal:  "+this.getSubtotal());
        System.out.println("  ");
    }
    
    public void calcularTotal(ListaArticulos listaArticulos){
        for (Articulo articulo : listaArticulos.getArticuloList()){
            if (articulo.getCodigo() == this.codigoArticulo){
                this.precio=articulo.getGanancia();
              this.nombre=articulo.getNombre();
            this.subtotal=this.precio*this.cantidad;
            }
            
        }
    }
    
    
    
    

}


