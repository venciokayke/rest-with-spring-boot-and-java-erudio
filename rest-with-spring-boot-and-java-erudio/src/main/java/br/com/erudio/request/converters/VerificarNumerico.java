package br.com.erudio.request.converters;

public class VerificarNumerico {
    public static boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false; //verifica se está vazio
        String number = strNumber.replace(",", "."); //converte 13,0 para 13.0

        return (number.matches("[-+]?[0-9]*\\.?[0-9]+")); //verifica se é um número válido
    }
}
