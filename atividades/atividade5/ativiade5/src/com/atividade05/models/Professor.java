package com.atividade05.models;

public class Professor {
    public String nome;
    public String mat;

    public double areaTriangulo(double a, double b){
        return (b * a) / 2;
    }

    public double areaCirculo(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public double equacao1grau(double a, double b){
        return -b / a;
    }

}
