package academy.empresa.metodos;

import academy.empresa.dominio.Departamento;
import academy.empresa.dominio.Funcionario;

import java.util.Scanner;
import java.util.*;


public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        String []nomes = new String[]{"joao","maria","pedro","jose","carlos","marcos","julio","juliana","mariana","marcelo"};
        int opcao;
        int qtd;
        float salario;
        Departamento departamentoOp = new Departamento("Frentista");
        Departamento departamentoGe = new Departamento("Gerente");
        Departamento departamentoCa = new Departamento("Caixa");
        Departamento departamentoPe = new Departamento("Perigo");

        System.out.println("Quantos funcionarios você gostaria de adicionar?");
        qtd = input.nextInt();

        Funcionario[] funcionarios = new Funcionario[qtd];
        for (int i = 0; i < qtd; i++) {

            System.out.println("Digite o departamento do funcionario: 1-Frentista, 2-Gerente, 3-Caixa, 4-Perigo");
            opcao = input.nextInt();
            System.out.println("Digite o nome do funcionario: ");
            nome = input.next();
            System.out.println("Digite o salario do funcionario: ");
            salario = input.nextFloat();
            switch (opcao) {
                case 1:
                    funcionarios[i] = new Funcionario(nome,departamentoOp,salario);
                    departamentoOp.setFuncionarios(new Funcionario[]{funcionarios[i]});
                    break;
                case 2:
                    Funcionario funcionarioGe = new Funcionario(nome, departamentoPe, salario);
                    funcionarios[i] = funcionarioGe;
                    departamentoGe.setFuncionarios(new Funcionario[]{funcionarioGe});
                    break;
                case 3:
                    Funcionario funcionarioCa = new Funcionario(nome, departamentoCa, salario);
                    funcionarios[i] = funcionarioCa;
                    departamentoCa.setFuncionarios(new Funcionario[]{funcionarioCa});
                    break;
                case 4:
                    Funcionario funcionarioPe = new Funcionario(nome, departamentoCa, salario);
                    funcionarios[i] = funcionarioPe;
                    departamentoPe.setFuncionarios(new Funcionario[]{funcionarioPe});
                    break;
            }

        }

        System.out.println("Digite o departamento que você gostaria de ver: 1-Frentista, 2-Gerente, 3-Caixa, 4-Perigo");
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                departamentoOp.imprimirDep();
                break;
            case 2:
                departamentoGe.imprimirDep();
                break;
            case 3:
                departamentoCa.imprimirDep();
                break;
            case 4:
                departamentoPe.imprimirDep();
                break;
        }
        System.out.println("-----");
        //funcionarioOp.imprimirRelatorioFuncionario();
        //funcionarioGe.imprimirRelatorioFuncionario();
    }
}
