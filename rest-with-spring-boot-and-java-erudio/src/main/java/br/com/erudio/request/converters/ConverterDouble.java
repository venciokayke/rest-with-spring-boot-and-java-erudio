package br.com.erudio.request.converters;

import br.com.erudio.exception.UnsupportedMathOperationException;

public class ConverterDouble {
    public static Double convertToDouble(String strNumber) throws UnsupportedMathOperationException {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedMathOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }
}
