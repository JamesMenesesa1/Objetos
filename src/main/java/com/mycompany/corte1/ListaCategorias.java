/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corte1;



import java.util.ArrayList;
import java.util.List;

public class ListaCategorias {
    List<Categoria> categoriaList;

    public ListaCategorias(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public ListaCategorias() {
        this.categoriaList = new ArrayList<>();
    }

    public void addCategoriaToList(Categoria c){
        this.categoriaList.add(c);
    }

    public void showList(){
        for (Categoria c: this.categoriaList ){
            c.showInfo();
        }
    }

}