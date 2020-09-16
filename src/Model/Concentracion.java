/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Priscilla Moraga
 */
public class Concentracion {
    
    private float abs;
    private float b;
    private Pendiente m;
    private float r;

    public float getR() {
        return r;
    }
    public float getAbs() {
        return abs;
    }

    public void setAbs(float abs) {
        this.abs = abs;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public Pendiente getM() {
        return m;
    }

    public void setM(Pendiente m) {
        this.m = m;
    }
    
    public float calcularConcentracion(){
        float numerador = abs - b;
        float denominador = m.calcularM();
        float concentracion = numerador / denominador;
        return concentracion;
    }
    
    public float calcularConcentracion4(){
        float numerador = abs - b;
        float denominador = m.calcularM4();
        float concentracion = numerador / denominador;
        return concentracion;
    }
    
    public float calcularR(){
        float r_;
        float N = 3;
        float sumaXPorY = m.getSumaXY();
        float sumaX = m.getSumaX();
        float sumaY = m.getSumaY();
        float sumaXCuadrado = m.getSumaXCuadrado();
        float cuadradoSumaX = m.getCuadradoSumaX();
        float sumaYCuadrado = (float) pow(m.getY1(),2) + (float) pow(m.getY2(),2) + (float) pow(m.getY3(),2);
        float cuadradoSumaY = (float) pow(sumaY,2);
        float numerador = N * sumaXPorY - sumaX * sumaY;
        float denominador = ((N * sumaXCuadrado - cuadradoSumaX) * (N * sumaYCuadrado - cuadradoSumaY)  );
        float raizCuadrada = (float) sqrt(denominador);
        r_ = numerador / raizCuadrada;
        return r_;
    }
    
    public float calcularR4(){
        float r_;
        float N = 4;
        float sumaXPorY = m.getSumaXY();
        float sumaY = m.getSumaY();
        float suma = m.getSumaXPorSumaY();
        float sumaXCuadrado = m.getSumaXCuadrado();
        float cuadradoSumaX = m.getCuadradoSumaX();
        float sumaYCuadrado = m.getSumaYCuadrado();
        float cuadradoSumaY = (float) pow(sumaY,2);
        float numerador = N * sumaXPorY - suma;
        float denominador = ((N * sumaXCuadrado - cuadradoSumaX) * (N * sumaYCuadrado - cuadradoSumaY)  );
        float raizCuadrada = (float) sqrt(denominador);
        r_ = numerador / raizCuadrada;
        return r_;
    }
    
    
    
}


