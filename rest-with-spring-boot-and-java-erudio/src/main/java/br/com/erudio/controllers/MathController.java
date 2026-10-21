package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.tomcat.util.http.parser.HttpParser.isNumeric;

@RestController
@RequestMapping("/math")
public class MathController {

       // http://localhost:8080/math/sum/3/5
       @RequestMapping("/sum/{numeroUm}/{numeroDois}")
       public Double sum(@PathVariable("numeroUm") String numeroUm,@PathVariable("numeroDois") String numeroDois) throws Exception {
           if(!isNumeric(numeroUm) || !isNumeric(numeroDois)) throw new IllegalArgumentException();
           return convertToDouble(numeroUm) + convertToDouble(numeroDois);
       }

    private boolean isNumeric(String strNumber) {
           if (strNumber == null || strNumber.isEmpty()) return false; //verifica se está vazio
           String number = strNumber.replace(",", "."); //converte 13,0 para 13.0

           return (number.matches("[-+]?[0-9]*\\.?[0-9]+")); //verifica se é um número válido
    }

    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty()) throw new IllegalArgumentException();
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

}
