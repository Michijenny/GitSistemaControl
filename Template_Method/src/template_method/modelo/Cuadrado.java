/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.modelo;

/**
 *
 * @author enriq
 */
public class Cuadrado extends FigurasGeometricas{
    
     private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
     
     

    @Override
    public double calcularArea() {
        return lado *lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
}
