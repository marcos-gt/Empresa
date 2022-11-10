package academy.dedojo.OO.dominio;

public class Calculadora {
    public void operacao(int tipo, double n1, double n2, double... n3) {

        switch (tipo) {
            case 1:
                double soma = 0;
                soma += n1 + n2;
                if (n3.length > 0) {
                    for (double i : n3) {
                        soma += i;
                    }
                }
                System.out.println("Soma: " + soma);
                break;
            case 2:
                int sub = 0;
                if (n3.length > 0) {
                    for (double i : n3) {
                        sub -= i;
                    }
                }
                sub -= n1;
                sub -= n2;
                System.out.println("Subtração total é: " + sub);
                break;
            case 3:
                int mult = 1;
                if (n3.length > 0) {
                    for (double i : n3) {
                        mult *= i;
                    }
                }
                mult *= n1 * n2;
                System.out.println("Multiplicação total é: " + mult);
                break;
            case 4:
                double div = 1;
                div = n1 / n2;
                if (n3.length > 0) {
                    for (double i : n3) {
                        div /= i;
                    }
                }
                System.out.println("Divisão total é: " + div);
                break;
        }
    }
}
