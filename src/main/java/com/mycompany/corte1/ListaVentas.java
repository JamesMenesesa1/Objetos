/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corte1;



import java.util.ArrayList;
import java.util.List;

public class ListaVentas {
    private List <Venta> ventaList;

    public ListaVentas(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    public ListaVentas() {
        this.ventaList = new ArrayList<>();
    }

    public void addVentaToList(Venta v){
        this.ventaList.add(v);
    }

    public void showList(){
        for (Venta v: this.ventaList){
            v.showInfo();
        }
    }
    
    public void generarTotal(ListaArticulos listaArticulos){
        for (Venta venta :ventaList){
            venta.calcularTotal(listaArticulos);
        }
        
    }
    
    
}





    




