package academy.devdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /** Tipos primitivos
         // int, double, float, char, byte, short, long, boolean **/
        String data = "10/10/2020";
        float salarioFloat = 2500;
        String nome = "Marcos";
        String end = "Rua 1";
        System.out.println("Eu " + nome + ", moro no endereço " + end);
        System.out.println("\nConfirmo que recebi o salario: " + salarioFloat);
        System.out.println("\nNa data: " + data);
        vet2();
    }

    public static void vet2() {
        int[][] dias = new int[3][3];
        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[0][2] = 29;
        dias[1][0] = 28;
        dias[1][1] = 30;
        dias[1][2] = 31;
        dias[2][0] = 30;
            for (int [] dia : dias) {
                for (int mes : dia) {
                    System.out.println(mes);
                }
            }


    }

    public static void vet() {
        char [] nomes = {'M','a','r','c','o','s'};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
    public static void condi() {
        int parcela = 1000;
        int valorCarro = 30000;
        int qtdParcelas = valorCarro / parcela;
        if (qtdParcelas > 48) {
            qtdParcelas = 48;
            System.out.println("A quantidade de parcelas foi alterada para: " + qtdParcelas);
            System.out.println("o valor da parcela ficou: " + valorCarro / qtdParcelas);
        }
        System.out.println("A qtd max de parcelas é: " + qtdParcelas + "no valor de: " + parcela);
    }

    public static void count() {
        for (int i = 1; i <= 100; i++) {
            int n = 1;
            int controlador = 0;
            while (n <= i) {
                if (i % n == 0) {
                    controlador++;

                    if (controlador == 2 && n == i) {
                        System.out.println("O número " + i + " é primo");
                    }
                }
                n++;
            }
        }
    }
}