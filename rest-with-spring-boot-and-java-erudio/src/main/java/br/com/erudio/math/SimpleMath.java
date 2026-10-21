package br.com.erudio.math;

public class SimpleMath {

    public static Double sum(Double numeroUm, Double numeroDois){
        return numeroUm + numeroDois;
    }
    public static Double sub(Double numeroUm, Double numeroDois){
        return numeroUm - numeroDois;
    }
    public static Double div(Double numeroUm, Double numeroDois){
        return numeroUm / numeroDois;
    }
    public static Double mult(Double numeroUm, Double numeroDois){
        return numeroUm * numeroDois;
    }
    public static Double mean(Double numeroUm, Double numeroDois){
        return (numeroUm + numeroDois) / 2;
    }
    public static Double sqr(Double numeroUm){
        return Math.pow(numeroUm, 2);
    }

}
