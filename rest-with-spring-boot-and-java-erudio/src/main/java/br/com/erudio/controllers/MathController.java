package br.com.erudio.controllers;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.ConverterDouble;
import br.com.erudio.request.converters.VerificarNumerico;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numeroUm}/{numeroDois}")
    public Double sum(@PathVariable("numeroUm") String numeroUm,@PathVariable("numeroDois") String numeroDois) throws Exception {
        if(!VerificarNumerico.isNumeric(numeroUm) || !VerificarNumerico.isNumeric(numeroDois)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        return SimpleMath.sum(ConverterDouble.convertToDouble(numeroUm), ConverterDouble.convertToDouble(numeroDois));
    }

    @RequestMapping("/sub/{numeroUm}/{numeroDois}")
    public Double sub(@PathVariable("numeroUm") String numeroUm,@PathVariable("numeroDois") String numeroDois) throws Exception {
        if(!VerificarNumerico.isNumeric(numeroUm) || !VerificarNumerico.isNumeric(numeroDois)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        return SimpleMath.sub(ConverterDouble.convertToDouble(numeroUm), ConverterDouble.convertToDouble(numeroDois));
    }

    @RequestMapping("/div/{numeroUm}/{numeroDois}")
    public Double div(@PathVariable("numeroUm") String numeroUm,@PathVariable("numeroDois") String numeroDois) throws Exception {
        if(!VerificarNumerico.isNumeric(numeroUm) || !VerificarNumerico.isNumeric(numeroDois)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        return SimpleMath.div(ConverterDouble.convertToDouble(numeroUm), ConverterDouble.convertToDouble(numeroDois));
    }

    @RequestMapping("/mult/{numeroUm}/{numeroDois}")
    public Double mult(@PathVariable("numeroUm") String numeroUm,@PathVariable("numeroDois") String numeroDois) throws Exception {
        if(!VerificarNumerico.isNumeric(numeroUm) || !VerificarNumerico.isNumeric(numeroDois)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        return SimpleMath.mult(ConverterDouble.convertToDouble(numeroUm), ConverterDouble.convertToDouble(numeroDois));
    }

    @RequestMapping("/mean/{numeroUm}/{numeroDois}")
    public Double mean(@PathVariable("numeroUm") String numeroUm,@PathVariable("numeroDois") String numeroDois) throws Exception {
        if(!VerificarNumerico.isNumeric(numeroUm) || !VerificarNumerico.isNumeric(numeroDois)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        return SimpleMath.mean(ConverterDouble.convertToDouble(numeroUm), ConverterDouble.convertToDouble(numeroDois));
    }

    @RequestMapping("/sqr/{numeroUm}")
    public Double sqr(@PathVariable("numeroUm") String numeroUm) throws Exception {
        if(!VerificarNumerico.isNumeric(numeroUm)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        return SimpleMath.sqr(ConverterDouble.convertToDouble(numeroUm));
    }

}
