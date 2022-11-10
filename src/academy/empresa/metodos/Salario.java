package academy.empresa.metodos;

import academy.empresa.dominio.Departamento;
import academy.empresa.dominio.Funcionario;

import java.util.Scanner;
import java.util.*;


public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int opcao;
        int qtd;
        float salario;
        Departamento departamentoOp = new Departamento("Frentista");
        Departamento departamentoGe = new Departamento("Gerente");
        Departamento departamentoCa = new Departamento("Caixa");
        Departamento departamentoPe = new Departamento("Perigo");

        System.out.println("Digite o departamento do funcionario: 1-Frentista, 2-Gerente, 3-Caixa, 4-Perigo");
        opcao = input.nextInt();
        System.out.println("Quantos funcionarios você gostaria de adicionar?");
        qtd = input.nextInt();

        Funcionario[] funcionarios = new Funcionario[qtd];
        for (int i = 0; i < qtd; i++) {


            System.out.println("Digite o nome do funcionario: ");
            nome = input.next();
            System.out.println("Digite o salario do funcionario: ");
            salario = input.nextFloat();
            if(opcao ==1) {
                funcionarios[i] = new Funcionario(nome, departamentoOp, salario);
            }else if(opcao ==2) {
                funcionarios[i] = new Funcionario(nome, departamentoGe, salario);
            }else if(opcao ==3) {
                funcionarios[i] = new Funcionario(nome, departamentoCa, salario);
            }else if(opcao ==4) {
                funcionarios[i] = new Funcionario(nome, departamentoPe, salario);
            }
        }
        System.out.println("Digite o departamento que você gostaria de ver: 1-Frentista, 2-Gerente, 3-Caixa, 4-Perigo");
        switch (input.nextInt()) {
            case 1:
                departamentoOp.setFuncionarios(funcionarios);
                departamentoOp.imprimirDep();
                break;
            case 2:
                departamentoGe.setFuncionarios(funcionarios);
                departamentoGe.imprimirDep();
                break;
            case 3:
                departamentoCa.setFuncionarios(funcionarios);
                departamentoCa.imprimirDep();
                break;
            case 4:
                departamentoPe.setFuncionarios(funcionarios);
                departamentoPe.imprimirDep();
                break;
        }
        System.out.println("-----");
    }
}
