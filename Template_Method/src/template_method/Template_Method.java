/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package template_method;

import template_method.modelo.Circulo;
import template_method.modelo.Cuadrado;
import template_method.modelo.FigurasGeometricas;

/**
 *
 * @author enriq
 */
public class Template_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FigurasGeometricas cuadrado = new Cuadrado(4);
        cuadrado.calcular();
    
        FigurasGeometricas circulo = new Circulo(5);
        circulo.calcular();
    }
    
}
