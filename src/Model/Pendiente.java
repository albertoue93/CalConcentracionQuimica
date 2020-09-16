/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Math.pow;

/**
 *
 * @author Priscilla Moraga
 */
public class Pendiente {

    private float X1;
    private float X2;
    private float X3;
    private float X4;
    private float Y1;
    private float Y2;
    private float Y3;
    private float Y4;
    private float sumaX;
    private float sumaY;
    private float sumaXY;
    private float sumaXCuadrado;
    private float sumaYCuadrado;
    private float cuadradoSumaX;
    private float sumaXPorSumaY;

    public Pendiente(){
        X1 = 0;
        X2 = 0;
        X3 = 0;
        X4 = 0;
        Y1 = 0;
        Y2 = 0;
        Y3 = 0;
        Y4 = 0;
        sumaX = 0;
        sumaY = 0;
        sumaXY = 0;
        sumaXCuadrado = 0;
        sumaYCuadrado = 0;
        cuadradoSumaX = 0;
        sumaXPorSumaY = 0;
    }

    public float getSumaYCuadrado() {
        return sumaYCuadrado;
    }
    public float getX1() {
        return X1;
    }

    public void setX1(float X1) {
        this.X1 = X1;
    }

    public float getX2() {
        return X2;
    }

    public void setX2(float X2) {
        this.X2 = X2;
    }

    public float getY1() {
        return Y1;
    }

    public void setY1(float Y1) {
        this.Y1 = Y1;
    }

    public float getY2() {
        return Y2;
    }

    public void setY2(float Y2) {
        this.Y2 = Y2;
    }
    public float getX3() {
        return X3;
    }

    public void setX3(float X3) {
        this.X3 = X3;
    }

    public float getY3() {
        return Y3;
    }

    public void setY3(float Y3) {
        this.Y3 = Y3;
    }
    public float getX4() {
        return X4;
    }

    public void setX4(float X4) {
        this.X4 = X4;
    }
    public float getY4() {
        return Y3;
    }

    public void setY4(float Y4) {
        this.Y4 = Y4;
    }

    public float getSumaX(){
        return sumaX;
    }
    public float getSumaY(){
        return sumaY;
    }
    public float getSumaXY(){
        return sumaXY;
    }
    public float getSumaXCuadrado() {
        return sumaXCuadrado;
    }

    public float getCuadradoSumaX() {
        return cuadradoSumaX;
    }

    public float getSumaXPorSumaY() {
        return sumaXPorSumaY;
    }

    public float calcularM(){
        
        float numerador;
        float denominador;
        float m;
        float N = 3;
        //numerador
        sumaXY = (X1*Y1)+(X2*Y2)+(X3*Y3);
        sumaX = X1 + X2 + X3;
        sumaY = Y1 + Y2 + Y3;
        sumaXPorSumaY = sumaX * sumaY;
        //fin numerador
        //denominador
        sumaXCuadrado = (float) pow(X1,2) + (float) pow(X2,2) + (float) pow(X3,2);
        sumaYCuadrado = (float) pow(Y1,2) + (float) pow(Y2,2) + (float) pow(Y3,2);
        cuadradoSumaX = (float) pow(sumaX,2);
        //fin denominador
        numerador = (N * sumaXY - sumaXPorSumaY);
        denominador = (N * sumaXCuadrado - cuadradoSumaX);
        m = numerador / denominador;
        return m;
    }
    
    public float calcularM4(){
        
        float numerador;
        float denominador;
        float m;
        float N = 4;
        //numerador
        sumaXY = (X1*Y1)+(X2*Y2)+(X3*Y3)+(X4*Y4);
        sumaX = X1 + X2 + X3 + X4;
        sumaY = Y1 + Y2 + Y3 + Y4;
        sumaXPorSumaY = sumaX * sumaY;
        //fin numerador
        //denominador
        sumaXCuadrado = (float) pow(X1,2) + (float) pow(X2,2) + (float) pow(X3,2) + (float) pow(X4,2);
        sumaYCuadrado = (float) pow(Y1,2) + (float) pow(Y2,2) + (float) pow(Y3,2) + (float) pow(Y4,2);
        cuadradoSumaX = (float) pow(sumaX,2);
        //fin denominador
        numerador = (N * sumaXY - sumaXPorSumaY);
        denominador = (N * sumaXCuadrado - cuadradoSumaX);
        m = numerador / denominador;
        return m;
    }
    
    
}//CLASS
