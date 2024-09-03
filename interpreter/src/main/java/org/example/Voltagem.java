package org.example;

public class Voltagem {
    public static String formula = "valor1 * valor2";

    public static double calcularTensao(double valor1, double valor2) {
        String expressao;
        expressao = formula.replace("valor1", Double.toString(valor1));
        expressao = expressao.replace("valor2", Double.toString(valor2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
