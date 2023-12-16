/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.modelo;

/**
 *
 * @author enriq
 */
public class Circulo extends FigurasGeometricas {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public double calcularArea() {
         return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }
    
    
    
}
