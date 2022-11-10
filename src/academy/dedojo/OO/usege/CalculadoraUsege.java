package academy.dedojo.OO.usege;

import academy.dedojo.OO.dominio.Calculadora;
public class CalculadoraUsege {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int soma = 1;
        int sub = 2;
        int mult = 3;
        int div = 4;
        calc.operacao(soma,2,3,4,5,6);
        calc.operacao(sub,500,200,10,5,6);
        calc.operacao(mult,2,3,2,2);
        calc.operacao(div,300,3,4,5);
    }
}
