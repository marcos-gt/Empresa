package academy.dedojo.OO.usege;

import academy.dedojo.OO.dominio.Funcionario;

public class FuncTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        int [] vetor = {1,2,3,4};
        Funcionario f2 = new Funcionario();
        f1.setNome("Marcos");
        f1.setIdade(30);
        f1.setSalario(new double[] { 1000, 2000, 3000 });
        f1.imprimirDados();

        for (int num: vetor) {
            System.out.print(num + " ");
        }

        f2.setNome("Maria");
        String nome = f1.getNome();
        System.out.println("\n"+nome);
        f2.setIdade(25);
        f2.setSalario(new double[] { 2000, 2000, 2000, 2000, 2000 });
        f2.imprimirDados();



    }
}
