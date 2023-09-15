/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corte1;


import java.util.ArrayList;
import java.util.List;

public class Granero {

    public static void main(String[] args) {
       

        ListaCategorias categorias = new ListaCategorias();
        categorias.addCategoriaToList(new Categoria("0-A","Alimentos",0.10));
        categorias.addCategoriaToList(new Categoria("0-B","Aseo",0.15));

        ListaArticulos articulos = new ListaArticulos();
        articulos.addArticuloToList(new Articulo("001","Arroz","0-A",50,2500));
        articulos.addArticuloToList(new Articulo("002","Cafe","0-A",30,4000));
        articulos.addArticuloToList(new Articulo("003","Frijol","0-A",20,3000));
        articulos.addArticuloToList(new Articulo("010","Limpido","0-B",40,1200));
         articulos.addArticuloToList(new Articulo("06","Betun","0-B",40,5000));
        articulos.generarGanancias(categorias);
        
        
        ListaVentas ventas  = new ListaVentas();
        ventas.addVentaToList(new Venta("0-A","001",6));
        ventas.addVentaToList(new Venta("0-A","003",3));
        ventas.addVentaToList(new Venta("0-B","010",9));
        ventas.addVentaToList(new Venta("0-B","06",2));
        ventas.generarTotal(articulos);
      

        ventas.showList();
       
       


    }
}



