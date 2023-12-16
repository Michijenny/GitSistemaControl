/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_method.modelo;

/**
 *
 * @author enriq
 */
public abstract class FigurasGeometricas {
    
    // Método plantilla que define la estructura general para calcular el área y el perímetro
  public void calcular() {
    double area = calcularArea();
    double perimetro = calcularPerimetro();
    
    System.out.println("\nÁrea: " + area);
    System.out.println("Perímetro: " + perimetro);
  }
  
  // Métodos abstractos que deben ser implementados por las subclases
  public abstract double calcularArea();
  public abstract double calcularPerimetro();

}
