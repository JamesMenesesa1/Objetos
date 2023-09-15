/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corte1;


import java.util.ArrayList;
import java.util.List;

public class ListaArticulos {
     private   List <Articulo> articuloList;


    public ListaArticulos(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }
    
    public void showList(){
        for (Articulo articulo :articuloList){
            articulo.showInfo();
        }
    }
    
    public ListaArticulos() {
        articuloList = new ArrayList<>();
    }

     public void addArticuloToList(Articulo a){
        this.articuloList.add(a);

    }
     
      public void generarGanancias(ListaCategorias listaCategorias){
        for(Articulo a: articuloList){
            a.setGanancia(listaCategorias);
        }
    }
      
    public List<Articulo> getArticuloList() {
        return articuloList;
    }
  
    

    


   
    
  

}




