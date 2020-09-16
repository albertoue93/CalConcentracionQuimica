/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Priscilla Moraga
 */
public class EcuacionLineal {
    private float sumaY;
    private float sumaX;
    private float b;
    private float m;

    public float getSumaY() {
        return sumaY;
    }

    public void setSumaY(float sumaY) {
        this.sumaY = sumaY;
    }

    public float getSumaX() {
        return sumaX;
    }

    public void setSumaX(float sumaX) {
        this.sumaX = sumaX;
    }

    public float getB() {
        return b;
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }
    
    public float calcularB(){
        
        float numerador = sumaY - m * sumaX;
        float N =3;
        b = numerador / N;
        
        return b;
    }
    
    public float calcularB4(){
        
        float numerador = sumaY - m * sumaX;
        float N =4;
        b = numerador / N;
        
        return b;
    }
    
    public float calcularFX(float x){
        float y =0;
        y = m*x + b;
        return y;
    }
    
    
}
