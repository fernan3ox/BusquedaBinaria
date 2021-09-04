/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernandito
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[]={2,4,6,8,10,12,14,16,18,20};
        
        int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
        
        
        
        
        int busqueda= busquedaBinaria(arreglo,dato);
        
        if(busqueda!=-1){
            JOptionPane.showMessageDialog(null, "El dato fue encontrado en la posicion : "+busqueda);
            
            
        }else{
            JOptionPane.showMessageDialog(null,"El dato no se encontro");
            
        }
        
        
        
        
    }
    private static int busquedaBinaria(int arreglos[], int datos){
        
        int centro, inferior=0, superior=arreglos.length-1;
        
        while(inferior<=superior){
            
            centro =(inferior+superior)/2;
            if (arreglos[centro]== datos) {
                
                return centro;
            }else if(datos<arreglos[centro]){
                
                superior=centro-1;
            }else if(datos>centro){
                inferior=centro+1;
                
            } 
            
            
        }
        
        return -1;
        
    }
    
}
